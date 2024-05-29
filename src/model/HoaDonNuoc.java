package model;

import java.time.LocalDate;

public class HoaDonNuoc extends HoaDon{
	private double soKhoi;
	private double soTien1Khoi;
	
	public HoaDonNuoc(String maHoaDon, String maKH, double soKhoi) {
		super(maHoaDon, maKH);
		this.soKhoi = soKhoi;
		this.soTien1Khoi = 12000;
	}
	@Override
	public int tinhTienHoaDon() {
		return (int) (this.soKhoi*soTien1Khoi);
	}
	@Override 
	public String inHoaDon() {
	    StringBuilder stringBuilder = new StringBuilder();
	    stringBuilder.append("----- Hóa Đơn Nước -----\n");
	    stringBuilder.append("Ngày gửi hóa đơn: ").append(getNgayGuiHD()).append("\n");
	    stringBuilder.append("Ngày hết hạn thanh toán: ").append(getNgayHetHan()).append("\n");
	    stringBuilder.append("Mã khách hàng: ").append(getMaKH()).append("\n");
	    stringBuilder.append("Số khối nước tiêu thụ: ").append(soKhoi).append("\n");
	    stringBuilder.append("Số tiền mỗi khối nước: ").append(soTien1Khoi).append(" VNĐ\n");
	    stringBuilder.append("Tổng tiền phải thanh toán: ").append(tinhTienHoaDon()).append(" VNĐ\n");
	    
	    return stringBuilder.toString();
	}

	
}
