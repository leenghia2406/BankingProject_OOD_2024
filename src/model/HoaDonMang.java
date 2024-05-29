package model;

import java.time.LocalDate;

public class HoaDonMang extends HoaDon{

	
	public HoaDonMang(String maHoaDon, String maKH) {
		super(maHoaDon, maKH);
		// TODO Auto-generated constructor stub
		this.soTien = 150000;
		
	}
	
	public HoaDonMang() {
		
	}
	@Override
	public  int tinhTienHoaDon() {
		return this.soTien;
	}

	@Override
	public String inHoaDon() {
	    StringBuilder stringBuilder = new StringBuilder();
	    stringBuilder.append("----- Hóa Đơn Mạng -----\n");
	    stringBuilder.append("Mã hóa đơn: ").append(getMaHoaDon()).append("\n");
	    stringBuilder.append("Ngày gửi hóa đơn: ").append(getNgayGuiHD()).append("\n");
	    stringBuilder.append("Ngày hết hạn thanh toán: ").append(getNgayHetHan()).append("\n");
	    stringBuilder.append("Mã khách hàng: ").append(getMaKH()).append("\n");
	    stringBuilder.append("Số tiền phí mạng: ").append(soTien).append(" VNĐ\n");
	    
	    return stringBuilder.toString();
	}

}
