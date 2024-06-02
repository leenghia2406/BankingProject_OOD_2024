package model;

import java.util.ArrayList;
import java.util.List;

public class NganHang implements Subject {
	private String tenNganHang;
	private String diaChi;
	private List<ObserverKH> dSKhachHang; // quản lý khách hàng thông qua Observer
	private String thongBao;
	private List<HoaDon> dSHoaDon;
	public static NganHang uniqueNganHang = null;
	
	// thêm khách hàng
	public boolean themKhachHang(ObserverKH kH) {
		return this.dSKhachHang.contains(kH) ? false : this.dSKhachHang.add(kH);
	}

	// xóa khách hàng
	public boolean xoaKhachHang(ObserverKH kH) {
		return this.dSHoaDon.contains(kH) ? this.dSKhachHang.remove(kH) : false;
	}

	// gửi thông báo
	public void guiThongBao() {
		this.dSKhachHang.forEach(x -> x.nhanThongBao(tenNganHang, thongBao));
	}

	// gửi hóa đơn
	public void guiHoaDon() {
		for (HoaDon hoaDon : this.dSHoaDon) {
			for (ObserverKH kH : this.dSKhachHang) {
				if (hoaDon.getMaKH().equalsIgnoreCase(kH.getMaKH())) {
					kH.getDsHoaDon().add(hoaDon);
				} else {
					System.out.println(hoaDon.getMaHoaDon() + " không hợp lệ!");
				}
			}
		}
	}
	
	public NganHang(String tenNganHang, String diaChi, List<ObserverKH> dSKhachHang, String thongBao,
			List<HoaDon> dSHoaDon) {
		super();
		this.tenNganHang = tenNganHang;
		this.diaChi = diaChi;
		this.dSKhachHang = dSKhachHang;
		this.thongBao = thongBao;
		this.dSHoaDon = dSHoaDon;
	}
	
	
	public NganHang() {
		super();
		dSKhachHang = new ArrayList<>();
		dSHoaDon = new ArrayList<>();
	}

	public NganHang(String tenNganHang, String diaChi) {
		this.tenNganHang = tenNganHang;
		this.diaChi = diaChi;
		this.dSKhachHang = new ArrayList<ObserverKH>();
		this.dSHoaDon = new ArrayList<HoaDon>();
	}

	// getInstance
	public static NganHang getInstance() {
		if (uniqueNganHang == null) {
			uniqueNganHang = new NganHang("ABC Bank", "Quận 1/TP.HCM");
		}
		return uniqueNganHang;
	}

	public String getTenNganHang() {
		return tenNganHang;
	}

	public void setTenNganHang(String tenNganHang) {
		this.tenNganHang = tenNganHang;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public List<ObserverKH> getdSKhachHang() {
		return dSKhachHang;
	}

	public void setdSKhachHang(List<ObserverKH> dSKhachHang) {
		this.dSKhachHang = dSKhachHang;
	}

	public String getThongBao() {
		return thongBao;
	}

	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
		this.guiThongBao();
	}

	public List<HoaDon> getdSHoaDon() {
		return dSHoaDon;
	}

	public void setdSHoaDon(List<HoaDon> dSHoaDon) {
		this.dSHoaDon = dSHoaDon;
	}

	public boolean thayDoiMatKhau(String mkCu, String mkMoi1, String mkMoi2, String maKH) {
		for (ObserverKH kH : this.dSKhachHang) {
			if (kH.getMaKH().equalsIgnoreCase(maKH)) {
				return kH.getAccount().thayDoiMatKhau(mkCu, mkMoi1, mkMoi2);
			}
		}
		return false;
	}

	public String kiemTraSoDuKhachHang(String maKH) {
		for (ObserverKH kH : this.dSKhachHang) {
			if (kH.getMaKH().equalsIgnoreCase(maKH)) {
				return kH.getAccount().kiemTraSoDu();
			}
		}
		return null;
	}

	public boolean thayDoiMaPIN(String maKH, int maPINCu, int maPINMoi) {
		for (ObserverKH kH : this.dSKhachHang) {
			if (kH.getMaKH().equalsIgnoreCase(maKH)) {
				return kH.getAccount().thayDoiMaPIN(maPINCu, maPINMoi);
			}
		}
		return false;
	}

