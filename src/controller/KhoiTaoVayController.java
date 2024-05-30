package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.*;
import view.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class KhoiTaoVayController implements ActionListener {
	View view;
	LoginController loginController;

	public KhoiTaoVayController(View view, ActionListener loginCon) {
		this.view = view;
		this.loginController = (LoginController) loginCon;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Xac Nhan Vay Btn")) {
			ObserverKH kh = loginController.getCurrentKhachHang();
			if (kh != null) {
				int soTienVay = Integer.parseInt(view.getSoTienVayTxf().getText());
				String soThangVayString = view.getSoThangVayCombobox().getSelectedItem().toString();
				String[] parts = soThangVayString.split(" ");
				int soThangVay = Integer.parseInt(parts[0]);
				String noiDungVay = view.getNoiDungVayTxf().getText();
				String soCCCD = view.getSoCCCDtxf().getText();
				// tạo khoản vay mới
				VayNganHang vayNganHang = new VayNganHang(soTienVay, soThangVay, noiDungVay, noiDungVay, soCCCD);
				JPasswordField pf = new JPasswordField();
				int okCxl = JOptionPane.showConfirmDialog(null, pf, "Vui lòng nhập mã PIN của bạn:",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				if (okCxl == JOptionPane.OK_OPTION) {
					String maPin = new String(pf.getPassword());
					int maPIN = Integer.parseInt(maPin);

					if (kh.vayTien(vayNganHang, soCCCD, maPIN) == true) {
						JOptionPane.showMessageDialog(view, "Khoản vay đã được khởi tạo thành công.");
						kh.setVay(vayNganHang);
					} else {
						JOptionPane.showMessageDialog(view,
								"Không thể khởi tạo khoản vay. Vui lòng kiểm tra lại thông tin.");
					}
				}
			}
		}
	}

}
