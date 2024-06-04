package controller;

import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import model.Account;
import model.ChuyenTien;
import model.KhachHang;
import model.ObserverKH;
import view.View;

public class ChuyenTienController implements ActionListener {
	View view;
	LoginController loginController;

	public ChuyenTienController(View view, ActionListener loginCon) {
		this.view = view;
		this.loginController = (LoginController) loginCon;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("Chuyển Tiền")) {
			ObserverKH kh = loginController.getCurrentKhachHang();
			if (kh != null) {
				String maPinNhap = new String(view.getCheckPinFld().getPassword());
				if (kh.getAccount().kiemTraMaPIN(Integer.parseInt(maPinNhap))) { // ktra mã pin
					// mã pin đúng, chuyển tiền
					ChuyenTien ct = new ChuyenTien(Integer.parseInt(view.getSoTienChuyenTxf().getText()),
							view.getTkNguoiNhanTxf().getText(), view.getLoiNhanTxf().getText());
					ObserverKH khachHangNhan = null;
					for (ObserverKH khachHang : loginController.nganHang.getdSKhachHang()) {
						if (khachHang.getAccount().getSoTaiKhoan().equals(view.getTkNguoiNhanTxf().getText())) {
							khachHangNhan = khachHang;
						}
					}
					if (khachHangNhan != null) {
						if (ct.chuyenTien(kh, khachHangNhan) == true) {
							JOptionPane.showMessageDialog(view, "Chuyển thành công số tiền " + ct.getSoTien()
									+ " đến tài khoản " + khachHangNhan.getAccount().getSoTaiKhoan() + "Số dư còn lại: "
									+ kh.getAccount().getSoDu() + "\n" + "Lời nhắn: " + view.getLoiNhanTxf().getText(),
									"Thông báo", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(view, "Số tiền chuyển không hợp lệ");
						}
					} else if (khachHangNhan == null) {
						JOptionPane.showMessageDialog(view, "Không tìm thấy khách hàng với số tài khoản: "
								+ view.getTkNguoiNhanTxf().getText() + "\nVui lòng kiểm tra lại", "Thông báo",
								JOptionPane.ERROR_MESSAGE);
					}

				} else {
					// mã pin sai
					JOptionPane.showMessageDialog(view, "Mã PIN không chính xác. Vui lòng thử lại.", "Thông báo",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}

}
