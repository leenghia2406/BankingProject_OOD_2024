package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import model.*;
import view.*;
import view.View;

public class ThanhToanVayController implements ActionListener {
	View view;
	LoginController loginController;
	public ThanhToanVayController(View view, ActionListener loginCon) {
        this.view = view;
        this.loginController = (LoginController) loginCon;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Thanh Toan Vay Btn")) {
			ObserverKH kh = loginController.getCurrentKhachHang();
			if (kh != null) {
				// hộp thoại yêu cầu nhập mã pin
				JPasswordField passwordField = new JPasswordField();
				int okCxl = JOptionPane.showConfirmDialog(null, passwordField, "Vui lòng nhập mã PIN",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				if (okCxl == JOptionPane.OK_OPTION) {
					String maPin = new String(passwordField.getPassword());
					int maPIN = Integer.parseInt(maPin);
					if (kh.getAccount().kiemTraMaPIN(maPIN)) {
						// hiển thị hộp thoại xác nhận thanh toán
						int dialogResult = JOptionPane.showConfirmDialog(view,
								"Bạn có chắc chắn muốn thanh toán khoản vay không?", "Xác nhận",
								JOptionPane.YES_NO_OPTION);
						if (dialogResult == JOptionPane.YES_OPTION) {
							// nếu chọn OK, thực hiện thanh toán vay
							if (kh.traNo(maPIN)) {
								JOptionPane.showMessageDialog(view,
										"Thanh toán vay thành công. Số dư tài khoản đã được trừ đi số tiền vay.");
							} else {
								JOptionPane.showMessageDialog(view,
										"Không thể thanh toán vay. Vui lòng kiểm tra lại số dư tài khoản.");
							}
						}
					} else {
						JOptionPane.showMessageDialog(view, "Mã PIN không chính xác. Vui lòng kiểm tra lại.");
					}
				}
			}

		}
	}
	
}
