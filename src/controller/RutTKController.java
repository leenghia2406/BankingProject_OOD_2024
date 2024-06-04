package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import model.Account;
import model.KhachHang;
import model.ObserverKH;
import view.View;

public class RutTKController implements ActionListener {
	private View view;
	LoginController loginController;

	public RutTKController(View view, ActionListener loginCon) {
		this.view = view;
		this.loginController = (LoginController) loginCon;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Rut TK Button")) {
			ObserverKH kh = loginController.getCurrentKhachHang();
			if (kh != null) {
				if (kh.getGuiTietKiem() != null) {
					JPasswordField passwordField = new JPasswordField();
					int okCxl = JOptionPane.showConfirmDialog(null, passwordField, "Vui lòng nhập mã PIN",
							JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
					if (okCxl == JOptionPane.OK_OPTION) {
						String maPin = new String(passwordField.getPassword());
						int maPIN = Integer.parseInt(maPin);
						// Kiểm tra mã pin hợp lệ
						if (kh.getAccount().kiemTraMaPIN(maPIN)) {
							int dialogResult = JOptionPane.showConfirmDialog(view,
									"Bạn có chắc chắn muốn rút tiết kiệm không?", "Xác nhận",
									JOptionPane.YES_NO_OPTION);
							if (dialogResult == JOptionPane.YES_OPTION) {
								// chọn Yes thì rút tiền
								if (kh.rutTietKiem(maPIN)) {
									JOptionPane.showMessageDialog(view,
											"Rút tiết kiệm thành công. Số tiền gửi tiết kiệm đã được cộng dồn vào số dư tài khoản."
											, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
									kh.setGuiTietKiem(null);
								} else {
									JOptionPane.showMessageDialog(view,
											"Không thể rút tiết kiệm. Vui lòng kiểm tra lại.",
											"Lỗi", JOptionPane.ERROR_MESSAGE);
								}
							}
						} else {
							JOptionPane.showMessageDialog(view, "Mã PIN không chính xác. Vui lòng kiểm tra lại.", "Lỗi",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				} else if (kh.getGuiTietKiem() == null) {
					JOptionPane.showMessageDialog(view, "Bạn hiện không có khoản tiết kiệm nào!", "Thông báo",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}

}
