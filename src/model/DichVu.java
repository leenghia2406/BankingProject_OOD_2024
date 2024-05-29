package model;

import java.time.LocalDate;

public abstract class DichVu extends HoaDonMang {
	protected HoaDon hoaDonMang;

	
	public DichVu(HoaDon hoaDonMang) {
		this.hoaDonMang = hoaDonMang;
		this.ngayGuiHD = hoaDonMang.ngayGuiHD;
		this.ngayHetHan = hoaDonMang.ngayHetHan;
		this.maKH = hoaDonMang.maKH;
		this.soTien = 150000;
	}
	@Override
	public abstract int tinhTienHoaDon();

	@Override
	public  String inHoaDon() {
		return super.inHoaDon();
	};

}
