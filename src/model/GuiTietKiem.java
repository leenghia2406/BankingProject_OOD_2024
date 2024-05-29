package model;

import java.time.LocalDate;

public class GuiTietKiem {
	private int soTienGui;
	private int soThangGui;
	private LocalDate ngayGui;
	private String noiDungGui;
	private double laiSuatThang;

	public GuiTietKiem(int soTienGui, int soThangGui, String noiDungGui) {
		this.soTienGui = soTienGui;
		this.soThangGui = soThangGui;
		this.ngayGui = LocalDate.now();
		this.noiDungGui = noiDungGui;
		this.laiSuatThang = this.tinhLaiSuat(soThangGui);
	}

	public int getSoTienGui() {
		return soTienGui;
	}

	public void setSoTienGui(int soTienGui) {
		this.soTienGui = soTienGui;
	}

	public int getSoThangGui() {
		return soThangGui;
	}

	public void setSoThangGui(int soThangGui) {
		this.soThangGui = soThangGui;
	}

	public LocalDate getNgayGui() {
		return ngayGui;
	}

	public void setNgayGui(LocalDate ngayGui) {
		this.ngayGui = ngayGui;
	}

	public String getNoiDungGui() {
		return noiDungGui;
	}

	public void setNoiDungGui(String noiDungGui) {
		this.noiDungGui = noiDungGui;
	}

	public double getLaiSuatThang() {
		return laiSuatThang;
	}

	public void setLaiSuatThang(double laiSuatThang) {
		this.laiSuatThang = laiSuatThang;
	}

	@Override
	public String toString() {
		return "GuiTietKiem [soTienGui=" + soTienGui + ", soThangGui=" + soThangGui + ", ngayGui=" + ngayGui
				+ ", noiDungGui=" + noiDungGui + ", laiSuatThang=" + laiSuatThang + "]";
	}

	public boolean thucHienGui(ObserverKH kH, GuiTietKiem gui) {
		// kiểm tra điều kiện, số tiền gửi phải trên 1,000,000
		if (gui.getSoTienGui() < 1000000) {
			return false; // không đủ số tiền để mở tiết kiệm
		}
		// kiểm tra số tiền trong tài khoản
		int soDu = kH.getAccount().getSoDu();
		if (soDu < gui.soTienGui) {
			return false; // tài khoản không đủ tiền gửi
		}
		// thực hiện tính lãi suất
		if (gui.laiSuatThang == 0.0) {
			return false; // số tháng gửi không hợp lệ
		}
		gui.setLaiSuatThang(laiSuatThang);
		kH.setGuiTietKiem(gui);
		kH.getAccount().setSoDu(soDu - gui.getSoTienGui());
		kH.getdSThongBao().add("Quý khách vừa gửi tiền tiết kiệm với số tiền: "+soTienGui+"\n Số dư tài khoản hiện tại: "+kH.getAccount().getSoDu());
		return true;
	}

	private double tinhLaiSuat(int soThang) {
		switch (soThang) {
		case 1:
		case 2:
			return 1.7;
		case 3:
		case 5:
			return 2.0;
		case 6:
		case 9:
			return 3.0;
		case 12:
		case 13:
		case 15:
		case 18:
		case 24:
		case 36:
			return 4.7;
		default:
			return 0.0; // Trả về 0 nếu không có lãi suất được xác định
		}
	}

	public boolean rutTien(ObserverKH kH) {
		if (!LocalDate.now().isBefore(this.tinhNgayRut())) {
			return false;
		}
		kH.setGuiTietKiem(null);
		kH.getAccount().setSoDu(kH.getAccount().getSoDu() + this.tinhSoTienRut());
		kH.getdSThongBao().add("Quý khách vừa rút tiền tiết kiệm với số tiền: "+soTienGui+"\n Số dư tài khoản hiện tại: "+kH.getAccount().getSoDu());
		return true;
	}

	private LocalDate tinhNgayRut() {
		return ngayGui.plusMonths(this.soThangGui);
	}

	private int tinhSoTienRut() {
		// Tính số tiền rút bằng cách cộng số tiền gửi với lãi suất đã tính
		int soTienRut = (int) (this.soTienGui + (this.soTienGui * this.laiSuatThang / 100));
		return soTienRut;
	}

}
