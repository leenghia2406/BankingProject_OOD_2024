package controller;
import model.*;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class GuiTKController implements ActionListener {
    private View view;
	LoginController loginController;
    public GuiTKController(View view, ActionListener loginCon) {
        this.view = view;
    	this.loginController = (LoginController) loginCon;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Gui TK Button")) {
	        ObserverKH kh = loginController.getCurrentKhachHang();
	        if (kh != null) {
	        	kh.getAccount().setSoDu(5000000);
	            int soTienGui = Integer.parseInt(view.getSoTienGuiTxf().getText());
	            String soThangGuiString = view.getSoThangGuiComboBox().getItemAt(0);
	            String[] parts = soThangGuiString.split(" "); 
	            int soThangGui = Integer.parseInt(parts[0]); 
	            String maPin = new String(view.getMaPinGuiTKTxf().getPassword());
	            int maPIN = Integer.parseInt(maPin); 
	            GuiTietKiem guiTietKiem = new GuiTietKiem(soTienGui, soThangGui, view.getNoiDungGuiTxf().getText());
	            guiTietKiem.setLaiSuatThang(0.25);
	            if (kh.guiTietKiem(maPIN, guiTietKiem) == true) {
	                JOptionPane.showMessageDialog(view, "Gửi tiết kiệm thành công. Số tiền gửi: " + soTienGui +
	                		", số tháng gửi: " + soThangGui 
	                		+", lãi suất: "+guiTietKiem.getLaiSuatThang() +"%" 
	                		+", nội dung gửi: "+view.getNoiDungGuiTxf().getText());
	                kh.setGuiTietKiem(guiTietKiem);
	            } else {
	                JOptionPane.showMessageDialog(view, "Không thể gửi tiết kiệm. Vui lòng kiểm tra lại số tiền, số tháng gửi và mã PIN.");
	            }
			}
        }
    }
}

