package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class KhachHang extends ObserverKH {
	private String maKH;
	private String tenKH;
	private LocalDate ngaySinh;
	private String diaChi;
	private String soCCCD;
	private String sdt;
	private String email;
	private Account account;
	private GuiTietKiem guiTietKiem;
	private VayNganHang vay;
	private List<HoaDon> dsHoaDon;
	private List<String> dSThongBao;
	private List<GiaoDich> dSGiaoDich;
	private NganHang nganHang;
	
	public KhachHang(String maKH, String tenKH, LocalDate ngaySinh, String diaChi, String soCCCD, String sdt,
			String email, Account account) {
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.soCCCD = soCCCD;
		this.sdt = sdt;
		this.email = email;
		this.account = account;
		this.guiTietKiem = null;
		this.vay = null;
		this.dsHoaDon = new ArrayList<HoaDon>();
		this.dSThongBao = new ArrayList<String>();
		this.dSGiaoDich = new ArrayList<GiaoDich>();
		this.nganHang = NganHang.getInstance();
	}

	// method toString
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Khách Hàng{").append("mã KH='").append(maKH).append('\'').append(", tên KH='")
				.append(tenKH).append('\'').append(", ngaySinh=").append(ngaySinh).append(", diaChi='").append(diaChi)
				.append('\'').append(", soCCCD='").append(soCCCD).append('\'').append(", sdt='").append(sdt)
				.append('\'').append(", email='").append(email).append('\'').append(", account=").append(account)
				.append(", guiTietKiem=").append(guiTietKiem).append(", vay=").append(vay).append(", dsHoaDon=[");

		// Loop through the dsHoaDon list
		for (int i = 0; i < dsHoaDon.size(); i++) {
			stringBuilder.append(dsHoaDon.get(i));
			if (i < dsHoaDon.size() - 1) {
				stringBuilder.append(", "); // Add comma and space if not the last element
			}
		}

		stringBuilder.append("], dSThongBao=[");

		// Loop through the dSThongBao list
		for (int i = 0; i < dSThongBao.size(); i++) {
			stringBuilder.append(dSThongBao.get(i));
			if (i < dSThongBao.size() - 1) {
				stringBuilder.append(", "); // Add comma and space if not the last element
			}
		}

		stringBuilder.append("], dSGiaoDich=[");

		// Loop through the dSGiaoDich list
		for (int i = 0; i < dSGiaoDich.size(); i++) {
			stringBuilder.append(dSGiaoDich.get(i));
			if (i < dSGiaoDich.size() - 1) {
				stringBuilder.append(", "); // Add comma and space if not the last element
			}
		}

		stringBuilder.append("]}");
		return stringBuilder.toString();
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoCCCD() {
		return soCCCD;
	}

	public void setSoCCCD(String soCCCD) {
		this.soCCCD = soCCCD;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public GuiTietKiem getGuiTietKiem() {
		return guiTietKiem;
	}

	public void setGuiTietKiem(GuiTietKiem guiTietKiem) {
		this.guiTietKiem = guiTietKiem;
	}

	public VayNganHang getVay() {
		return vay;
	}

	public void setVay(VayNganHang vay) {
		this.vay = vay;
	}

	public List<HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}

	public void setDsHoaDon(List<HoaDon> dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}

	public List<String> getdSThongBao() {
		return dSThongBao;
	}

	public void setdSThongBao(List<String> dSThongBao) {
		this.dSThongBao = dSThongBao;
	}

	public List<GiaoDich> getdSGiaoDich() {
		return dSGiaoDich;
	}

	public void setdSGiaoDich(List<GiaoDich> dSGiaoDich) {
		this.dSGiaoDich = dSGiaoDich;
	}

	@Override
	public boolean thayDoiMatKhau(String mkCu, String mkMoi1, String mkMoi2) {
		return this.nganHang.thayDoiMatKhau(maKH, mkCu, mkMoi1, mkMoi2);
	}

	@Override
	public String xemSoDuTaiKhoan() {
		return "Số dư tài khoản của bạn là: " + nganHang.kiemTraSoDuKhachHang(maKH);
	}

	@Override
	public String xemLaiSuat() {
		return nganHang.xemLaiSuat();
	}

	@Override
	public boolean guiTietKiem(int maPIN, GuiTietKiem gui) {
		boolean result = false;
		if (this.guiTietKiem != null) {
			result = false;
		}
		if (this.account.kiemTraMaPIN(maPIN)) {
			result = true;
			return nganHang.guiTietKiem(maKH, gui);
		}
		return result;
	}


	@Override
	public boolean rutTietKiem(int maPIN) {
		if (this.guiTietKiem == null) {
			return false;
		}
		if (this.account.kiemTraMaPIN(maPIN)) {
			return true;
		}
		return nganHang.rutTienTietKiem(maKH);
	}

	@Override
	public String xemLaiSuatVayTien() {
		return nganHang.xemLaiSuatVayTien();
	}

	@Override
	public boolean vayTien(VayNganHang vay, String soCCCD, int maPIN) {
		if (this.vay != null) {
			return false; // khách hàng đã vay tiền
		}
		// kiểm tra mã PIN
		if (this.account.kiemTraMaPIN(maPIN) && this.soCCCD.equalsIgnoreCase(soCCCD)) {
			this.setVay(vay);
			return nganHang.vayTien(this.maKH, vay);
		}else {
			System.out.println("Mã PIN không hợp lệ");
			return false;
		}

	}

	@Override
	public boolean traNo(int maPIN) {
		if (this.vay == null) {
			return false;
		}
		if (this.account.kiemTraMaPIN(maPIN)) {
			return nganHang.thucHienTraNo(maKH);
		}
		return false;
	}

	@Override
	public boolean thanhToanHoaDon(String maHD, int maPIN) {
		// kiểm tra mã PIN
		if (this.getAccount().kiemTraMaPIN(maPIN)) {
			return nganHang.thanhToanHoaDon(maKH, maHD);
		}
		return false;
	}

	@Override
	public boolean chuyenTien(ChuyenTien chuyenTien, int maPIN) {
		if(this.getAccount().kiemTraMaPIN(maPIN)) {
			return nganHang.chuyenTien(maKH, chuyenTien);
		}else {
			return false;
		}
	}

	@Override
	public boolean thayDoiMaPIN(int maPINCu, int maPINMoi) {
		return nganHang.thayDoiMaPIN(maKH, maPINCu, maPINMoi);
	}

	@Override
	public ObserverKH dangNhap(String stk, String matKhau) {
		return nganHang.dangNhap(maKH, stk, matKhau);
	}

	@Override
	public boolean dangXuat() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void nhanThongBao(String tenNganHang, String thongBao) {
		String thongBaoNhan = "Thông báo từ Ngân hàng: " + tenNganHang + "\n Nội dung: " + thongBao;
		this.dSThongBao.add(thongBaoNhan);
	}

	public String xemThongBao() {
		String rs = "MỤC THÔNG BÁO: ";
		for (String thongBao : dSThongBao) {
			rs += thongBao + "\n";
		}
		return rs;
	}
	// thêm
	public HoaDon timHoaDonTheoMa(String maHoaDon) {
	    for (HoaDon hoaDon : dsHoaDon) {
	        if (hoaDon.getMaHoaDon().equals(maHoaDon)) {
	            return hoaDon;
	        }
	    }
	    return null; 
	}

}