	public ObserverKH dangNhap(String maKH, String stk, String matKhau) {
		for (ObserverKH kH : this.dSKhachHang) {
			if (kH.getMaKH().equalsIgnoreCase(maKH)) {
				if(kH.getAccount().dangNhap(stk, matKhau)) {
					return kH;
				}
			}
		}
		return null;
	}

	public boolean rutTienTietKiem(String maKH) {
		for(ObserverKH kH : this.dSKhachHang) {
			if(kH.getMaKH().equalsIgnoreCase(maKH)) {
					return kH.getGuiTietKiem().rutTien(kH);
			}
		}
		return false;
	}

	public String xemLaiSuat() {
	    return "Kỳ hạn\t USD \t VND \n"
	            + "Không kỳ hạn\t %\t 0.1%\n"
	            + "1 Tháng\t %\t 1.7%\n"
	            + "2 Tháng\t %\t 1.7%\n"
	            + "3 Tháng\t %\t 2%\n"
	            + "5 Tháng\t %\t 2%\n"
	            + "6 Tháng\t %\t 3%\n"
	            + "9 Tháng\t %\t 3%\n"
	            + "12 Tháng\t %\t 4.7%\n"
	            + "13 Tháng\t %\t 4.7%\n"
	            + "15 Tháng\t %\t 4.7%\n"
	            + "18 Tháng\t %\t 4.7%\n"
	            + "24 Tháng\t %\t 4.7%\n"
	            + "36 Tháng\t %\t 4.7%";
	}

	public String xemLaiSuatVayTien() {
		return "Lãi suất 12 tháng(1 năm) là 6.49%";
	}

	public boolean guiTietKiem(String maKH, GuiTietKiem gui) {
		for(ObserverKH kH : this.dSKhachHang) {
			if(maKH.equalsIgnoreCase(kH.getMaKH())) {
				kH.setGuiTietKiem(gui);
				return kH.getGuiTietKiem().thucHienGui(kH, gui);
			}
		}
		return true;
	}


	public boolean vayTien(String maKH, VayNganHang vay) {
		for(ObserverKH kH : this.dSKhachHang) {
			if(kH.getMaKH().equalsIgnoreCase(maKH)) {
				kH.setVay(vay);
				return kH.getVay().thucHienVayTien(kH, vay);
			}
		}
		return false;
	}

	public boolean thucHienTraNo(String maKH) {
		for(ObserverKH kH : this.dSKhachHang) {
			if(kH.getMaKH().equalsIgnoreCase(maKH)) {
				return kH.getVay().traNo(kH);
			}
		}
		return false;
	}

	public boolean thanhToanHoaDon(String maKH, String maHD) {
		for(ObserverKH kH : this.dSKhachHang) {
			if(kH.getMaKH().equalsIgnoreCase(maKH)) {
				for(HoaDon hoaDon : kH.getDsHoaDon()) {
					if(hoaDon.getMaHoaDon().equalsIgnoreCase(maHD)) {
						return hoaDon.thanhToanHoaDon(kH);
					}
				}
			}
		}
		return false;
	}

	public boolean chuyenTien(String maKH, ChuyenTien chuyenTien) {
		for(ObserverKH kH : this.dSKhachHang) {
			ObserverKH kHChuyen = null;
			ObserverKH kHNhan = null;
			String stkNhan = chuyenTien.getStkNguoiNhan();
			// tìm khách hàng chuyển
			if(kH.getMaKH().equals(maKH)) {
				kHChuyen = kH;
			}
			// kiểm tra số dư của khách hàng
			if(kHChuyen.getAccount().getSoDu()<chuyenTien.getSoTien()) {
				return false;
			}
			// tìm khách hàng nhận
			if(kH.getAccount().getSoTaiKhoan().equalsIgnoreCase(stkNhan)) {
				kHNhan = kH;
			}
			// nếu cùng người chuyển thì false
			if(kHChuyen.equals(kHNhan) || kHChuyen == null || kHNhan == null) {
				return false;
			}else {
				return chuyenTien.chuyenTien(kHChuyen, kHNhan);
			}
		}
		return false;
	}
	public boolean themHoaDon(HoaDon hoaDon) {
		return this.dSHoaDon.contains(hoaDon)? false : this.dSHoaDon.add(hoaDon);
	}
}
