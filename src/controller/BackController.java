package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.View;

public class BackController implements ActionListener {
    View view;
    public BackController(View view) {
    	this.view = view;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	String src = e.getActionCommand();
    	if (src.equals("Back Pass")) {
			view.backBtnChangePass();
		}else if (src.equals("Back Pin")) {
			view.backBtnChangePin();
		}else if (src.equals("Back Chuyen Tien")) {
			view.backBtnChuyenTien();
		}else if (src.equals("Back Vay Tien")) {
			view.backBtnVaytien();
		}else if (src.equals("Back Tiet Kiem")) {
			view.backBtnTK();
		}else if (src.equals("Back Hoa Don")) {
			view.backBtnHoadon();
		}else if(src.equals("Back Xem Hd")) {
			view.backBtnXemHd();
		}else if (src.equals("Back TT Hd")) {
			view.backBtnThanhtoanHd();
		}else if (src.equals("Back Btn Khoi Tao Vay")) {
			view.backBtnXnVay();
		}
    }
    
}
