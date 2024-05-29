package model;

import java.time.LocalDateTime;
import java.util.Random;

public class GiaoDich {
	protected int maGiaoDich;
	protected LocalDateTime thoiGianThucHien;
	protected int soTien; 
	private Random rd = new Random();
	public int getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public LocalDateTime getThoiGianThucHien() {
		return thoiGianThucHien;
	}
	public void setThoiGianThucHien(LocalDateTime thoiGianThucHien) {
		this.thoiGianThucHien = thoiGianThucHien;
	}
	public int getSoTien() {
		return soTien;
	}
	public void setSoTien(int soTien) {
		this.soTien = soTien;
	}
	public GiaoDich( int soTien) {
		this.maGiaoDich = rd.nextInt();
		this.thoiGianThucHien = LocalDateTime.now();
		this.soTien = soTien;
	}
	
}
