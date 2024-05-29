package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import model.*;
import view.*;

public class ChangePassController implements ActionListener{
    View view;
    LoginController loginController;
    public ChangePassController(View view, ActionListener loginCon) {
		// TODO Auto-generated constructor stub
    	this.view = view;
    	this.loginController = (LoginController) loginCon;
    	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();

		if (src.equals("Doi Mat Khau Btn")) {
			ObserverKH kh = loginController.getCurrentKhachHang();
			if (kh != null) {
				if (kh.getAccount().thayDoiMatKhau(view.getNhapPassTxf().getText(), view.getNhapPassmoiTxf().getText(),
						view.getXacNhanPassmoiTxf().getText()) == true) {
					JOptionPane.showMessageDialog(view, "Đổi mật khẩu thành công");
				} else if (!kh.getAccount().getMatKhau().equals(view.getNhapPassTxf().getText())) {
					JOptionPane.showMessageDialog(view, "Mật khẩu không đúng");
				} else if (!view.getNhapPassmoiTxf().getText().equals(view.getXacNhanPassmoiTxf().getText())) {
					JOptionPane.showMessageDialog(view, "Mật khẩu xác nhận không đúng");
				}
			}
		}
	}
	
}
