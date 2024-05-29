package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import model.Account;
import model.KhachHang;
import model.ObserverKH;
import view.View;

public class ChangePinController implements ActionListener {
    View view;
	LoginController loginController;

    public ChangePinController(View view, ActionListener loginCon) {
    	this.view = view;
    	this.loginController = (LoginController) loginCon;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Doi Ma Pin Btn")) {
			ObserverKH kh = loginController.getCurrentKhachHang();
			if (kh != null) {
				String maPinCu = view.getNhapMaPinTxf().getText();
				String maPinMoi = view.getNhapPinmoiTxf().getText();
				String maPinXacNhan = view.getXacNhanPinmoiTxf().getText();
				if (kh.getAccount().kiemTraMaPIN(Integer.parseInt(maPinCu))) {
					if (maPinMoi.equalsIgnoreCase(maPinXacNhan)) {
						if (kh.getAccount().thayDoiMaPIN(Integer.parseInt(maPinCu), Integer.parseInt(maPinMoi))) {
							JOptionPane.showMessageDialog(view, "Đổi mã PIN thành công");
						} else {
							JOptionPane.showMessageDialog(view, "Không thể đổi mã PIN. Vui lòng thử lại.");
						}
					} else {
						JOptionPane.showMessageDialog(view, "Xác nhận mã PIN không đúng");
					}
				} else {
					JOptionPane.showMessageDialog(view, "Mã PIN không đúng");
				}
			}
		}
	}
    
}
