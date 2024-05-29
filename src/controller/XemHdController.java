package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import model.*;
import view.View;

public class XemHdController implements ActionListener {
	View view;
	LoginController loginController;
	public XemHdController(View view, ActionListener loginController) {
		this.view = view;
		this.loginController = (LoginController) loginController;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand(); 
        if (src.equals("Xem Hd Btn")) {
            view.showXemHdFrame();
            ObserverKH kh = loginController.getCurrentKhachHang(); 
            if (kh != null) {
                List<HoaDon> dsHoaDon = kh.getDsHoaDon();
                Object[][] tableData = new Object[dsHoaDon.size()][4];
                for (int i = 0; i < dsHoaDon.size(); i++) {
                    HoaDon hd = dsHoaDon.get(i);
                    tableData[i] = new Object[]{hd.getMaHoaDon(), hd.getSoTien(), hd.getNgayGuiHD(), hd.kiemTraThanhToan()};
                }
                String[] columnNames = {"Mã Hóa Đơn", "Số Tiền", "Ngày Gửi", "Trạng Thái Thanh Toán"};
                view.getHoaDonTable().setModel(new DefaultTableModel(tableData, columnNames));
            }
        }
    }
	

}
