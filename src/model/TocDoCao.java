package model;

import java.time.LocalDate;

public class TocDoCao extends TocDo{

	

	public TocDoCao(HoaDonMang hoaDonMang) {
		super(hoaDonMang);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int tinhTienHoaDon() {
		// TODO Auto-generated method stub
		return hoaDonMang.soTien+ 100000;
	}
	public String inHoaDon() {
		String result = super.inHoaDon();
		result+= "Tốc độ Cao\n"+ "Tổng số tiền: "+this.tinhTienHoaDon();
		return result;
	}
}
