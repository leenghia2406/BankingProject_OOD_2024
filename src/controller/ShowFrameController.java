
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import model.*;
import view.*;
/**
 *
 * @author TRONG NGHIA
 */
public class ShowFrameController implements ActionListener{
    View view;
    LoginController loginController;
	Account acc1 = new Account("9999", "1234", 123);
	Account acc2 = new Account("1111", "1234", 111);
	LocalDate ngaySinh1 = LocalDate.of(2004, 6, 24);
	LocalDate ngaySinh2 = LocalDate.of(2004, 1, 1);
	KhachHang khachHang1 = new KhachHang("KH01", "Le Trong Nghia", ngaySinh1, "Tây Hồ, Hà Nội",
			"999999999", "01230123", "trongnghia@gmail.com", acc1);
	KhachHang khachHang2 = new KhachHang("KH01", "Huynh Hoai Linh", ngaySinh2, "Thu Duc, TP.HCM",
			"88888888", "223334444", "hoailinhgay@gmail.com", acc2);
	HoaDon hdDien = new HoaDonDien("111111", "9999", 50.0);
	HoaDon hdNuoc = new HoaDonNuoc("222222", "9999", 30.0);
	HoaDon hdMangNet = new HoaDonMang("333333", "9999");
	HoaDon hdMangK = new HoaDonMang("444444", "9999");
	DichVu net = new NetFlit(hdMangNet);
	DichVu kplus = new KPlus(hdMangK);
	TocDo tdCao = new TocDoCao(net);
	GiaoDich chuyenTien = new ChuyenTien(0, null, null);
	GuiTietKiem tk = new GuiTietKiem(0, 0, null);
	VayNganHang vay = new VayNganHang(0, 0, null, null, null);
	NganHang nganHang = NganHang.getInstance();
    public ShowFrameController(View view, ActionListener loginCon){
    	this.view = view;
    	this.loginController = (LoginController)  loginCon;
    	khachHang1.getAccount().setSoDu(5000000);
		nganHang.themKhachHang(khachHang1);
		nganHang.themKhachHang(khachHang2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Xem Sd")) {
			ObserverKH kh = loginController.getCurrentKhachHang();
			if (kh != null) {
				JOptionPane.showMessageDialog(view, kh.getAccount().kiemTraSoDu() +"đ", "Kiểm tra số dư ", -1);
			}
		}else if (src.equals("Hóa Đơn")) {
			view.showHoaDonFrame();
		}else if (src.equals("Đổi Mật Khẩu")) {
			view.showChangePassFrame();
		}else if (src.equals("Đổi Mã PIN")) {
			view.showChangePinFrame();
		}else if (src.equals("Chuyển Tiền")) {
			view.showChuyenTienFrame();
		}else if (src.equals("Vay Tiền")) {
			view.showVaytienFrame();
		}else if (src.equals("Tiết Kiệm")) {
			view.showTietKiemFrame();
		}else if (src.equals("Xem Hd Btn")) {
			view.showXemHdFrame();
		}else if (src.equals("Thanh Toan Hd Btn")) {
			view.showThanhToanHdFrame();
		}else if (src.equals("Xem TK Btn")) { 
			JOptionPane.showMessageDialog(view, "Lãi suất gửi tiết kiệm hàng tháng: \n" + khachHang1.xemLaiSuat(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }else if (src.equals("Gui TK Btn")) {
			view.showGuiTK();
		}else if (src.equals("Back Btn Gui TK")) {
			view.backBtnGuiTK();
		}else if (src.equals("Xem LS Vay Btn")) {
				JOptionPane.showMessageDialog(view, "Lãi suất vay hàng năm: " + khachHang1.xemLaiSuatVayTien(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }else if (src.equals("Khoi Tao Vay Btn")) {
			view.khoiTaoVayBtn();
		}else if (src.equals("Logout")) {
			int response = JOptionPane.showConfirmDialog(view, "Bạn có chắc muốn đăng xuất không ?", "Xác nhận",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.YES_OPTION) {
				view.showMainPane();;
			}
		}
    }
    
}
