package model;

import java.time.LocalDate;

public abstract class TocDo extends HoaDonMang{
	protected HoaDonMang hoaDonMang;

	public TocDo(HoaDonMang hoaDonMang) {
		this.hoaDonMang = hoaDonMang;
		this.ngayGuiHD = hoaDonMang.ngayGuiHD;
		this.ngayHetHan = hoaDonMang.ngayHetHan;
		this.maKH = hoaDonMang.maKH;
		this.soTien = 150000;
	}
	
	public HoaDonMang getHoaDonMang() {
		return hoaDonMang;
	}

	public void setHoaDonMang(HoaDonMang hoaDonMang) {
		this.hoaDonMang = hoaDonMang;
	}

	@Override
	public abstract int tinhTienHoaDon() ;
	public String inHoaDon() {
		return super.inHoaDon();
	}
}
