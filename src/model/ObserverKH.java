package model;

import java.time.LocalDate;
import java.util.List;

public abstract class ObserverKH {
	public abstract boolean thayDoiMatKhau(String mkCu1, String mkMoi1,String mkMoi2);
	public abstract String xemSoDuTaiKhoan();
	public abstract String xemLaiSuat();
	public abstract boolean guiTietKiem(int maPIN, GuiTietKiem gui);
	public abstract boolean rutTietKiem(int maPIN);
	public abstract String xemLaiSuatVayTien();
	public abstract boolean vayTien(VayNganHang vay, String soCCCD,int maPIN);
	public abstract boolean traNo(int maPIN);
	public abstract boolean thanhToanHoaDon(String maHD, int maPIN);
	public abstract boolean chuyenTien(ChuyenTien chuyenTien, int maPIN);
	public abstract boolean thayDoiMaPIN(int maPINCu, int maPINMoi);
	public abstract ObserverKH dangNhap(String stk, String matKhau);
	public abstract boolean dangXuat();
	public abstract String xemThongBao();
	public abstract HoaDon timHoaDonTheoMa(String maHoaDon);

	public abstract void nhanThongBao(String tenNganHang, String thongBao);

	public abstract String getMaKH();

	public abstract void setMaKH(String maKH);

	public abstract String getTenKH();

	public abstract void setTenKH(String tenKH);

	public abstract LocalDate getNgaySinh();

	public abstract void setNgaySinh(LocalDate ngaySinh);

	public abstract String getDiaChi();

	public abstract void setDiaChi(String diaChi);

	public abstract String getSoCCCD();

	public abstract void setSoCCCD(String soCCCD);

	public abstract String getSdt();

	public abstract void setSdt(String sdt);

	public abstract String getEmail();

	public abstract void setEmail(String email);

	public abstract Account getAccount();

	public abstract void setAccount(Account account);

	public abstract GuiTietKiem getGuiTietKiem();

	public abstract void setGuiTietKiem(GuiTietKiem guiTietKiem);

	public abstract VayNganHang getVay();

	public abstract void setVay(VayNganHang vay);

	public abstract List<HoaDon> getDsHoaDon();

	public abstract void setDsHoaDon(List<HoaDon> dsHoaDon);

	public abstract List<String> getdSThongBao();

	public abstract void setdSThongBao(List<String> dSThongBao);

	public abstract List<GiaoDich> getdSGiaoDich();

	public abstract void setdSGiaoDich(List<GiaoDich> dSGiaoDich);
	
}
