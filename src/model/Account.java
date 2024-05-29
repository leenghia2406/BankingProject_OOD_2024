package model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Account {
	private String soTaiKhoan;
	private String matKhau;
	private int maPIN;
	private int soDu;

	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public boolean setMatKhau(String matKhau) {
		this.matKhau = matKhau;
		return true;
	}

	public int getSoDu() {
		return soDu;
	}

	public void setSoDu(int soDu) {
		this.soDu = soDu;
	}

	public Account(String soTaiKhoan, String matKhau, int maPIN) {
		this.soTaiKhoan = soTaiKhoan;
		this.matKhau = matKhau;
		this.maPIN = maPIN;
		this.soDu = 0;
	}

	public int getMaPIN() {
		return maPIN;
	}

	public boolean setMaPIN(int maPIN) {
		this.maPIN = maPIN;
		return true;
	}

	public boolean thayDoiMatKhau(String mkCu, String mkMoi1, String mkMoi2) {
		return (mkCu.equals(matKhau) && mkMoi1.equals(mkMoi2)) ? this.setMatKhau(mkMoi1) : false;
	}
	
	
	public String kiemTraSoDu() {
		return "Số dư tài khoản của bạn là: "+this.soDu;
	}

//	public boolean thayDoiMaPIN(int maPINCu, int maPINMoi) {
//		return maPINCu == maPINMoi ? this.setMaPIN(maPINMoi): false;
//	}
	public boolean thayDoiMaPIN(int maPINCu, int maPINMoi) {
	    if (this.maPIN == maPINCu) {
	        this.maPIN = maPINMoi;
	        return true;
	    } else {
	        return false;
	    }
	}

	public boolean dangNhap(String stk, String matKhau2) {
		return (this.soTaiKhoan.equals(stk) && this.matKhau.equals(matKhau2))? true: false;
	}
	
	public boolean kiemTraMaPIN(int maPIN) {
		return this.maPIN == maPIN;
	}
}