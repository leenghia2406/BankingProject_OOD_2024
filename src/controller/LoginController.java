package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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

public class LoginController implements ActionListener {
	View view;
	Account acc1 = new Account("9999", "1234", 123);
	Account acc2 = new Account("1111", "1234", 111);
	LocalDate ngaySinh1 = LocalDate.of(2004, 6, 24);
	LocalDate ngaySinh2 = LocalDate.of(2004, 1, 1);
	KhachHang khachHang1 = new KhachHang("KH01", "Le Trong Nghia", ngaySinh1, "Tây Hồ, Hà Nội",
			"1234567", "01230123", "trongnghia@gmail.com", acc1);
	KhachHang khachHang2 = new KhachHang("KH02", "Huynh Hoai Linh", ngaySinh2, "Thu Duc, TP.HCM",
			"88888888", "223334444", "hoailinhgay@gmail.com", acc2);
	ObserverKH currentKhachHang = null;
	HoaDon hdDien1 = new HoaDonDien("DIEN01", "9999", 50.0);
	HoaDon hdDien2 = new HoaDonDien("DIEN02", "9999", 50.0);
	HoaDon hdDien3 = new HoaDonDien("DIEN03", "9999", 50.0);
	HoaDon hdDien4 = new HoaDonDien("DIEN04", "9999", 50.0);
	HoaDon hdDien5 = new HoaDonDien("DIEN05", "9999", 50.0);
	HoaDon hdDien6 = new HoaDonDien("DIEN06", "9999", 50.0);
	HoaDon hdNuoc1 = new HoaDonNuoc("NUOC01", "9999", 30.0);
	HoaDon hdNuoc2 = new HoaDonNuoc("NUOC02", "9999", 30.0);
	HoaDon hdNuoc3 = new HoaDonNuoc("NUOC03", "9999", 30.0);
	HoaDon hdNuoc4 = new HoaDonNuoc("NUOC04", "9999", 30.0);
	HoaDon hdNuoc5 = new HoaDonNuoc("NUOC05", "9999", 30.0);
	HoaDon hdNuoc6 = new HoaDonNuoc("NUOC06", "9999", 30.0);
	HoaDon hdMangNet1 = new HoaDonMang("NETFLIT01", "9999");
	HoaDon hdMangNet2 = new HoaDonMang("NETFLIT02", "9999");
	HoaDon hdMangNet3 = new HoaDonMang("NETFLIT03", "9999");
	HoaDon hdMangK1 = new HoaDonMang("KPLUS01", "9999");
	HoaDon hdMangK2 = new HoaDonMang("KPLUS02", "9999");
	HoaDon hdMangK3 = new HoaDonMang("KPLUS03", "9999");
	DichVu net1 = new NetFlit(hdMangNet1);
	DichVu net2 = new NetFlit(hdMangNet2);
	DichVu net3 = new NetFlit(hdMangNet3);
	DichVu kplus1 = new KPlus(hdMangK1);
	DichVu kplus2 = new KPlus(hdMangK2);
	DichVu kplus3 = new KPlus(hdMangK3);
	TocDo tdCao = new TocDoCao(net1);
	NganHang nganHang = NganHang.getInstance();
	public LoginController(View view) {
		this.view = view;
		hdDien1.setSoTien(hdDien1.tinhTienHoaDon());
		hdDien2.setSoTien(hdDien2.tinhTienHoaDon());
		hdDien3.setSoTien(hdDien3.tinhTienHoaDon());
		hdDien4.setSoTien(hdDien4.tinhTienHoaDon());
		hdDien5.setSoTien(hdDien5.tinhTienHoaDon());
		hdDien6.setSoTien(hdDien6.tinhTienHoaDon());
		hdNuoc1.setSoTien(hdNuoc1.tinhTienHoaDon());
		hdNuoc2.setSoTien(hdNuoc2.tinhTienHoaDon());
		hdNuoc3.setSoTien(hdNuoc3.tinhTienHoaDon());
		hdNuoc4.setSoTien(hdNuoc4.tinhTienHoaDon());
		hdNuoc5.setSoTien(hdNuoc5.tinhTienHoaDon());
		hdNuoc6.setSoTien(hdNuoc6.tinhTienHoaDon());
		net1.setSoTien(net1.tinhTienHoaDon());
		net2.setSoTien(net2.tinhTienHoaDon());
		net3.setSoTien(net3.tinhTienHoaDon());
		kplus1.setSoTien(kplus1.tinhTienHoaDon());
		kplus2.setSoTien(kplus2.tinhTienHoaDon());
		kplus3.setSoTien(kplus3.tinhTienHoaDon());
		
		net1.setMaHoaDon(hdMangNet1.getMaHoaDon());
		net2.setMaHoaDon(hdMangNet2.getMaHoaDon());
		net3.setMaHoaDon(hdMangNet3.getMaHoaDon());
		kplus1.setMaHoaDon(hdMangK1.getMaHoaDon());
		kplus2.setMaHoaDon(hdMangK2.getMaHoaDon());
		kplus3.setMaHoaDon(hdMangK3.getMaHoaDon());
		khachHang1.getDsHoaDon().add(hdDien1);
		khachHang1.getDsHoaDon().add(hdDien2);
		khachHang1.getDsHoaDon().add(hdDien3);
		khachHang1.getDsHoaDon().add(hdDien4);
		khachHang1.getDsHoaDon().add(hdDien5);
		khachHang1.getDsHoaDon().add(hdDien6);
		khachHang1.getDsHoaDon().add(hdNuoc1);
		khachHang1.getDsHoaDon().add(hdNuoc2);
		khachHang1.getDsHoaDon().add(hdNuoc3);
		khachHang1.getDsHoaDon().add(hdNuoc4);
		khachHang1.getDsHoaDon().add(hdNuoc5);
		khachHang1.getDsHoaDon().add(hdNuoc6);
		khachHang1.getDsHoaDon().add(net1);
		khachHang1.getDsHoaDon().add(net2);
		khachHang1.getDsHoaDon().add(net3);
		khachHang1.getDsHoaDon().add(kplus1);
		khachHang1.getDsHoaDon().add(kplus2);
		khachHang1.getDsHoaDon().add(kplus3);
		nganHang.themKhachHang(khachHang1);
		nganHang.themKhachHang(khachHang2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Đăng Nhập")) {
            boolean loginSuccess = false;
            for (ObserverKH kh : nganHang.getdSKhachHang()) {
                if (kh.getAccount().dangNhap(view.getAccTxf().getText(), view.getPassFld().getText())) {
                    loginSuccess = true;
                    setCurrentKhachHang(kh);
//                    currentKhachHang = kh;
                    currentKhachHang.getAccount().setSoDu(5000000);
                    break;
                }
            }
            if (loginSuccess) {
                JOptionPane.showMessageDialog(view, "Đăng Nhập Thành Công!", "Đăng Nhập", JOptionPane.INFORMATION_MESSAGE);
                view.showLoginFrame();
            } else {
                JOptionPane.showMessageDialog(view, "Đăng Nhập Không Thành Công \nVui lòng kiểm tra lại tài khoản và mật khẩu!",
                		"Đăng Nhập", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
	public ObserverKH getCurrentKhachHang() {
		return currentKhachHang;
	}
	public void setCurrentKhachHang(ObserverKH currentKhachHang) {
		this.currentKhachHang = currentKhachHang;
	}
	
	
}
