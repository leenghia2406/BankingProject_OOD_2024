package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import model.Account;
import model.ChuyenTien;
import model.DichVu;
import model.GiaoDich;
import model.GuiTietKiem;
import model.HoaDon;
import model.HoaDonDien;
import model.HoaDonMang;
import model.HoaDonNuoc;
import model.KPlus;
import model.KhachHang;
import model.NetFlit;
import model.NganHang;
import model.ObserverKH;
import model.TocDo;
import model.TocDoCao;
import model.VayNganHang;
import view.View;

public class ThanhToanHdController implements ActionListener {
	View view;
	LoginController loginController;

	public ThanhToanHdController(View view, ActionListener loginCon) {
		this.view = view;
		this.loginController = (LoginController) loginCon;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("Xac Nhan Thanh Toan Hd Btn")) {
			ObserverKH kh = loginController.getCurrentKhachHang();
			if (kh != null) {
				String maHoaDon = view.getNhapMaHdTxf().getText();
				HoaDon hoaDon = kh.timHoaDonTheoMa(maHoaDon);
				JPasswordField passwordField = new JPasswordField();
				int okCxl = JOptionPane.showConfirmDialog(null, passwordField, "Vui lòng nhập mã PIN",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				if (okCxl == JOptionPane.OK_OPTION) {
					String maPin = new String(passwordField.getPassword());
					int maPIN = Integer.parseInt(maPin);
					if (kh.getAccount().kiemTraMaPIN(maPIN)) {
						int dialogResult = JOptionPane.showConfirmDialog(view, "Xác nhận thanh toán hóa đơn ?",
								"Xác nhận", JOptionPane.YES_NO_OPTION);
						if (dialogResult == JOptionPane.YES_OPTION) {
							if (hoaDon == null) {
								JOptionPane.showMessageDialog(view, "Không tìm thấy hóa đơn với mã: " + maHoaDon, "Lỗi",
										JOptionPane.ERROR_MESSAGE);
							} else if (hoaDon.getTrangThaiThanhToan()) {
								JOptionPane.showMessageDialog(view, "Hóa đơn đã được thanh toán", "Thông báo",
										JOptionPane.INFORMATION_MESSAGE);
							} else {
								if (hoaDon.thanhToanHoaDon(kh)) {
									JOptionPane.showMessageDialog(view,
											"Thanh toán thành công hóa đơn. Thông tin hóa đơn:\n" + hoaDon.inHoaDon(),
											"Thanh toán thành công", JOptionPane.INFORMATION_MESSAGE);
									// Cập nhật trạng thái hóa đơn trong phần xem hóa đơn
									hoaDon.setTrangThaiThanhToan(true);
								} else {
									JOptionPane.showMessageDialog(view,
											"Không đủ tiền để thanh toán hóa đơn. Số tiền yêu cầu: "
													+ hoaDon.getSoTien() + ", số tiền hiện có trong tài khoản: "
													+ kh.getAccount().getSoDu(),
											"Lỗi", JOptionPane.ERROR_MESSAGE);
								}
							}
						}
					} else {
						JOptionPane.showMessageDialog(view, "Mã PIN không chính xác. Vui lòng kiểm tra lại.", "Lỗi",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		}
	}

}
