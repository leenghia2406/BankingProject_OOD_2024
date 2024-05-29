package model;

import java.time.LocalDate;

public class NetFlit extends DichVu{

	public NetFlit(HoaDon hoaDonMang) {
		super(hoaDonMang);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public int tinhTienHoaDon() {
		return hoaDonMang.soTien + 50000;
	}

	@Override
	public String inHoaDon() {
		String result = super.inHoaDon();
		result+= "Dịch vụ: Netflit\n"+ "Tổng số tiền: "+this.tinhTienHoaDon();
		return result;
	}
	
}
