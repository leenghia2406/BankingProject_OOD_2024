package model;

import java.time.LocalDate;
import java.util.Random;

public abstract class HoaDon {
	protected String maHoaDon;
	protected int soTien;
	protected LocalDate ngayGuiHD;
	protected LocalDate ngayHetHan;
	protected boolean trangThaiThanhToan;
	protected String maKH;

	public HoaDon(String maHoaDon,String maKH) {
		this.maHoaDon = maHoaDon;
		this.soTien = this.tinhTienHoaDon();
		this.ngayGuiHD = LocalDate.now();
		this.ngayHetHan = ngayGuiHD.plusMonths(3);
		this.trangThaiThanhToan = false;
		this.maKH = maKH;
	} 

	public HoaDon() {
		
	}
	public String kiemTraThanhToan() {
		return this.trangThaiThanhToan? "Đã thanh toán": "Chưa thanh toán";
	}

	public abstract int tinhTienHoaDon();

	public abstract String inHoaDon();

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public int getSoTien() {
		return soTien;
	}

	public void setSoTien(int soTien) {
		this.soTien = soTien;
	}

	public LocalDate getNgayGuiHD() {
		return ngayGuiHD;
	}

	public void setNgayGuiHD(LocalDate ngayGuiHD) {
		this.ngayGuiHD = ngayGuiHD;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public boolean getTrangThaiThanhToan() {
		return trangThaiThanhToan;
	}

	public void setTrangThaiThanhToan(boolean trangThaiThanhToan) {
		this.trangThaiThanhToan = trangThaiThanhToan;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	// thanh toán hóa đơn cho khách hàng
	public boolean thanhToanHoaDon(ObserverKH kH) {
		int soDu = kH.getAccount().getSoDu();
		int soTienHoaDon = this.tinhTienHoaDon();
		if(soDu < soTienHoaDon) {
			return false; // không đủ tiền thanh toán
		}else {
			// thực hiện thanh toán
			kH.getAccount().setSoDu(soDu - soTienHoaDon);
			this.setTrangThaiThanhToan(true);
			kH.getdSThongBao().add("Bạn đã thanh toán hóa đơn "+maHoaDon+" số tiền: "+soTienHoaDon+" \n Số dư tài khoản: "+kH.getAccount().getSoDu());
			return true;
		}
	}

}
