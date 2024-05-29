package model;

public class ChuyenTien extends GiaoDich{
	private String stkNguoiNhan;
	private String noiDungChuyen;
	public ChuyenTien(int soTien, String stkNguoiNhan, String noiDungChuyen) {
		super(soTien);
		this.stkNguoiNhan = stkNguoiNhan;
		this.noiDungChuyen = noiDungChuyen;
	}
	public String getStkNguoiNhan() {
		return stkNguoiNhan;
	}
	public void setStkNguoiNhan(String stkNguoiNhan) {
		this.stkNguoiNhan = stkNguoiNhan;
	}
	public String getNoiDungChuyen() {
		return noiDungChuyen;
	}
	public void setNoiDungChuyen(String noiDungChuyen) {
		this.noiDungChuyen = noiDungChuyen;
	}
	public String toString() {
		return "Giao dịch chuyển tiền: "+"\n"+
				"Mã giao dịch: "+maGiaoDich+"\n"+
				"Thời gian giao dịch: "+thoiGianThucHien.toString()+"\n"+
				"Số tiền:  "+soTien+"\n"+
				"STK người nhận: "+stkNguoiNhan+"\n"+
				"Nội dung: "+noiDungChuyen+"\n";
	}
	public boolean chuyenTien(ObserverKH kHChuyen, ObserverKH kHNhan) {
		if (this.soTien <= kHChuyen.getAccount().getSoDu() && this.soTien > 0) {
			// trừ tiền kHChuyen
			kHChuyen.getAccount().setSoDu(kHChuyen.getAccount().getSoDu() - this.soTien);
			// cộng tiền kHNhan
			kHNhan.getAccount().setSoDu(kHNhan.getAccount().getSoDu() + this.soTien);
			// thêm thông báo
			kHChuyen.getdSThongBao().add("Quý khách chuyển "+soTien+" tới tài khoản: "+stkNguoiNhan+"\n Số dư hiện tại là: "+kHChuyen.getAccount().getSoDu());
			kHNhan.getdSThongBao().add("Quý khách vừa nhận "+ soTien+ "từ tài khoản"+kHChuyen.getAccount().getSoTaiKhoan()+"với nội dung: "+noiDungChuyen);
			return true;
		}else {
			return false;
		}

	} 
}
