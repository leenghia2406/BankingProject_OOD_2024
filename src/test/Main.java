package test;
import view.*;

import java.time.LocalDate;

import model.*;
public class Main {
	public static void main(String[] args) {
		NganHang nganHang = NganHang.getInstance();
		ObserverKH khachHang1 = new KhachHang("111", "Hoài", LocalDate.of(2004, 3, 15), "Bình Định", "052204001778","0377314202", "hoai1603ot@gmail.com", new Account("1223123123","linhhoai11", 160304));
		nganHang.themKhachHang(khachHang1);
		nganHang.setThongBao("Xin chào quý khách");
		khachHang1.getdSThongBao();
		System.out.println(khachHang1.xemThongBao());
//		new View().setVisible(true);
//		HoaDonMang mang1 = new HoaDonMang("112233", "111");
//		NetFlit netFlit1 = new NetFlit(mang1);
//		System.out.println(netFlit1.getNgayGuiHD().toString());
//		System.out.println(netFlit1.inHoaDon());
//		TocDoCao tocDoCao1 = new TocDoCao(mang1);
//		System.out.println(tocDoCao1.inHoaDon());
//		VayNganHang vay1 = new VayNganHang(500000, 2, "Không có", "Trả nợ", "052204001778");
//		khachHang1.vayTien(vay1, "052204001778",160304);
//		System.out.println(khachHang1.getVay().toString());
//		HoaDonMang hoaDonMang2 = new HoaDonMang("112234","111");
//		HoaDonDien dien1 = new HoaDonDien("112235","111", 150);
//		System.out.println(dien1.inHoaDon());
//		HoaDonNuoc nuoc1= new HoaDonNuoc("112236","111", 20);
//		System.out.println(nuoc1.inHoaDon());
	}
}


