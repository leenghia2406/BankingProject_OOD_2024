package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VayNganHang {
	private int soTien;
	private int soNamVay;
	private LocalDate ngayVay;
	private String thongTinTaiChinh; // mức thu nhập
	private String mucDichVay;
	private LocalDate ngayTra;
	private String soCCCD;
	private double laiSuatNam;
	
	public VayNganHang(int soTien, int soNamVay, String thongTinTaiChinh, String mucDichVay, String soCCCD) {
		this.soTien = soTien;
		this.soNamVay = soNamVay;
		this.ngayVay = LocalDate.now();
		this.thongTinTaiChinh = thongTinTaiChinh;
		this.mucDichVay = mucDichVay;
		this.ngayTra = this.ngayVay.plusYears(soNamVay);
		this.soCCCD = soCCCD;
		this.laiSuatNam = 6.49;
	}
	@Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "----- Hóa Đơn Vay Ngân Hàng -----\n" +
                "Ngày vay: " + ngayVay.format(formatter) + "\n" +
                "Ngày trả: " + ngayTra.format(formatter) + "\n" +
                "Số CCCD: " + soCCCD + "\n" +
                "Số tiền vay: " + String.format("%,d", soTien) + " VNĐ\n" +
                "Thời hạn vay: " + soNamVay + " năm\n" +
                "Lãi suất năm: " + laiSuatNam + "%\n" +
                "Thông tin tài chính: " + thongTinTaiChinh + "\n" +
                "Mục đích vay: " + mucDichVay + "\n" +
                "----------------------------------";
    }

	public boolean thucHienVayTien(ObserverKH kH, VayNganHang vay) {
		if (vay.getSoTien() > 100000000) {
			return false; // số tiền tối đa cho vay là 100tr
		} else {
			kH.setVay(vay);
			kH.getAccount().setSoDu(kH.getAccount().getSoDu() + vay.soTien);
			kH.getdSThongBao().add("Khách hàng vừa vay ngân hàng: "+soTien+"\n Số dư hiện tại là: "+kH.getAccount().getSoDu());
			return true;
		}
	}

	public int getSoTien() {
		return soTien;
	}

	public void setSoTien(int soTien) {
		this.soTien = soTien;
	}

	public int getSoThangVay() {
		return soNamVay;
	}

	public void setSoThangVay(int soThangVay) {
		this.soNamVay = soThangVay;
	}

	public LocalDate getNgayVay() {
		return ngayVay;
	}

	public void setNgayVay(LocalDate ngayVay) {
		this.ngayVay = ngayVay;
	}

	public String getThongTinTaiChinh() {
		return thongTinTaiChinh;
	}

	public void setThongTinTaiChinh(String thongTinTaiChinh) {
		this.thongTinTaiChinh = thongTinTaiChinh;
	}

	public String getMucDichVay() {
		return mucDichVay;
	}

	public void setMucDichVay(String mucDichVay) {
		this.mucDichVay = mucDichVay;
	}

	public LocalDate getNgayTra() {
		return ngayTra;
	}

	public void setNgayTra(LocalDate ngayTra) {
		this.ngayTra = ngayTra;
	}

	public String getSoCCCD() {
		return soCCCD;
	}

	public void setSoCCCD(String soCCCD) {
		this.soCCCD = soCCCD;
	}

	public double getLaiSuatNam() {
		return laiSuatNam;
	}

	public void setLaiSuatNam(double laiSuatNam) {
		this.laiSuatNam = laiSuatNam;
	}

	public boolean traNo(ObserverKH kH) {
		int soDu = kH.getAccount().getSoDu();
		int soTienVay = kH.getVay().getSoTien();
		// kiểm tra số dư tài khoản
		if (soDu < soTienVay) {
			return false; // khách hàng không đủ tiền trong tài khoản
		} else {
			kH.setVay(null);
			kH.getAccount().setSoDu(soDu - soTienVay);
			kH.getdSThongBao().add("Khách hàng vừa trả ngân hàng: "+soTienVay+"\n Số dư hiện tại là: "+kH.getAccount().getSoDu());
			return true;
		}
	}

}
