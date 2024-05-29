package model;

import java.time.LocalDate;

public class HoaDonDien extends HoaDon {
	private double soKgDien;
	private double giaDienApDung;

	public HoaDonDien(String maHoaDon, String maKH, double soKgDien) {
		super(maHoaDon, maKH);
		this.soKgDien = soKgDien;
		this.giaDienApDung = 3500;
	} 

	@Override
	public int tinhTienHoaDon() {
		return  (int) (soKgDien*giaDienApDung);
	}

	@Override
	public String inHoaDon() {
	    StringBuilder stringBuilder = new StringBuilder();
	    stringBuilder.append("----- Hóa Đơn Điện -----\n");
	    stringBuilder.append("Ngày gửi hóa đơn: ").append(getNgayGuiHD()).append("\n");
	    stringBuilder.append("Ngày hết hạn thanh toán: ").append(getNgayHetHan()).append("\n");
	    stringBuilder.append("Mã khách hàng: ").append(getMaKH()).append("\n");
	    stringBuilder.append("Số kWh điện tiêu thụ: ").append(soKgDien).append("\n");
	    stringBuilder.append("Giá điện áp dụng: ").append(giaDienApDung).append(" VNĐ/kWh\n");
	    stringBuilder.append("Tổng tiền phải thanh toán: ").append(this.tinhTienHoaDon()).append(" VNĐ\n");
	    return stringBuilder.toString();
	}


	public double getSoKgDien() {
		return soKgDien;
	}

	public void setSoKgDien(double soKgDien) {
		this.soKgDien = soKgDien;
	}

	public double getGiaDienApDung() {
		return giaDienApDung;
	}

	public void setGiaDienApDung(double giaDienApDung) {
		this.giaDienApDung = giaDienApDung;
	}
	
}
