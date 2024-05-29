package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

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

public class ThanhToanHdController implements ActionListener {
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
	NganHang nganHang = new NganHang("Ngan Hang ABC", "24 Dang Thai Mai, Tay Ho, Ha Noi");
    public ThanhToanHdController(View view, ActionListener loginCon) {
    	this.view = view;
    	this.loginController = (LoginController) loginCon;

    }
	@Override
	public void actionPerformed(ActionEvent e) {
	    String src = e.getActionCommand();
	    if (src.equals("Xac Nhan Thanh Toan Hd Btn")) {
	        ObserverKH kh = loginController.getCurrentKhachHang(); // Lấy khách hàng hiện tại
	        if (kh != null) {
	            String maHoaDon = view.getNhapMaHdTxf().getText();
	            HoaDon hoaDon = kh.timHoaDonTheoMa(maHoaDon); 
	            if (hoaDon == null) {
	                JOptionPane.showMessageDialog(view, "Không tìm thấy hóa đơn với mã: " + maHoaDon);
	            } else if (hoaDon.getTrangThaiThanhToan()) {
	                JOptionPane.showMessageDialog(view, "Hóa đơn đã được thanh toán");
	            } else {
	                if (hoaDon.thanhToanHoaDon(kh)) {
	                    JOptionPane.showMessageDialog(view, "Thanh toán thành công hóa đơn. Thông tin hóa đơn:\n" + hoaDon.inHoaDon());
	                    // Cập nhật trạng thái hóa đơn trong phần xem hóa đơn
	                    hoaDon.setTrangThaiThanhToan(true);
	                } else {
	                    JOptionPane.showMessageDialog(view, "Không đủ tiền để thanh toán hóa đơn. Số tiền yêu cầu: " + hoaDon.getSoTien() + ", số tiền hiện có trong tài khoản: " + kh.getAccount().getSoDu());
	                }
	            }
	        }
	    }
	}
	
}
