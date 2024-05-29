package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.accessibility.AccessibleContext;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.BackController;
import controller.ChangePassController;
import controller.ChangePinController;
import controller.ChuyenTienController;
import controller.GuiTKController;
import controller.KhoiTaoVayController;
import controller.LoginController;
import controller.RutTKController;
import controller.ShowFrameController;
import controller.ThanhToanHdController;
import controller.ThanhToanVayController;
import controller.XemHdController;
/**
 *
 * @author TRONG NGHIA
 */
public class View extends JFrame {
	ActionListener backAc = new BackController(this);
	ActionListener loginAc = new LoginController(this);
	ActionListener chagePassAc = new ChangePassController(this, loginAc);
	ActionListener changePinAc = new ChangePinController(this, loginAc);
	ActionListener chuyenTienAc = new ChuyenTienController(this, loginAc);
	ActionListener xemHdAc = new XemHdController(this, loginAc);
	ActionListener showFrameAc = new ShowFrameController(this, loginAc);
	ActionListener thanhToanHdAc = new ThanhToanHdController(this, loginAc);
	ActionListener guiTKAc = new GuiTKController(this, loginAc);
	ActionListener rutTKAc = new RutTKController(this, loginAc);
	ActionListener khoiTaoVayAc = new KhoiTaoVayController(this, loginAc);
	ActionListener thanhToanVayAc = new ThanhToanVayController(this, loginAc);
	ImageIcon logo = new ImageIcon("C:\\Users\\TRONG NGHIA\\Downloads\\logo fit - Copy.png");
	Image imglogo = logo.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    public View() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private void initComponents() {
        loginFrame = new JFrame();
        userLblLogin = new JLabel();
        xemSdBtn = new JButton();
        changePassBtn = new JButton();
        tietKiemBtn = new JButton();
        changePinBtn = new JButton();
        hoaDonBtn = new JButton();
        vaytienBtn = new JButton();
        chuyenTienBtn = new JButton();
//        xemSdFrame = new JFrame();
        xemSdLbl = new JLabel();
        userLblXemSd = new JLabel();
        backBtnXemSd = new javax.swing.JButton();
        changePassFrame = new javax.swing.JFrame();
        userLblChangePass = new javax.swing.JLabel();
        nhapPassLbl = new javax.swing.JLabel();
        nhapPassmoiLbl = new javax.swing.JLabel();
        xacNhanPassmoiLbl = new javax.swing.JLabel();
        backBtnChangePass = new javax.swing.JButton();
        changePassButton = new javax.swing.JButton();
        nhapPassmoiTxf = new javax.swing.JPasswordField();
        nhapPassTxf = new javax.swing.JPasswordField();
        xacNhanPassmoiTxf = new javax.swing.JPasswordField();
        changePINFrame = new javax.swing.JFrame();
        userLblChangePin = new javax.swing.JLabel();
        nhapMaPinLbl = new javax.swing.JLabel();
        nhapPinmoiLbl = new javax.swing.JLabel();
        xacNhanPinMoiLbl = new javax.swing.JLabel();
        backBtnChangePin = new javax.swing.JButton();
        changePinButton = new javax.swing.JButton();
        nhapMaPinTxf = new javax.swing.JPasswordField();
        nhapPinmoiTxf = new javax.swing.JPasswordField();
        xacNhanPinmoiTxf = new javax.swing.JPasswordField();
        chuyenTienFrame = new javax.swing.JFrame();
        userLblChuyenTien = new javax.swing.JLabel();
        tkNguoiNhanTxf = new javax.swing.JTextField();
        soTienChuyenTxf = new javax.swing.JTextField();
        loiNhanTxf = new javax.swing.JTextField();
        tkNguoiNhanLbl = new javax.swing.JLabel();
        soTienChuyenLbl = new javax.swing.JLabel();
        loiNhanLbl = new javax.swing.JLabel();
        backBtnChuyenTien = new javax.swing.JButton();
        chuyenTienButton = new javax.swing.JButton();
        checkMaPinLbl = new javax.swing.JLabel();
        checkPinFld = new javax.swing.JPasswordField();
        hoaDonFrame = new javax.swing.JFrame();
        userLblHoadon = new javax.swing.JLabel();
        backBtnHoadon = new javax.swing.JButton();
        thanhToanHdBtn = new javax.swing.JButton();
        xemHdBtn = new javax.swing.JButton();
        xemHoaDonFrame = new javax.swing.JFrame();
        userLblxemHd = new javax.swing.JLabel();
        backBtnXemHd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hoaDonTable = new javax.swing.JTable();
        thongTinHdLbl = new javax.swing.JLabel();
        thanhToanHdFrame = new javax.swing.JFrame();
        userLblThanhToanHd = new javax.swing.JLabel();
        backBtnThanhtoanHd = new javax.swing.JButton();
        nhapMaHdLbl = new javax.swing.JLabel();
        nhapMaHdTxf = new javax.swing.JTextField();
        xacNhanThanhtoanBtn = new javax.swing.JButton();
        tietKiemFrame = new javax.swing.JFrame();
        userLblTK = new javax.swing.JLabel();
        backBtnTK = new javax.swing.JButton();
        xemTKBtn = new javax.swing.JButton();
        guiTKBtn = new javax.swing.JButton();
        rutTKBtn = new javax.swing.JButton();
        vayTienFrame = new javax.swing.JFrame();
        userLblVaytien = new javax.swing.JLabel();
        backBtnVaytien = new javax.swing.JButton();
        xemLaisuatVayBtn = new javax.swing.JButton();
        khoiTaoVayBtn = new javax.swing.JButton();
        thanhToanVayBtn = new javax.swing.JButton();
        guiTietKiemFrame = new javax.swing.JFrame();
        userLblGuiTK = new javax.swing.JLabel();
        hotenNguoiGuiTxf = new javax.swing.JTextField();
        soTienGuiTxf = new javax.swing.JTextField();
        hotenNguoiGuiLbl = new javax.swing.JLabel();
        soTienGuiLbl = new javax.swing.JLabel();
        soThangGuiLbl = new javax.swing.JLabel();
        backBtnGuiTK = new javax.swing.JButton();
        guiTKButton = new javax.swing.JButton();
        soThangGuiComboBox = new javax.swing.JComboBox<>();
        noiDungGuiLbl = new javax.swing.JLabel();
        noiDungGuiTxf = new javax.swing.JTextField();
        khoiTaoKhoanVayFrame = new javax.swing.JFrame();
        userLblXnVay = new javax.swing.JLabel();
        hotenNguoiVayTxf = new javax.swing.JTextField();
        soTienVayTxf = new javax.swing.JTextField();
        hotenNguoiVayLbl = new javax.swing.JLabel();
        soTienVayLbl = new javax.swing.JLabel();
        soThangVayLbl = new javax.swing.JLabel();
        backBtnKhoiTaoVay = new javax.swing.JButton();
        xacNhanVayBtn = new javax.swing.JButton();
        soThangVayCombobox = new javax.swing.JComboBox<>();
        noiDungVayLbl = new javax.swing.JLabel();
        noiDungVayTxf = new javax.swing.JTextField();
        soCCCDLbl = new javax.swing.JLabel();
        soCCCDtxf = new javax.swing.JTextField();
        luuYVayLbl = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        accLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        accTxf = new javax.swing.JTextField();
        passFld = new javax.swing.JPasswordField();
        maPinGuiTKLbl = new javax.swing.JLabel();
        maPinGuiTKTxf = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        
        // Login Button
        loginBtn.setActionCommand("Đăng Nhập");
        loginFrame.setSize(new java.awt.Dimension(600, 400));
        loginFrame.setTitle("GAY BANK");
        this.setIconImage(imglogo);
        this.getContentPane().setBackground(new Color(51, 51, 55));
        accTxf.setBackground(new Color(18, 30, 49));
        accTxf.setForeground(Color.WHITE);
        passFld.setBackground(new Color(18, 30, 49));
        passFld.setForeground(Color.WHITE);
        loginBtn.setBackground(new Color(51, 65, 75));

        loginFrame.setIconImage(imglogo);

        userLblLogin.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblLogin.setForeground(new java.awt.Color(51, 255, 153));
        userLblLogin.setText("Username: ");

        xemSdBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        xemSdBtn.setText("Tra Cứu Số Dư");
        xemSdBtn.setActionCommand("Xem Sd");
        xemSdBtn.setBackground(new Color(51, 65, 75));
        xemSdBtn.setForeground(new Color(0, 204, 204));


        changePassBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        changePassBtn.setText("Đổi Mật Khẩu");
        changePassBtn.setActionCommand("Đổi Mật Khẩu");
        changePassBtn.setBackground(new Color(51, 65, 75));
        changePassBtn.setForeground(new Color(0, 204, 204));

        tietKiemBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        tietKiemBtn.setText("Tiết Kiệm");
        tietKiemBtn.setActionCommand("Tiết Kiệm");
        tietKiemBtn.setBackground(new Color(51, 65, 75));
        tietKiemBtn.setForeground(new Color(0, 204, 204));

        changePinBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        changePinBtn.setText("Đổi Mã PIN");
        changePinBtn.setActionCommand("Đổi Mã PIN");
        changePinBtn.setBackground(new Color(51, 65, 75));
        changePinBtn.setForeground(new Color(0, 204, 204));
        
        hoaDonBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        hoaDonBtn.setText("Hóa Đơn");
        hoaDonBtn.setActionCommand("Hóa Đơn");
        hoaDonBtn.setBackground(new Color(51, 65, 75));
        hoaDonBtn.setForeground(new Color(0, 204, 204));
        
        vaytienBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        vaytienBtn.setText("Vay Tiền");
        vaytienBtn.setActionCommand("Vay Tiền");
        vaytienBtn.setBackground(new Color(51, 65, 75));
        vaytienBtn.setForeground(new Color(0, 204, 204));
        

        chuyenTienBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        chuyenTienBtn.setText("Chuyển Tiền");
        chuyenTienBtn.setActionCommand("Chuyển Tiền");
        chuyenTienBtn.setBackground(new Color(51, 65, 75));
        chuyenTienBtn.setForeground(new Color(0, 204, 204));
        
        aboutBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 14));
        aboutBtn.setText("Giới Thiệu");
        aboutBtn.setActionCommand("About");
        aboutBtn.setBackground(new Color(51, 65, 75));
        aboutBtn.setForeground(new Color(0, 204, 204));
        
        javax.swing.GroupLayout loginFrameLayout = new javax.swing.GroupLayout(loginFrame.getContentPane());
        loginFrame.getContentPane().setLayout(loginFrameLayout);
        loginFrame.getContentPane().setBackground(new Color(51, 51, 55));
        loginFrameLayout.setHorizontalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginFrameLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(userLblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(loginFrameLayout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginFrameLayout.createSequentialGroup()
                            .addComponent(hoaDonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(119, 119, 119)
                            .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)) // Thêm button aboutBtn vào đây
                        .addGroup(loginFrameLayout.createSequentialGroup()
                            .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(changePassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changePinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(xemSdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(119, 119, 119)
                            .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(vaytienBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tietKiemBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chuyenTienBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(145, 145, 145))
        );
        loginFrameLayout.setVerticalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(userLblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                    .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(xemSdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chuyenTienBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(changePassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vaytienBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(changePinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tietKiemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hoaDonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)) // Thêm button aboutBtn vào đây
                    .addGap(70, 70, 70))
                
        );

        xemSdLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        xemSdLbl.setForeground(new java.awt.Color(0, 204, 0));
        xemSdLbl.setText("Số dư tài khoản là: ");

        userLblXemSd.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblXemSd.setForeground(new java.awt.Color(204, 0, 51));
        userLblXemSd.setText("Username: ");

        backBtnXemSd.setText("<-");

        // Change Pass Frame
        changePassFrame.setSize(new java.awt.Dimension(600, 400));
        changePassFrame.getContentPane().setBackground(new Color(51, 51, 55));
        changePassFrame.setIconImage(imglogo);

        userLblChangePass.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblChangePass.setForeground(new java.awt.Color(51, 255, 153));
        userLblChangePass.setText("Username: ");

        nhapPassLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        nhapPassLbl.setText("Nhập mật khẩu hiện tại:");
        nhapPassLbl.setForeground(new Color(0, 204, 204));
        nhapPassTxf.setBackground(new Color(18, 30, 49));
        nhapPassTxf.setForeground(Color.WHITE);
        
        nhapPassmoiLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        nhapPassmoiLbl.setText("Nhập mật khẩu mới: ");
        nhapPassmoiLbl.setForeground(new Color(0, 204, 204));
        nhapPassmoiTxf.setBackground(new Color(18, 30, 49));
        nhapPassmoiTxf.setForeground(Color.WHITE);
        
        xacNhanPassmoiLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        xacNhanPassmoiLbl.setText("Xác nhận mật khẩu mới: ");
        xacNhanPassmoiLbl.setForeground(new Color(0, 204, 204));
        xacNhanPassmoiTxf.setBackground(new Color(18, 30, 49));
        xacNhanPassmoiTxf.setForeground(Color.WHITE);
        
        backBtnChangePass.setText("<=");
        backBtnChangePass.setFont(new Font("Dialog", Font.BOLD, 14));
        backBtnChangePass.setForeground(new Color(0, 204, 204));
        backBtnChangePass.setBackground(new Color(51, 65, 75));
 

        changePassButton.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        changePassButton.setForeground(new java.awt.Color(51, 255, 0));
        changePassButton.setText("Đổi Mật Khẩu");
        changePassButton.setBackground(new Color(51, 65, 75));


        javax.swing.GroupLayout changePassFrameLayout = new javax.swing.GroupLayout(changePassFrame.getContentPane());
        changePassFrame.getContentPane().setLayout(changePassFrameLayout);
        changePassFrameLayout.setHorizontalGroup(
            changePassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePassFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(changePassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changePassFrameLayout.createSequentialGroup()
                        .addGap(0, 66, Short.MAX_VALUE)
                        .addGroup(changePassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhapPassmoiLbl)
                            .addComponent(nhapPassLbl)
                            .addComponent(xacNhanPassmoiLbl))
                        .addGap(35, 35, 35)
                        .addGroup(changePassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhapPassmoiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhapPassTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xacNhanPassmoiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(changePassFrameLayout.createSequentialGroup()
                        .addComponent(userLblChangePass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtnChangePass)
                        .addGap(44, 44, 44))))
            .addGroup(changePassFrameLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(changePassButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        changePassFrameLayout.setVerticalGroup(
            changePassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePassFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(changePassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLblChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnChangePass))
                .addGap(30, 30, 30)
                .addGroup(changePassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhapPassLbl)
                    .addComponent(nhapPassTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(changePassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhapPassmoiLbl)
                    .addComponent(nhapPassmoiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(changePassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xacNhanPassmoiLbl)
                    .addComponent(xacNhanPassmoiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(changePassButton)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        changePINFrame.setSize(new java.awt.Dimension(600, 400));
        changePINFrame.getContentPane().setBackground(new Color(51, 51, 55));
        changePINFrame.setIconImage(imglogo);
        
        userLblChangePin.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblChangePin.setForeground(new java.awt.Color(51, 255, 153));
        userLblChangePin.setText("Username: ");

        nhapMaPinLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        nhapMaPinLbl.setText("Mã PIN hiện tại:");
        nhapMaPinLbl.setForeground(new Color(0, 204, 204));
        nhapMaPinLbl.setBackground(new Color(18, 30, 49));
        nhapMaPinTxf.setBackground(new Color(18, 30, 49));
        nhapMaPinTxf.setForeground(Color.WHITE);
        
        nhapPinmoiLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        nhapPinmoiLbl.setText("Nhập mã PIN mới: ");
        nhapPinmoiLbl.setForeground(new Color(0, 204, 204));
        nhapPinmoiLbl.setBackground(new Color(18, 30, 49));
        nhapPinmoiTxf.setBackground(new Color(18, 30, 49));
        nhapPinmoiTxf.setForeground(Color.WHITE);
        
        xacNhanPinMoiLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        xacNhanPinMoiLbl.setText("Xác nhận mã PIN mới: ");
        xacNhanPinMoiLbl.setForeground(new Color(0, 204, 204));
        xacNhanPinMoiLbl.setBackground(new Color(18, 30, 49));
        xacNhanPinmoiTxf.setBackground(new Color(18, 30, 49));
        xacNhanPinmoiTxf.setForeground(Color.WHITE);

        backBtnChangePin.setText("<-");
        backBtnChangePin.setFont(new Font("Dialog", Font.BOLD, 14));
        backBtnChangePin.setForeground(new Color(0, 204, 204));
        backBtnChangePin.setBackground(new Color(51, 65, 75));
        
        changePinButton.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        changePinButton.setForeground(new java.awt.Color(51, 255, 0));
        changePinButton.setText("Đổi Mã PIN");
        changePinButton.setForeground(new Color(0, 204, 204));
        changePinButton.setBackground(new Color(51, 65, 75));
        
        


        javax.swing.GroupLayout changePINFrameLayout = new javax.swing.GroupLayout(changePINFrame.getContentPane());
        changePINFrame.getContentPane().setLayout(changePINFrameLayout);
        changePINFrameLayout.setHorizontalGroup(
            changePINFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePINFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(changePINFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changePINFrameLayout.createSequentialGroup()
                        .addGap(0, 73, Short.MAX_VALUE)
                        .addGroup(changePINFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhapPinmoiLbl)
                            .addComponent(nhapMaPinLbl)
                            .addComponent(xacNhanPinMoiLbl))
                        .addGap(35, 35, 35)
                        .addGroup(changePINFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhapMaPinTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhapPinmoiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xacNhanPinmoiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePINFrameLayout.createSequentialGroup()
                        .addGroup(changePINFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(changePINFrameLayout.createSequentialGroup()
                                .addComponent(changePinButton)
                                .addGap(190, 190, 190))
                            .addGroup(changePINFrameLayout.createSequentialGroup()
                                .addComponent(userLblChangePin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtnChangePin)))
                        .addGap(47, 47, 47))))
        );
        changePINFrameLayout.setVerticalGroup(
            changePINFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePINFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(changePINFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLblChangePin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnChangePin))
                .addGap(30, 30, 30)
                .addGroup(changePINFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhapMaPinLbl)
                    .addComponent(nhapMaPinTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(changePINFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhapPinmoiLbl)
                    .addComponent(nhapPinmoiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(changePINFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xacNhanPinMoiLbl)
                    .addComponent(xacNhanPinmoiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(changePinButton)
                .addContainerGap(68, Short.MAX_VALUE))
        );


        chuyenTienFrame.setSize(new java.awt.Dimension(600, 400));
        chuyenTienFrame.getContentPane().setBackground(new Color(51, 51, 55));
        chuyenTienFrame.setIconImage(imglogo);
        
        userLblChuyenTien.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblChuyenTien.setForeground(new java.awt.Color(51, 255, 153));
        userLblChuyenTien.setText("Username: ");
        

        tkNguoiNhanLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        tkNguoiNhanLbl.setText("Số tài khoản người nhận: ");
        tkNguoiNhanLbl.setForeground(new Color(0, 204, 204));
        tkNguoiNhanLbl.setBackground(new Color(18, 30, 49));
        tkNguoiNhanTxf.setBackground(new Color(18, 30, 49));
        tkNguoiNhanTxf.setForeground(Color.WHITE);
        
        soTienChuyenLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        soTienChuyenLbl.setText("Số tiền chuyển: ");
        soTienChuyenLbl.setForeground(new Color(0, 204, 204));
        soTienChuyenLbl.setBackground(new Color(18, 30, 49));
        soTienChuyenTxf.setBackground(new Color(18, 30, 49));
        soTienChuyenTxf.setForeground(Color.WHITE);

        loiNhanLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        loiNhanLbl.setText("Lời nhắn: ");
        loiNhanLbl.setForeground(new Color(0, 204, 204));
        loiNhanLbl.setBackground(new Color(18, 30, 49));
        loiNhanTxf.setBackground(new Color(18, 30, 49));
        loiNhanTxf.setForeground(Color.WHITE);

        backBtnChuyenTien.setText("<-");
        backBtnChuyenTien.setFont(new Font("Dialog", Font.BOLD, 14));
        backBtnChuyenTien.setForeground(new Color(0, 204, 204));
        backBtnChuyenTien.setBackground(new Color(51, 65, 75));

        chuyenTienButton.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        chuyenTienButton.setForeground(new java.awt.Color(51, 255, 0));
        chuyenTienButton.setText("Chuyển Tiền");
        chuyenTienButton.setForeground(new Color(0, 204, 204));
        chuyenTienButton.setBackground(new Color(51, 65, 75));
        
        checkMaPinLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        checkMaPinLbl.setText("Nhập mã PIN:");
        checkMaPinLbl.setForeground(new Color(0, 204, 204));
        checkMaPinLbl.setBackground(new Color(18, 30, 49));
        checkPinFld.setBackground(new Color(18, 30, 49));
        checkPinFld.setForeground(Color.WHITE);

        javax.swing.GroupLayout chuyenTienFrameLayout = new javax.swing.GroupLayout(chuyenTienFrame.getContentPane());
        chuyenTienFrame.getContentPane().setLayout(chuyenTienFrameLayout);
        chuyenTienFrameLayout.setHorizontalGroup(
            chuyenTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chuyenTienFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(chuyenTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chuyenTienFrameLayout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addGroup(chuyenTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soTienChuyenLbl)
                            .addComponent(tkNguoiNhanLbl)
                            .addComponent(loiNhanLbl)
                            .addComponent(checkMaPinLbl))
                        .addGap(10, 10, 10)
                        .addGroup(chuyenTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soTienChuyenTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tkNguoiNhanTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loiNhanTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkPinFld, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(106, Short.MAX_VALUE))
                    .addGroup(chuyenTienFrameLayout.createSequentialGroup()
                        .addComponent(userLblChuyenTien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtnChuyenTien)
                        .addGap(47, 47, 47))))
            .addGroup(chuyenTienFrameLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(chuyenTienButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        chuyenTienFrameLayout.setVerticalGroup(
            chuyenTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chuyenTienFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(chuyenTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLblChuyenTien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnChuyenTien))
                .addGap(18, 18, 18)
                .addGroup(chuyenTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tkNguoiNhanTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tkNguoiNhanLbl))
                .addGap(33, 33, 33)
                .addGroup(chuyenTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soTienChuyenTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soTienChuyenLbl))
                .addGap(33, 33, 33)
                .addGroup(chuyenTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loiNhanTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loiNhanLbl))
                .addGap(35, 35, 35)
                .addGroup(chuyenTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPinFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMaPinLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chuyenTienButton)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        // Hoa Don Frame
        hoaDonFrame.setSize(new java.awt.Dimension(600, 400));
        hoaDonFrame.getContentPane().setBackground(new Color(51, 51, 55));
        hoaDonFrame.setIconImage(imglogo);
        
        userLblHoadon.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblHoadon.setForeground(new java.awt.Color(51, 255, 153));
        userLblHoadon.setText("Username: ");

        backBtnHoadon.setText("<-");
        backBtnHoadon.setFont(new Font("Dialog", Font.BOLD, 14));
        backBtnHoadon.setForeground(new Color(0, 204, 204));
        backBtnHoadon.setBackground(new Color(51, 65, 75));
        
        thanhToanHdBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        thanhToanHdBtn.setText("Thanh toán hóa đơn");
        thanhToanHdBtn.setForeground(new Color(0, 204, 204));
        thanhToanHdBtn.setBackground(new Color(51, 65, 75));

        xemHdBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        xemHdBtn.setText("Xem hóa đơn");
        xemHdBtn.setForeground(new Color(0, 204, 204));
        xemHdBtn.setBackground(new Color(51, 65, 75));

        javax.swing.GroupLayout hoaDonFrameLayout = new javax.swing.GroupLayout(hoaDonFrame.getContentPane());
        hoaDonFrame.getContentPane().setLayout(hoaDonFrameLayout);
        hoaDonFrameLayout.setHorizontalGroup(
            hoaDonFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoaDonFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(userLblHoadon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(backBtnHoadon)
                .addGap(47, 47, 47))
            .addGroup(hoaDonFrameLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(hoaDonFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thanhToanHdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xemHdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hoaDonFrameLayout.setVerticalGroup(
            hoaDonFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoaDonFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(hoaDonFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLblHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnHoadon))
                .addGap(42, 42, 42)
                .addComponent(xemHdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(thanhToanHdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        // Xem Hoa Don Frame
        xemHoaDonFrame.setSize(new java.awt.Dimension(600, 400));
        xemHoaDonFrame.getContentPane().setBackground(new Color(51, 51, 55));
        xemHoaDonFrame.setIconImage(imglogo);
        
        userLblxemHd.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblxemHd.setForeground(new java.awt.Color(51, 255, 153));
        userLblxemHd.setText("Username: ");

        backBtnXemHd.setText("<-");
        backBtnXemHd.setForeground(new Color(0, 204, 204));
        backBtnXemHd.setBackground(new Color(51, 65, 75));
        
        hoaDonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        hoaDonTable.setBackground(new Color(196, 221, 196));
        jScrollPane2.setViewportView(hoaDonTable);

        thongTinHdLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        thongTinHdLbl.setForeground(new java.awt.Color(0, 255, 51));
        thongTinHdLbl.setText("Thông tin hóa đơn");

        javax.swing.GroupLayout xemHoaDonFrameLayout = new javax.swing.GroupLayout(xemHoaDonFrame.getContentPane());
        xemHoaDonFrame.getContentPane().setLayout(xemHoaDonFrameLayout);
        xemHoaDonFrameLayout.setHorizontalGroup(
            xemHoaDonFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xemHoaDonFrameLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(xemHoaDonFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(xemHoaDonFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xemHoaDonFrameLayout.createSequentialGroup()
                        .addComponent(thongTinHdLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(xemHoaDonFrameLayout.createSequentialGroup()
                        .addComponent(userLblxemHd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                        .addComponent(backBtnXemHd)
                        .addGap(47, 47, 47))))
        );
        xemHoaDonFrameLayout.setVerticalGroup(
            xemHoaDonFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xemHoaDonFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(xemHoaDonFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLblxemHd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnXemHd))
                .addGap(16, 16, 16)
                .addComponent(thongTinHdLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        // Thanh Toan Hd Frame
        thanhToanHdFrame.setSize(new java.awt.Dimension(600, 400));
        thanhToanHdFrame.getContentPane().setBackground(new Color(51, 51, 55));
        thanhToanHdFrame.setIconImage(imglogo);
        
        userLblThanhToanHd.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblThanhToanHd.setForeground(new java.awt.Color(51, 255, 153));
        userLblThanhToanHd.setText("Username: ");

        backBtnThanhtoanHd.setText("<-");
        backBtnThanhtoanHd.setForeground(new Color(0, 204, 204));
        backBtnThanhtoanHd.setBackground(new Color(51, 65, 75));
        
        nhapMaHdLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        nhapMaHdLbl.setForeground(new java.awt.Color(0, 255, 51));
        nhapMaHdLbl.setText("Nhập mã hóa đơn muốn thanh toán vào ô bên dưới: ");


        xacNhanThanhtoanBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 20)); // NOI18N
        xacNhanThanhtoanBtn.setForeground(new java.awt.Color(0, 255, 51));
        xacNhanThanhtoanBtn.setText("Xác nhận thanh toán");
        xacNhanThanhtoanBtn.setForeground(new Color(0, 204, 204));
        xacNhanThanhtoanBtn.setBackground(new Color(51, 65, 75));

        javax.swing.GroupLayout thanhToanHdFrameLayout = new javax.swing.GroupLayout(thanhToanHdFrame.getContentPane());
        thanhToanHdFrame.getContentPane().setLayout(thanhToanHdFrameLayout);
        thanhToanHdFrameLayout.setHorizontalGroup(
            thanhToanHdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thanhToanHdFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(userLblThanhToanHd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(backBtnThanhtoanHd)
                .addGap(47, 47, 47))
            .addGroup(thanhToanHdFrameLayout.createSequentialGroup()
                .addGroup(thanhToanHdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thanhToanHdFrameLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(nhapMaHdLbl))
                    .addGroup(thanhToanHdFrameLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(xacNhanThanhtoanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(thanhToanHdFrameLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(nhapMaHdTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thanhToanHdFrameLayout.setVerticalGroup(
            thanhToanHdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thanhToanHdFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(thanhToanHdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLblThanhToanHd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnThanhtoanHd))
                .addGap(50, 50, 50)
                .addComponent(nhapMaHdLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nhapMaHdTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xacNhanThanhtoanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        // Tiet Kiem Frame
        tietKiemFrame.setSize(new java.awt.Dimension(600, 400));
        tietKiemFrame.getContentPane().setBackground(new Color(51, 51, 55));
        tietKiemFrame.setIconImage(imglogo);
        
        userLblTK.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblTK.setForeground(new java.awt.Color(51, 255, 153));
        userLblTK.setText("Username: ");

        backBtnTK.setText("<-");
        backBtnTK.setForeground(new Color(0, 204, 204));
        backBtnTK.setBackground(new Color(51, 65, 75));

        xemTKBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        xemTKBtn.setText("Xem lãi suất tiết kiệm");
        xemTKBtn.setForeground(new Color(0, 204, 204));
        xemTKBtn.setBackground(new Color(51, 65, 75));

        guiTKBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        guiTKBtn.setText("Gửi tiết kiệm");
        guiTKBtn.setForeground(new Color(0, 204, 204));
        guiTKBtn.setBackground(new Color(51, 65, 75));

        rutTKBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        rutTKBtn.setText("Rút tiết kiệm");
        rutTKBtn.setForeground(new Color(0, 204, 204));
        rutTKBtn.setBackground(new Color(51, 65, 75));
        
        javax.swing.GroupLayout tietKiemFrameLayout = new javax.swing.GroupLayout(tietKiemFrame.getContentPane());
        tietKiemFrame.getContentPane().setLayout(tietKiemFrameLayout);
        tietKiemFrameLayout.setHorizontalGroup(
            tietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tietKiemFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(userLblTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(backBtnTK)
                .addGap(47, 47, 47))
            .addGroup(tietKiemFrameLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(tietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rutTKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xemTKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guiTKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            
        );
        tietKiemFrameLayout.setVerticalGroup(
            tietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tietKiemFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLblTK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnTK))
                .addGap(18, 18, 18)
                .addComponent(guiTKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rutTKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xemTKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
  
        );
        
        // Vay Tien Frame
        vayTienFrame.setSize(new java.awt.Dimension(600, 400));
        vayTienFrame.getContentPane().setBackground(new Color(51, 51, 55));
        vayTienFrame.setIconImage(imglogo);
        
        userLblVaytien.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblVaytien.setForeground(new java.awt.Color(51, 255, 153));
        userLblVaytien.setText("Username: ");

        backBtnVaytien.setText("<-");
        backBtnVaytien.setForeground(new Color(0, 204, 204));
        backBtnVaytien.setBackground(new Color(51, 65, 75));

        xemLaisuatVayBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        xemLaisuatVayBtn.setText("Xem lãi suất vay");
        xemLaisuatVayBtn.setForeground(new Color(0, 204, 204));
        xemLaisuatVayBtn.setBackground(new Color(51, 65, 75));

        khoiTaoVayBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        khoiTaoVayBtn.setText("Khởi tạo khoản vay");
        khoiTaoVayBtn.setForeground(new Color(0, 204, 204));
        khoiTaoVayBtn.setBackground(new Color(51, 65, 75));

        thanhToanVayBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        thanhToanVayBtn.setText("Thanh toán khoản vay");
        thanhToanVayBtn.setForeground(new Color(0, 204, 204));
        thanhToanVayBtn.setBackground(new Color(51, 65, 75));

        javax.swing.GroupLayout vayTienFrameLayout = new javax.swing.GroupLayout(vayTienFrame.getContentPane());
        vayTienFrame.getContentPane().setLayout(vayTienFrameLayout);
        vayTienFrameLayout.setHorizontalGroup(
            vayTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vayTienFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(userLblVaytien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(backBtnVaytien)
                .addGap(47, 47, 47))
            .addGroup(vayTienFrameLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(vayTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thanhToanVayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xemLaisuatVayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(khoiTaoVayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vayTienFrameLayout.setVerticalGroup(
            vayTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vayTienFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(vayTienFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLblVaytien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnVaytien))
                .addGap(18, 18, 18)
                .addComponent(khoiTaoVayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(thanhToanVayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xemLaisuatVayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        // Gui TK Frame
        guiTietKiemFrame.setSize(new java.awt.Dimension(600, 400));
        guiTietKiemFrame.getContentPane().setBackground(new Color(51, 51, 55));
        guiTietKiemFrame.setIconImage(imglogo);
        
        userLblGuiTK.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblGuiTK.setForeground(new java.awt.Color(51, 255, 153));
        userLblGuiTK.setText("Username: ");


        hotenNguoiGuiLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        hotenNguoiGuiLbl.setText("Họ tên người gửi:");
        hotenNguoiGuiLbl.setForeground(new Color(0, 204, 204));
        hotenNguoiGuiLbl.setBackground(new Color(18, 30, 49));
        hotenNguoiGuiTxf.setBackground(new Color(18, 30, 49));
        hotenNguoiGuiTxf.setForeground(Color.WHITE);

        soTienGuiLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        soTienGuiLbl.setText("Số tiền gửi: ");
        soTienGuiLbl.setForeground(new Color(0, 204, 204));
        soTienGuiLbl.setBackground(new Color(18, 30, 49));
        soTienGuiTxf.setBackground(new Color(18, 30, 49));
        soTienGuiTxf.setForeground(Color.WHITE);

        soThangGuiLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        soThangGuiLbl.setText("Số tháng gửi: ");
        soThangGuiLbl.setForeground(new Color(0, 204, 204));
        soThangGuiLbl.setBackground(new Color(18, 30, 49));
        soThangGuiComboBox.setBackground(new Color(18, 30, 49));
        soThangGuiComboBox.setForeground(Color.WHITE);

        backBtnGuiTK.setText("<-");
        backBtnGuiTK.setForeground(new Color(0, 204, 204));
        backBtnGuiTK.setBackground(new Color(51, 65, 75));

        guiTKButton.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        guiTKButton.setText("Gửi Tiết Kiệm");
        guiTKButton.setForeground(new Color(0, 204, 204));
        guiTKButton.setBackground(new Color(51, 65, 75));


        soThangGuiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 tháng", "6 tháng", "12 tháng" }));

        noiDungGuiLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        noiDungGuiLbl.setText("Nội dung: ");
        noiDungGuiLbl.setForeground(new Color(0, 204, 204));
        noiDungGuiLbl.setBackground(new Color(18, 30, 49));
        noiDungGuiTxf.setBackground(new Color(18, 30, 49));
        noiDungGuiTxf.setForeground(Color.WHITE);



        maPinGuiTKLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        maPinGuiTKLbl.setText("Nhập mã PIN: ");
        maPinGuiTKLbl.setForeground(new Color(0, 204, 204));
        maPinGuiTKLbl.setBackground(new Color(18, 30, 49));
        maPinGuiTKTxf.setBackground(new Color(18, 30, 49));
        maPinGuiTKTxf.setForeground(Color.WHITE);

        javax.swing.GroupLayout guiTietKiemFrameLayout = new javax.swing.GroupLayout(guiTietKiemFrame.getContentPane());
        guiTietKiemFrame.getContentPane().setLayout(guiTietKiemFrameLayout);
        guiTietKiemFrameLayout.setHorizontalGroup(
            guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiTietKiemFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiTietKiemFrameLayout.createSequentialGroup()
                        .addComponent(userLblGuiTK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtnGuiTK)
                        .addGap(47, 47, 47))
                    .addGroup(guiTietKiemFrameLayout.createSequentialGroup()
                        .addGap(0, 97, Short.MAX_VALUE)
                        .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soTienGuiLbl)
                            .addComponent(hotenNguoiGuiLbl)
                            .addComponent(soThangGuiLbl)
                            .addComponent(maPinGuiTKLbl)
                            .addComponent(noiDungGuiLbl))
                        .addGap(35, 35, 35)
                        .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hotenNguoiGuiTxf, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(soTienGuiTxf))
                                .addComponent(soThangGuiComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(noiDungGuiTxf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(maPinGuiTKTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(108, Short.MAX_VALUE))))
            .addGroup(guiTietKiemFrameLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(guiTKButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        guiTietKiemFrameLayout.setVerticalGroup(
            guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiTietKiemFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLblGuiTK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnGuiTK))
                .addGap(18, 18, 18)
                .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hotenNguoiGuiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotenNguoiGuiLbl))
                .addGap(18, 18, 18)
                .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soTienGuiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soTienGuiLbl))
                .addGap(18, 18, 18)
                .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soThangGuiLbl)
                    .addComponent(soThangGuiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noiDungGuiTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noiDungGuiLbl))
                .addGap(18, 18, 18)
                .addGroup(guiTietKiemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maPinGuiTKLbl)
                    .addComponent(maPinGuiTKTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(guiTKButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        
        // Khoi Tao Vay Frame
        khoiTaoKhoanVayFrame.setSize(new java.awt.Dimension(600, 400));
        khoiTaoKhoanVayFrame.getContentPane().setBackground(new Color(51, 51, 55));
        khoiTaoKhoanVayFrame.setIconImage(imglogo);
        
        userLblXnVay.setFont(new java.awt.Font("Dialog", Font.BOLD, 16)); // NOI18N
        userLblXnVay.setForeground(new java.awt.Color(51, 255, 153));
        userLblXnVay.setText("Username: ");

        hotenNguoiVayLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        hotenNguoiVayLbl.setText("Họ tên người vay:");
        hotenNguoiVayLbl.setForeground(new Color(0, 204, 204));
        hotenNguoiVayLbl.setBackground(new Color(18, 30, 49));
        hotenNguoiVayTxf.setBackground(new Color(18, 30, 49));
        hotenNguoiVayTxf.setForeground(Color.WHITE);

        soTienVayLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        soTienVayLbl.setText("Số tiền vay: ");
        soTienVayLbl.setForeground(new Color(0, 204, 204));
        soTienVayLbl.setBackground(new Color(18, 30, 49));
        soTienVayTxf.setBackground(new Color(18, 30, 49));
        soTienVayTxf.setForeground(Color.WHITE);

        soThangVayLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        soThangVayLbl.setText("Số tháng vay:");
        soThangVayLbl.setForeground(new Color(0, 204, 204));
        soThangVayLbl.setBackground(new Color(18, 30, 49));
        soThangVayCombobox.setBackground(new Color(18, 30, 49));
        soThangVayCombobox.setForeground(Color.WHITE);

        backBtnKhoiTaoVay.setText("<-");
        backBtnKhoiTaoVay.setForeground(new Color(0, 204, 204));
        backBtnKhoiTaoVay.setBackground(new Color(51, 65, 75));
        
        xacNhanVayBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 18)); // NOI18N
        xacNhanVayBtn.setText("Xác nhận vay");
        xacNhanVayBtn.setForeground(new Color(0, 204, 204));
        xacNhanVayBtn.setBackground(new Color(51, 65, 75));

        soThangVayCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 tháng", "6 tháng", "12 tháng" }));

        noiDungVayLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        noiDungVayLbl.setText("Nội dung:");
        noiDungVayLbl.setForeground(new Color(0, 204, 204));
        noiDungVayLbl.setBackground(new Color(18, 30, 49));
        noiDungVayTxf.setBackground(new Color(18, 30, 49));
        noiDungVayTxf.setForeground(Color.WHITE);

        soCCCDLbl.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        soCCCDLbl.setText("Số CCCD:");
        soCCCDLbl.setForeground(new Color(0, 204, 204));
        soCCCDLbl.setBackground(new Color(18, 30, 49));
        soCCCDtxf.setBackground(new Color(18, 30, 49));
        soCCCDtxf.setForeground(Color.WHITE);

        luuYVayLbl.setText("*Lưu ý: vui lòng thanh toán khoản vay đúng hạn");
        luuYVayLbl.setForeground(new Color(51, 255, 153));

        javax.swing.GroupLayout khoiTaoKhoanVayFrameLayout = new javax.swing.GroupLayout(khoiTaoKhoanVayFrame.getContentPane());
        khoiTaoKhoanVayFrame.getContentPane().setLayout(khoiTaoKhoanVayFrameLayout);
        khoiTaoKhoanVayFrameLayout.setHorizontalGroup(
            khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khoiTaoKhoanVayFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(khoiTaoKhoanVayFrameLayout.createSequentialGroup()
                        .addComponent(luuYVayLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(khoiTaoKhoanVayFrameLayout.createSequentialGroup()
                        .addComponent(userLblXnVay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtnKhoiTaoVay)
                        .addGap(47, 47, 47))
                    .addGroup(khoiTaoKhoanVayFrameLayout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addGroup(khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soThangVayLbl)
                            .addComponent(noiDungVayLbl)
                            .addComponent(hotenNguoiVayLbl)
                            .addComponent(soCCCDLbl)
                            .addComponent(soTienVayLbl))
                        .addGap(62, 62, 62)
                        .addGroup(khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(soThangVayCombobox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noiDungVayTxf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(hotenNguoiVayTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(soCCCDtxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(soTienVayTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(106, Short.MAX_VALUE))))
            .addGroup(khoiTaoKhoanVayFrameLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(xacNhanVayBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        khoiTaoKhoanVayFrameLayout.setVerticalGroup(
            khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khoiTaoKhoanVayFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLblXnVay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtnKhoiTaoVay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hotenNguoiVayLbl)
                    .addComponent(hotenNguoiVayTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soCCCDtxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soCCCDLbl))
                .addGap(18, 18, 18)
                .addGroup(khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soTienVayLbl)
                    .addComponent(soTienVayTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soThangVayCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soThangVayLbl))
                .addGap(18, 18, 18)
                .addGroup(khoiTaoKhoanVayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noiDungVayLbl)
                    .addComponent(noiDungVayTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(xacNhanVayBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 30, 30)
                .addComponent(luuYVayLbl)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("mainFrame"); // NOI18N
        loginLabel.setFont(new java.awt.Font("Dialog", Font.BOLD, 28)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(51, 255, 153));
        loginLabel.setText("Vui lòng đăng nhập: ");
        

        accLabel.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        accLabel.setForeground(new Color(0, 204, 51));
        accLabel.setText("Tài khoản: ");

        passLabel.setFont(new java.awt.Font("Dialog", Font.BOLD, 14)); // NOI18N
        passLabel.setForeground(new Color(0, 204, 51));
        passLabel.setText("Mật khẩu: ");
        
        
        loginBtn.setFont(new java.awt.Font("Dialog", Font.BOLD, 14));
        loginBtn.setForeground(new Color(0, 204, 204));
        loginBtn.setText("Đăng Nhập");
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accLabel)
                            .addComponent(passLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accTxf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passFld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)))))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(loginLabel)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accLabel)
                    .addComponent(accTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel))
                .addGap(18, 18, 18)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        
        getAccessibleContext().setAccessibleName("mainFrame");

        pack();
        // event
        loginBtn.addActionListener(loginAc);
        xemSdBtn.addActionListener(showFrameAc);
        hoaDonBtn.addActionListener(showFrameAc);
        changePassBtn.addActionListener(showFrameAc);
        changePinBtn.addActionListener(showFrameAc);
        chuyenTienBtn.addActionListener(showFrameAc);
        vaytienBtn.addActionListener(showFrameAc);
        tietKiemBtn.addActionListener(showFrameAc);
        aboutBtn.addActionListener(showFrameAc);
        backBtnChangePass.setActionCommand("Back Pass");
        backBtnChangePin.setActionCommand("Back Pin");
        backBtnChuyenTien.setActionCommand("Back Chuyen Tien");
        backBtnVaytien.setActionCommand("Back Vay Tien");
        backBtnTK.setActionCommand("Back Tiet Kiem");
        backBtnHoadon.setActionCommand("Back Hoa Don");
        backBtnXemHd.setActionCommand("Back Xem Hd");
        backBtnThanhtoanHd.setActionCommand("Back TT Hd");
        backBtnChangePass.addActionListener(backAc);
        backBtnChangePin.addActionListener(backAc);
        backBtnChuyenTien.addActionListener(backAc);
        backBtnVaytien.addActionListener(backAc);
        backBtnTK.addActionListener(backAc);
        backBtnHoadon.addActionListener(backAc);
        backBtnXemHd.addActionListener(backAc);
        backBtnThanhtoanHd.addActionListener(backAc);
        changePassButton.setActionCommand("Doi Mat Khau Btn");
        changePassButton.addActionListener(chagePassAc);
        changePinButton.setActionCommand("Doi Ma Pin Btn");
        changePinButton.addActionListener(changePinAc);
        chuyenTienButton.addActionListener(chuyenTienAc);
        xemHdBtn.setActionCommand("Xem Hd Btn");
        thanhToanHdBtn.setActionCommand("Thanh Toan Hd Btn");
//        xemHdBtn.addActionListener(showFrameAc);
        xemHdBtn.addActionListener(xemHdAc);
        thanhToanHdBtn.addActionListener(showFrameAc);
        xacNhanThanhtoanBtn.setActionCommand("Xac Nhan Thanh Toan Hd Btn");
        xacNhanThanhtoanBtn.addActionListener(thanhToanHdAc);
        xemTKBtn.setActionCommand("Xem TK Btn");
        xemTKBtn.addActionListener(showFrameAc);
        guiTKBtn.setActionCommand("Gui TK Btn");
        guiTKBtn.addActionListener(showFrameAc);
        backBtnGuiTK.setActionCommand("Back Btn Gui TK");
        backBtnGuiTK.addActionListener(showFrameAc);
        guiTKButton.setActionCommand("Gui TK Button");
        guiTKButton.addActionListener(guiTKAc);
        rutTKBtn.setActionCommand("Rut TK Button");
        rutTKBtn.addActionListener(rutTKAc);
        xemLaisuatVayBtn.setActionCommand("Xem LS Vay Btn");
        xemLaisuatVayBtn.addActionListener(showFrameAc);
        khoiTaoVayBtn.setActionCommand("Khoi Tao Vay Btn");
        khoiTaoVayBtn.addActionListener(showFrameAc);
        xacNhanVayBtn.setActionCommand("Xac Nhan Vay Btn");
        xacNhanVayBtn.addActionListener(khoiTaoVayAc);
        backBtnKhoiTaoVay.setActionCommand("Back Btn Khoi Tao Vay");
        backBtnKhoiTaoVay.addActionListener(backAc);
        thanhToanVayBtn.setActionCommand("Thanh Toan Vay Btn");
        thanhToanVayBtn.addActionListener(thanhToanVayAc);
        
        
    }// </editor-fold>//GEN-END:initComponents

    public void setAccLabel(JLabel accLabel) {
        this.accLabel = accLabel;
    }

    public void setAccTxf(JTextField accTxf) {
        this.accTxf = accTxf;
    }

    public void setBackBtnChangePass(JButton backBtnChangePass) {
        this.backBtnChangePass = backBtnChangePass;
    }

    public void setBackBtnChangePin(JButton backBtnChangePin) {
        this.backBtnChangePin = backBtnChangePin;
    }

    public void setBackBtnChuyenTien(JButton backBtnChuyenTien) {
        this.backBtnChuyenTien = backBtnChuyenTien;
    }

    public void setBackBtnGuiTK(JButton backBtnGuiTK) {
        this.backBtnGuiTK = backBtnGuiTK;
    }

    public void setBackBtnHoadon(JButton backBtnHoadon) {
        this.backBtnHoadon = backBtnHoadon;
    }

    public void setBackBtnTK(JButton backBtnTK) {
        this.backBtnTK = backBtnTK;
    }

    public void setBackBtnThanhtoanHd(JButton backBtnThanhtoanHd) {
        this.backBtnThanhtoanHd = backBtnThanhtoanHd;
    }

    public void setBackBtnVaytien(JButton backBtnVaytien) {
        this.backBtnVaytien = backBtnVaytien;
    }

    public void setBackBtnXemHd(JButton backBtnXemHd) {
        this.backBtnXemHd = backBtnXemHd;
    }

    public void setBackBtnXemSd(JButton backBtnXemSd) {
        this.backBtnXemSd = backBtnXemSd;
    }

    public void setBackBtnXnVay(JButton backBtnXnVay) {
        this.backBtnKhoiTaoVay = backBtnXnVay;
    }

    public void setChangePINFrame(JFrame changePINFrame) {
        this.changePINFrame = changePINFrame;
    }

    public void setChangePassBtn(JButton changePassBtn) {
        this.changePassBtn = changePassBtn;
    }

    public void setChangePassButton(JButton changePassButton) {
        this.changePassButton = changePassButton;
    }

    public void setChangePassFrame(JFrame changePassFrame) {
        this.changePassFrame = changePassFrame;
    }

    public void setChangePinBtn(JButton changePinBtn) {
        this.changePinBtn = changePinBtn;
    }

    public void setChangePinButton(JButton changePinButton) {
        this.changePinButton = changePinButton;
    }

    public void setChuyenTienBtn(JButton chuyenTienBtn) {
        this.chuyenTienBtn = chuyenTienBtn;
    }

    public void setChuyenTienButton(JButton chuyenTienButton) {
        this.chuyenTienButton = chuyenTienButton;
    }

    public void setChuyenTienFrame(JFrame chuyenTienFrame) {
        this.chuyenTienFrame = chuyenTienFrame;
    }

    public void setGuiTKBtn(JButton guiTKBtn) {
        this.guiTKBtn = guiTKBtn;
    }

    public void setGuiTKButton(JButton guiTKButton) {
        this.guiTKButton = guiTKButton;
    }

    public void setGuiTietKiemFrame(JFrame guiTietKiemFrame) {
        this.guiTietKiemFrame = guiTietKiemFrame;
    }

    public void setHoaDonBtn(JButton hoaDonBtn) {
        this.hoaDonBtn = hoaDonBtn;
    }

    public void setHoaDonFrame(JFrame hoaDonFrame) {
        this.hoaDonFrame = hoaDonFrame;
    }

    public void setHoaDonTable(JTable hoaDonTable) {
        this.hoaDonTable = hoaDonTable;
    }

    public void setHotenNguoiGuiLbl(JLabel hotenNguoiGuiLbl) {
        this.hotenNguoiGuiLbl = hotenNguoiGuiLbl;
    }

    public void setHotenNguoiGuiTxf(JTextField hotenNguoiGuiTxf) {
        this.hotenNguoiGuiTxf = hotenNguoiGuiTxf;
    }

    public void setHotenNguoiVayLbl(JLabel hotenNguoiVayLbl) {
        this.hotenNguoiVayLbl = hotenNguoiVayLbl;
    }

    public void setHotenNguoiVayTxf(JTextField hotenNguoiVayTxf) {
        this.hotenNguoiVayTxf = hotenNguoiVayTxf;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public void setKhoiTaoKhoanVayFrame(JFrame khoiTaoKhoanVayFrame) {
        this.khoiTaoKhoanVayFrame = khoiTaoKhoanVayFrame;
    }

    public void setKhoiTaoVayBtn(JButton khoiTaoVayBtn) {
        this.khoiTaoVayBtn = khoiTaoVayBtn;
    }

    public void setLoginBtn(JButton loginBtn) {
        this.loginBtn = loginBtn;
    }

    public void setLoginFrame(JFrame loginFrame) {
        this.loginFrame = loginFrame;
    }

    public void setLoginLabel(JLabel loginLabel) {
        this.loginLabel = loginLabel;
    }

    public void setLoiNhanLbl(JLabel loiNhanLbl) {
        this.loiNhanLbl = loiNhanLbl;
    }

    public void setLoiNhanTxf(JTextField loiNhanTxf) {
        this.loiNhanTxf = loiNhanTxf;
    }

    public void setLuuYVayLbl(JLabel luuYVayLbl) {
        this.luuYVayLbl = luuYVayLbl;
    }

    public void setNhapMaHdLbl(JLabel nhapMaHdLbl) {
        this.nhapMaHdLbl = nhapMaHdLbl;
    }

    public void setNhapMaHdTxf(JTextField nhapMaHdTxf) {
        this.nhapMaHdTxf = nhapMaHdTxf;
    }

    public void setNhapMaPinLbl(JLabel nhapMaPinLbl) {
        this.nhapMaPinLbl = nhapMaPinLbl;
    }

    public void setNhapMaPinTxf(JPasswordField nhapMaPinTxf) {
        this.nhapMaPinTxf = nhapMaPinTxf;
    }

    public void setNhapPassLbl(JLabel nhapPassLbl) {
        this.nhapPassLbl = nhapPassLbl;
    }

    public void setNhapPassTxf(JPasswordField nhapPassTxf) {
        this.nhapPassTxf = nhapPassTxf;
    }

    public void setNhapPassmoiLbl(JLabel nhapPassmoiLbl) {
        this.nhapPassmoiLbl = nhapPassmoiLbl;
    }

    public void setNhapPassmoiTxf(JPasswordField nhapPassmoiTxf) {
        this.nhapPassmoiTxf = nhapPassmoiTxf;
    }

    public void setNhapPinmoiLbl(JLabel nhapPinmoiLbl) {
        this.nhapPinmoiLbl = nhapPinmoiLbl;
    }

    public void setNhapPinmoiTxf(JPasswordField nhapPinmoiTxf) {
        this.nhapPinmoiTxf = nhapPinmoiTxf;
    }

    public void setNoiDungGuiLbl(JLabel noiDungGuiLbl) {
        this.noiDungGuiLbl = noiDungGuiLbl;
    }

    public void setNoiDungGuiTxf(JTextField noiDungGuiTxf) {
        this.noiDungGuiTxf = noiDungGuiTxf;
    }

    public void setNoiDungVayLbl(JLabel noiDungVayLbl) {
        this.noiDungVayLbl = noiDungVayLbl;
    }

    public void setNoiDungVayTxf(JTextField noiDungVayTxf) {
        this.noiDungVayTxf = noiDungVayTxf;
    }

    public void setPassFld(JPasswordField passFld) {
        this.passFld = passFld;
    }

    public void setPassLabel(JLabel passLabel) {
        this.passLabel = passLabel;
    }

    public void setRutTKBtn(JButton rutTKBtn) {
        this.rutTKBtn = rutTKBtn;
    }

    public void setSoCCCDLbl(JLabel soCCCDLbl) {
        this.soCCCDLbl = soCCCDLbl;
    }

    public void setSoCCCDtxf(JTextField soCCCDtxf) {
        this.soCCCDtxf = soCCCDtxf;
    }

    public void setSoThangGuiComboBox(JComboBox<String> soThangGuiComboBox) {
        this.soThangGuiComboBox = soThangGuiComboBox;
    }

    public void setSoThangGuiLbl(JLabel soThangGuiLbl) {
        this.soThangGuiLbl = soThangGuiLbl;
    }

    public void setSoThangVayCombobox(JComboBox<String> soThangVayCombobox) {
        this.soThangVayCombobox = soThangVayCombobox;
    }

    public void setSoThangVayLbl(JLabel soThangVayLbl) {
        this.soThangVayLbl = soThangVayLbl;
    }

    public void setSoTienChuyenLbl(JLabel soTienChuyenLbl) {
        this.soTienChuyenLbl = soTienChuyenLbl;
    }

    public void setSoTienChuyenTxf(JTextField soTienChuyenTxf) {
        this.soTienChuyenTxf = soTienChuyenTxf;
    }

    public void setSoTienGuiLbl(JLabel soTienGuiLbl) {
        this.soTienGuiLbl = soTienGuiLbl;
    }

    public void setSoTienGuiTxf(JTextField soTienGuiTxf) {
        this.soTienGuiTxf = soTienGuiTxf;
    }

    public void setSoTienVayLbl(JLabel soTienVayLbl) {
        this.soTienVayLbl = soTienVayLbl;
    }

    public void setSoTienVayTxf(JTextField soTienVayTxf) {
        this.soTienVayTxf = soTienVayTxf;
    }

    public void setThanhToanHdBtn(JButton thanhToanHdBtn) {
        this.thanhToanHdBtn = thanhToanHdBtn;
    }

    public void setThanhToanHdFrame(JFrame thanhToanHdFrame) {
        this.thanhToanHdFrame = thanhToanHdFrame;
    }

    public void setThanhToanVayBtn(JButton thanhToanVayBtn) {
        this.thanhToanVayBtn = thanhToanVayBtn;
    }

    public void setThongTinHdLbl(JLabel thongTinHdLbl) {
        this.thongTinHdLbl = thongTinHdLbl;
    }

    public void setTietKiemBtn(JButton tietKiemBtn) {
        this.tietKiemBtn = tietKiemBtn;
    }

    public void setTietKiemFrame(JFrame tietKiemFrame) {
        this.tietKiemFrame = tietKiemFrame;
    }

    public void setTkNguoiNhanLbl(JLabel tkNguoiNhanLbl) {
        this.tkNguoiNhanLbl = tkNguoiNhanLbl;
    }

    public void setTkNguoiNhanTxf(JTextField tkNguoiNhanTxf) {
        this.tkNguoiNhanTxf = tkNguoiNhanTxf;
    }

    public void setUserLblChangePass(JLabel userLblChangePass) {
        this.userLblChangePass = userLblChangePass;
    }

    public void setUserLblChangePin(JLabel userLblChangePin) {
        this.userLblChangePin = userLblChangePin;
    }

    public void setUserLblChuyenTien(JLabel userLblChuyenTien) {
        this.userLblChuyenTien = userLblChuyenTien;
    }

    public void setUserLblGuiTK(JLabel userLblGuiTK) {
        this.userLblGuiTK = userLblGuiTK;
    }

    public void setUserLblHoadon(JLabel userLblHoadon) {
        this.userLblHoadon = userLblHoadon;
    }

    public void setUserLblLogin(JLabel userLblLogin) {
        this.userLblLogin = userLblLogin;
    }

    public void setUserLblTK(JLabel userLblTK) {
        this.userLblTK = userLblTK;
    }

    public void setUserLblThanhToanHd(JLabel userLblThanhToanHd) {
        this.userLblThanhToanHd = userLblThanhToanHd;
    }

    public void setUserLblVaytien(JLabel userLblVaytien) {
        this.userLblVaytien = userLblVaytien;
    }

    public void setUserLblXemSd(JLabel userLblXemSd) {
        this.userLblXemSd = userLblXemSd;
    }

    public void setUserLblXnVay(JLabel userLblXnVay) {
        this.userLblXnVay = userLblXnVay;
    }

    public void setUserLblxemHd(JLabel userLblxemHd) {
        this.userLblxemHd = userLblxemHd;
    }

    public void setVayTienFrame(JFrame vayTienFrame) {
        this.vayTienFrame = vayTienFrame;
    }

    public void setVaytienBtn(JButton vaytienBtn) {
        this.vaytienBtn = vaytienBtn;
    }

    public void setXacNhanPassmoiLbl(JLabel xacNhanPassmoiLbl) {
        this.xacNhanPassmoiLbl = xacNhanPassmoiLbl;
    }

    public void setXacNhanPassmoiTxf(JPasswordField xacNhanPassmoiTxf) {
        this.xacNhanPassmoiTxf = xacNhanPassmoiTxf;
    }

    public void setXacNhanPinMoiLbl(JLabel xacNhanPinMoiLbl) {
        this.xacNhanPinMoiLbl = xacNhanPinMoiLbl;
    }

    public void setXacNhanPinmoiTxf(JPasswordField xacNhanPinmoiTxf) {
        this.xacNhanPinmoiTxf = xacNhanPinmoiTxf;
    }

    public void setXacNhanThanhtoanBtn(JButton xacNhanThanhtoanBtn) {
        this.xacNhanThanhtoanBtn = xacNhanThanhtoanBtn;
    }

    public void setXacNhanVayBtn(JButton xacNhanVayBtn) {
        this.xacNhanVayBtn = xacNhanVayBtn;
    }

    public void setXemHdBtn(JButton xemHdBtn) {
        this.xemHdBtn = xemHdBtn;
    }

    public void setXemHoaDonFrame(JFrame xemHoaDonFrame) {
        this.xemHoaDonFrame = xemHoaDonFrame;
    }

    public void setXemLaisuatVayBtn(JButton xemLaisuatVayBtn) {
        this.xemLaisuatVayBtn = xemLaisuatVayBtn;
    }

    public void setXemSdBtn(JButton xemSdBtn) {
        this.xemSdBtn = xemSdBtn;
    }

    public void setXemSdFrame(JFrame xemSdFrame) {
        this.xemSdFrame = xemSdFrame;
    }

    public void setXemSdLbl(JLabel xemSdLbl) {
        this.xemSdLbl = xemSdLbl;
    }

    public void setXemTKBtn(JButton xemTKBtn) {
        this.xemTKBtn = xemTKBtn;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
    public JLabel getAccLabel() {
        return accLabel;
    }

    public JTextField getAccTxf() {
        return accTxf;
    }

    public JButton getBackBtnChangePass() {
        return backBtnChangePass;
    }

    public JButton getBackBtnChangePin() {
        return backBtnChangePin;
    }

    public JButton getBackBtnChuyenTien() {
        return backBtnChuyenTien;
    }

    public JButton getBackBtnGuiTK() {
        return backBtnGuiTK;
    }

    public JButton getBackBtnHoadon() {
        return backBtnHoadon;
    }

    public JButton getBackBtnTK() {
        return backBtnTK;
    }

    public JButton getBackBtnThanhtoanHd() {
        return backBtnThanhtoanHd;
    }

    public JButton getBackBtnVaytien() {
        return backBtnVaytien;
    }

    public JButton getBackBtnXemHd() {
        return backBtnXemHd;
    }

    public JButton getBackBtnXemSd() {
        return backBtnXemSd;
    }

    public JButton getBackBtnXnVay() {
        return backBtnKhoiTaoVay;
    }

    public JFrame getChangePINFrame() {
        return changePINFrame;
    }

    public JButton getChangePassBtn() {
        return changePassBtn;
    }

    public JButton getChangePassButton() {
        return changePassButton;
    }

    public JFrame getChangePassFrame() {
        return changePassFrame;
    }

    public JButton getChangePinBtn() {
        return changePinBtn;
    }

    public JButton getChangePinButton() {
        return changePinButton;
    }

    public JButton getChuyenTienBtn() {
        return chuyenTienBtn;
    }

    public JButton getChuyenTienButton() {
        return chuyenTienButton;
    }

    public JFrame getChuyenTienFrame() {
        return chuyenTienFrame;
    }

    public JButton getGuiTKBtn() {
        return guiTKBtn;
    }

    public JButton getGuiTKButton() {
        return guiTKButton;
    }

    public JFrame getGuiTietKiemFrame() {
        return guiTietKiemFrame;
    }

    public JButton getHoaDonBtn() {
        return hoaDonBtn;
    }

    public JFrame getHoaDonFrame() {
        return hoaDonFrame;
    }

    public JTable getHoaDonTable() {
        return hoaDonTable;
    }

    public JLabel getHotenNguoiGuiLbl() {
        return hotenNguoiGuiLbl;
    }

    public JTextField getHotenNguoiGuiTxf() {
        return hotenNguoiGuiTxf;
    }

    public JLabel getHotenNguoiVayLbl() {
        return hotenNguoiVayLbl;
    }

    public JTextField getHotenNguoiVayTxf() {
        return hotenNguoiVayTxf;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JFrame getKhoiTaoKhoanVayFrame() {
        return khoiTaoKhoanVayFrame;
    }

    public JButton getKhoiTaoVayBtn() {
        return khoiTaoVayBtn;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public JFrame getLoginFrame() {
        return loginFrame;
    }

    public JLabel getLoginLabel() {
        return loginLabel;
    }

    public JLabel getLoiNhanLbl() {
        return loiNhanLbl;
    }

    public JTextField getLoiNhanTxf() {
        return loiNhanTxf;
    }

    public JLabel getLuuYVayLbl() {
        return luuYVayLbl;
    }

    public JLabel getNhapMaHdLbl() {
        return nhapMaHdLbl;
    }

    public JTextField getNhapMaHdTxf() {
        return nhapMaHdTxf;
    }

    public JLabel getNhapMaPinLbl() {
        return nhapMaPinLbl;
    }

    public JPasswordField getNhapMaPinTxf() {
        return nhapMaPinTxf;
    }

    public JLabel getNhapPassLbl() {
        return nhapPassLbl;
    }

    public JPasswordField getNhapPassTxf() {
        return nhapPassTxf;
    }

    public JLabel getNhapPassmoiLbl() {
        return nhapPassmoiLbl;
    }

    public JPasswordField getNhapPassmoiTxf() {
        return nhapPassmoiTxf;
    }

    public JLabel getNhapPinmoiLbl() {
        return nhapPinmoiLbl;
    }

    public JPasswordField getNhapPinmoiTxf() {
        return nhapPinmoiTxf;
    }

    public JLabel getNoiDungGuiLbl() {
        return noiDungGuiLbl;
    }

    public JTextField getNoiDungGuiTxf() {
        return noiDungGuiTxf;
    }

    public JLabel getNoiDungVayLbl() {
        return noiDungVayLbl;
    }

    public JTextField getNoiDungVayTxf() {
        return noiDungVayTxf;
    }

    public JPasswordField getPassFld() {
        return passFld;
    }

    public JLabel getPassLabel() {
        return passLabel;
    }

    public JButton getRutTKBtn() {
        return rutTKBtn;
    }

    public JLabel getSoCCCDLbl() {
        return soCCCDLbl;
    }

    public JTextField getSoCCCDtxf() {
        return soCCCDtxf;
    }

    public JComboBox<String> getSoThangGuiComboBox() {
        return soThangGuiComboBox;
    }

    public JLabel getSoThangGuiLbl() {
        return soThangGuiLbl;
    }

    public JComboBox<String> getSoThangVayCombobox() {
        return soThangVayCombobox;
    }

    public JLabel getSoThangVayLbl() {
        return soThangVayLbl;
    }

    public JLabel getSoTienChuyenLbl() {
        return soTienChuyenLbl;
    }

    public JTextField getSoTienChuyenTxf() {
        return soTienChuyenTxf;
    }

    public JLabel getSoTienGuiLbl() {
        return soTienGuiLbl;
    }

    public JTextField getSoTienGuiTxf() {
        return soTienGuiTxf;
    }

    public JLabel getSoTienVayLbl() {
        return soTienVayLbl;
    }

    public JTextField getSoTienVayTxf() {
        return soTienVayTxf;
    }

    public JButton getThanhToanHdBtn() {
        return thanhToanHdBtn;
    }

    public JFrame getThanhToanHdFrame() {
        return thanhToanHdFrame;
    }

    public JButton getThanhToanVayBtn() {
        return thanhToanVayBtn;
    }

    public JLabel getThongTinHdLbl() {
        return thongTinHdLbl;
    }

    public JButton getTietKiemBtn() {
        return tietKiemBtn;
    }

    public JFrame getTietKiemFrame() {
        return tietKiemFrame;
    }

    public JLabel getTkNguoiNhanLbl() {
        return tkNguoiNhanLbl;
    }

    public JTextField getTkNguoiNhanTxf() {
        return tkNguoiNhanTxf;
    }

    public JLabel getUserLblChangePass() {
        return userLblChangePass;
    }

    public JLabel getUserLblChangePin() {
        return userLblChangePin;
    }

    public JLabel getUserLblChuyenTien() {
        return userLblChuyenTien;
    }

    public JLabel getUserLblGuiTK() {
        return userLblGuiTK;
    }

    public JLabel getUserLblHoadon() {
        return userLblHoadon;
    }

    public JLabel getUserLblLogin() {
        return userLblLogin;
    }

    public JLabel getUserLblTK() {
        return userLblTK;
    }

    public JLabel getUserLblThanhToanHd() {
        return userLblThanhToanHd;
    }

    public JLabel getUserLblVaytien() {
        return userLblVaytien;
    }

    public JLabel getUserLblXemSd() {
        return userLblXemSd;
    }

    public JLabel getUserLblXnVay() {
        return userLblXnVay;
    }

    public JLabel getUserLblxemHd() {
        return userLblxemHd;
    }

    public JFrame getVayTienFrame() {
        return vayTienFrame;
    }

    public JButton getVaytienBtn() {
        return vaytienBtn;
    }

    public JLabel getXacNhanPassmoiLbl() {
        return xacNhanPassmoiLbl;
    }

    public JPasswordField getXacNhanPassmoiTxf() {
        return xacNhanPassmoiTxf;
    }

    public JLabel getXacNhanPinMoiLbl() {
        return xacNhanPinMoiLbl;
    }

    public JPasswordField getXacNhanPinmoiTxf() {
        return xacNhanPinmoiTxf;
    }

    public JButton getXacNhanThanhtoanBtn() {
        return xacNhanThanhtoanBtn;
    }

    public JButton getXacNhanVayBtn() {
        return xacNhanVayBtn;
    }

    public JButton getXemHdBtn() {
        return xemHdBtn;
    }

    public JFrame getXemHoaDonFrame() {
        return xemHoaDonFrame;
    }

    public JButton getXemLaisuatVayBtn() {
        return xemLaisuatVayBtn;
    }

    public JButton getXemSdBtn() {
        return xemSdBtn;
    }

    public JFrame getXemSdFrame() {
        return xemSdFrame;
    }

    public JLabel getXemSdLbl() {
        return xemSdLbl;
    }

    public JButton getXemTKBtn() {
        return xemTKBtn;
    }

    public JRootPane getRootPane() {
        return rootPane;
    }

    public static int getNORMAL() {
        return NORMAL;
    }

    public static int getICONIFIED() {
        return ICONIFIED;
    }

    public static int getMAXIMIZED_HORIZ() {
        return MAXIMIZED_HORIZ;
    }

    public static int getMAXIMIZED_VERT() {
        return MAXIMIZED_VERT;
    }

    public static int getMAXIMIZED_BOTH() {
        return MAXIMIZED_BOTH;
    }

    public static float getTOP_ALIGNMENT() {
        return TOP_ALIGNMENT;
    }

    public static float getCENTER_ALIGNMENT() {
        return CENTER_ALIGNMENT;
    }

    public static float getBOTTOM_ALIGNMENT() {
        return BOTTOM_ALIGNMENT;
    }

    public static float getLEFT_ALIGNMENT() {
        return LEFT_ALIGNMENT;
    }

    public static float getRIGHT_ALIGNMENT() {
        return RIGHT_ALIGNMENT;
    }


    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static int getPROPERTIES() {
        return PROPERTIES;
    }

    public static int getSOMEBITS() {
        return SOMEBITS;
    }

    public static int getFRAMEBITS() {
        return FRAMEBITS;
    }

    public static int getALLBITS() {
        return ALLBITS;
    }

    public static int getERROR() {
        return ERROR;
    }

    public static int getABORT() {
        return ABORT;
    }

    public static int getDO_NOTHING_ON_CLOSE() {
        return DO_NOTHING_ON_CLOSE;
    }

    public static int getHIDE_ON_CLOSE() {
        return HIDE_ON_CLOSE;
    }

    public static int getDISPOSE_ON_CLOSE() {
        return DISPOSE_ON_CLOSE;
    }

    public static int getEXIT_ON_CLOSE() {
        return EXIT_ON_CLOSE;
    }
    
    public JLabel getCheckMaPinLbl() {
		return checkMaPinLbl;
	}
	public void setCheckMaPinLbl(JLabel checkMaPinLbl) {
		this.checkMaPinLbl = checkMaPinLbl;
	}
	public JPasswordField getCheckPinFld() {
		return checkPinFld;
	}
	public void setCheckPinFld(JPasswordField checkPinFld) {
		this.checkPinFld = checkPinFld;
	}
    public JLabel getMaPinGuiTKLbl() {
		return maPinGuiTKLbl;
	}
	public void setMaPinGuiTKLbl(JLabel maPinGuiTKLbl) {
		this.maPinGuiTKLbl = maPinGuiTKLbl;
	}
	public JPasswordField getMaPinGuiTKTxf() {
		return maPinGuiTKTxf;
	}
	public void setMaPinGuiTKTxf(JPasswordField maPinGuiTKTxf) {
		this.maPinGuiTKTxf = maPinGuiTKTxf;
	}
	public void showLoginFrame() {
        this.setVisible(false);
//        backController.openFrame(loginFrame);
        loginFrame.setVisible(true);
        loginFrame.setSize(600, 400);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);
        userLblLogin.setText(accTxf.getText());
    }
    public void showHoaDonFrame() {
        this.setVisible(false);
        hoaDonFrame.setVisible(true);
        hoaDonFrame.setLocationRelativeTo(null);
        hoaDonFrame.setSize(600, 400);
        hoaDonFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        userLblHoadon.setText(accTxf.getText());
        hoaDonFrame.setTitle("Hóa đơn");
    }
    public void showChangePassFrame() {//GEN-FIRST:event_changePassBtnActionPerformed
        // TODO add your handling code here:
        loginFrame.setVisible(false);
        changePassFrame.setVisible(true);
        changePassFrame.setLocationRelativeTo(null);
        changePassFrame.setSize(600, 400);
        changePassFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        userLblChangePass.setText(accTxf.getText());
        changePassFrame.setTitle("Đổi mật khẩu");
    }//GEN-LAST:event_changePassBtnActionPerformed

    public void backBtnChangePass() {//GEN-FIRST:event_backBtnChangePassActionPerformed
        // TODO add your handling code here:
        changePassFrame.setVisible(false);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnChangePassActionPerformed

    public void backBtnChangePin() {//GEN-FIRST:event_backBtnChangePinActionPerformed
        // TODO add your handling code here:
        changePINFrame.setVisible(false);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnChangePinActionPerformed

    public void showChangePinFrame() {//GEN-FIRST:event_changePinBtnActionPerformed
        // TODO add your handling code here:
        loginFrame.setVisible(false);
        changePINFrame.setVisible(true);
        changePINFrame.setLocationRelativeTo(null);
        changePINFrame.setTitle("Đổi mã PIN");
        changePINFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        userLblChangePin.setText(accTxf.getText());
    }//GEN-LAST:event_changePinBtnActionPerformed

    public void backBtnChuyenTien() {//GEN-FIRST:event_backBtnChuyenTienActionPerformed
        // TODO add your handling code here:
        chuyenTienFrame.setVisible(false);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnChuyenTienActionPerformed

    public void showChuyenTienFrame() {//GEN-FIRST:event_chuyenTienBtnActionPerformed
        // TODO add your handling code here:
        loginFrame.setVisible(false);
        chuyenTienFrame.setVisible(true);
        chuyenTienFrame.setLocationRelativeTo(null);
        chuyenTienFrame.setTitle("Chuyển Tiền");
        chuyenTienFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        userLblChuyenTien.setText(accTxf.getText());
    }//GEN-LAST:event_chuyenTienBtnActionPerformed

    public void backBtnHoadon() {//GEN-FIRST:event_backBtnHoadonActionPerformed
        // TODO add your handling code here:
        hoaDonFrame.setVisible(false);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnHoadonActionPerformed

    public void backBtnXemHd() {//GEN-FIRST:event_backBtnXemHdActionPerformed
        // TODO add your handling code here:
        xemHoaDonFrame.setVisible(false);
        hoaDonFrame.setVisible(true);
        xemHoaDonFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnXemHdActionPerformed

    public void showXemHdFrame() {//GEN-FIRST:event_xemHdBtnActionPerformed
        // TODO add your handling code here:
        hoaDonFrame.setVisible(false);
        xemHoaDonFrame.setVisible(true);
        xemHoaDonFrame.setLocationRelativeTo(null);
        xemHoaDonFrame.setTitle("Xem hóa đơn");
        xemHoaDonFrame.setSize(600, 400);
        xemHoaDonFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        userLblxemHd.setText(accTxf.getText());
    }//GEN-LAST:event_xemHdBtnActionPerformed

    public void backBtnThanhtoanHd() {//GEN-FIRST:event_backBtnThanhtoanHdActionPerformed
        // TODO add your handling code here:
        thanhToanHdFrame.setVisible(false);
        hoaDonFrame.setVisible(true);
        hoaDonFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnThanhtoanHdActionPerformed


    public void showThanhToanHdFrame() {//GEN-FIRST:event_thanhToanHdBtnActionPerformed
        // TODO add your handling code here:
        hoaDonFrame.setVisible(false);
        thanhToanHdFrame.setVisible(true);
        thanhToanHdFrame.setLocationRelativeTo(null);
        thanhToanHdFrame.setTitle("Thanh toán hóa đơn");
        thanhToanHdFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        userLblThanhToanHd.setText(accTxf.getText());
        
    }//GEN-LAST:event_thanhToanHdBtnActionPerformed

    public void backBtnTK() {//GEN-FIRST:event_backBtnTKActionPerformed
        // TODO add your handling code here:
        tietKiemFrame.setVisible(false);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnTKActionPerformed

    public void showGuiTK() {//GEN-FIRST:event_guiTKBtnActionPerformed
        // TODO add your handling code here:
        tietKiemFrame.setVisible(false);
        guiTietKiemFrame.setVisible(true);
        guiTietKiemFrame.setLocationRelativeTo(null);
        guiTietKiemFrame.setTitle("Gửi tiết kiệm");
        guiTietKiemFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        userLblGuiTK.setText(accTxf.getText());
    }//GEN-LAST:event_guiTKBtnActionPerformed

    public void backBtnVaytien() {//GEN-FIRST:event_backBtnVaytienActionPerformed
        // TODO add your handling code here:
        vayTienFrame.setVisible(false);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);

    }//GEN-LAST:event_backBtnVaytienActionPerformed


    public void khoiTaoVayBtn() {//GEN-FIRST:event_khoiTaoVayBtnActionPerformed
        // TODO add your handling code here:
        vayTienFrame.setVisible(false);
        khoiTaoKhoanVayFrame.setVisible(true);
        khoiTaoKhoanVayFrame.setLocationRelativeTo(null);
        userLblXnVay.setText(accTxf.getText());
        khoiTaoKhoanVayFrame.setTitle("Khởi tạo khoản vay");
    }//GEN-LAST:event_khoiTaoVayBtnActionPerformed

    public void showVaytienFrame() {//GEN-FIRST:event_vaytienBtnActionPerformed
        // TODO add your handling code here:
        loginFrame.setVisible(false);
        vayTienFrame.setVisible(true);
        vayTienFrame.setLocationRelativeTo(null);
        vayTienFrame.setTitle("Vay tiền");
        vayTienFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        vayTienFrame.setSize(600, 400);
        userLblVaytien.setText(accTxf.getText());
    }//GEN-LAST:event_vaytienBtnActionPerformed

    public void showTietKiemFrame() {//GEN-FIRST:event_tietKiemBtnActionPerformed
        // TODO add your handling code here:
        loginFrame.setVisible(false);
        tietKiemFrame.setVisible(true);
        tietKiemFrame.setLocationRelativeTo(null);
        tietKiemFrame.setTitle("Tiết kiệm");
        tietKiemFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tietKiemFrame.setSize(600, 400);
        userLblTK.setText(accTxf.getText());
    }//GEN-LAST:event_tietKiemBtnActionPerformed

    public void backBtnGuiTK() {//GEN-FIRST:event_backBtnGuiTKActionPerformed
        // TODO add your handling code here:
        guiTietKiemFrame.setVisible(false);
        tietKiemFrame.setVisible(true);
        tietKiemFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnGuiTKActionPerformed

    public void backBtnXnVay() {//GEN-FIRST:event_backBtnXnVayActionPerformed
        // TODO add your handling code here:
        khoiTaoKhoanVayFrame.setVisible(false);
        vayTienFrame.setVisible(true);
        vayTienFrame.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_backBtnXnVayActionPerformed

    public static void main(String args[]) {
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accLabel;
    private javax.swing.JTextField accTxf;
    private javax.swing.JButton backBtnChangePass;
    private javax.swing.JButton backBtnChangePin;
    private javax.swing.JButton backBtnChuyenTien;
    private javax.swing.JButton backBtnGuiTK;
    private javax.swing.JButton backBtnHoadon;
    private javax.swing.JButton backBtnTK;
    private javax.swing.JButton backBtnThanhtoanHd;
    private javax.swing.JButton backBtnVaytien;
    private javax.swing.JButton backBtnXemHd;
    private javax.swing.JButton backBtnXemSd;
    private javax.swing.JButton backBtnKhoiTaoVay;
    private javax.swing.JFrame changePINFrame;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JButton changePassButton;
    private javax.swing.JFrame changePassFrame;
    private javax.swing.JButton changePinBtn;
    private javax.swing.JButton changePinButton;
    private javax.swing.JLabel checkMaPinLbl;
    private javax.swing.JPasswordField checkPinFld;
    private javax.swing.JButton chuyenTienBtn;
    private javax.swing.JButton chuyenTienButton;
    private javax.swing.JFrame chuyenTienFrame;
    private javax.swing.JButton guiTKBtn;
    private javax.swing.JButton guiTKButton;
    private javax.swing.JFrame guiTietKiemFrame;
    private javax.swing.JButton hoaDonBtn;
    private javax.swing.JFrame hoaDonFrame;
    private javax.swing.JTable hoaDonTable;
    private javax.swing.JLabel hotenNguoiGuiLbl;
    private javax.swing.JTextField hotenNguoiGuiTxf;
    private javax.swing.JLabel hotenNguoiVayLbl;
    private javax.swing.JTextField hotenNguoiVayTxf;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFrame khoiTaoKhoanVayFrame;
    private javax.swing.JButton khoiTaoVayBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JFrame loginFrame;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loiNhanLbl;
    private javax.swing.JTextField loiNhanTxf;
    private javax.swing.JLabel luuYVayLbl;
    private javax.swing.JLabel nhapMaHdLbl;
    private javax.swing.JTextField nhapMaHdTxf;
    private javax.swing.JLabel nhapMaPinLbl;
    private javax.swing.JPasswordField nhapMaPinTxf;
    private javax.swing.JLabel nhapPassLbl;
    private javax.swing.JPasswordField nhapPassTxf;
    private javax.swing.JLabel nhapPassmoiLbl;
    private javax.swing.JPasswordField nhapPassmoiTxf;
    private javax.swing.JLabel nhapPinmoiLbl;
    private javax.swing.JPasswordField nhapPinmoiTxf;
    private javax.swing.JLabel noiDungGuiLbl;
    private javax.swing.JTextField noiDungGuiTxf;
    private javax.swing.JLabel noiDungVayLbl;
    private javax.swing.JTextField noiDungVayTxf;
    private javax.swing.JPasswordField passFld;
    private javax.swing.JLabel passLabel;
    private javax.swing.JButton rutTKBtn;
    private javax.swing.JLabel soCCCDLbl;
    private javax.swing.JTextField soCCCDtxf;
    private javax.swing.JComboBox<String> soThangGuiComboBox;
    private javax.swing.JLabel soThangGuiLbl;
    private javax.swing.JComboBox<String> soThangVayCombobox;
    private javax.swing.JLabel soThangVayLbl;
    private javax.swing.JLabel soTienChuyenLbl;
    private javax.swing.JTextField soTienChuyenTxf;
    private javax.swing.JLabel soTienGuiLbl;
    private javax.swing.JTextField soTienGuiTxf;
    private javax.swing.JLabel soTienVayLbl;
    private javax.swing.JTextField soTienVayTxf;
    private javax.swing.JButton thanhToanHdBtn;
    private javax.swing.JFrame thanhToanHdFrame;
    private javax.swing.JButton thanhToanVayBtn;
    private javax.swing.JLabel thongTinHdLbl;
    private javax.swing.JButton tietKiemBtn;
    private javax.swing.JFrame tietKiemFrame;
    private javax.swing.JLabel tkNguoiNhanLbl;
    private javax.swing.JTextField tkNguoiNhanTxf;
    private javax.swing.JLabel userLblChangePass;
    private javax.swing.JLabel userLblChangePin;
    private javax.swing.JLabel userLblChuyenTien;
    private javax.swing.JLabel userLblGuiTK;
    private javax.swing.JLabel userLblHoadon;
    private javax.swing.JLabel userLblLogin;
    private javax.swing.JLabel userLblTK;
    private javax.swing.JLabel userLblThanhToanHd;
    private javax.swing.JLabel userLblVaytien;
    private javax.swing.JLabel userLblXemSd;
    private javax.swing.JLabel userLblXnVay;
    private javax.swing.JLabel userLblxemHd;
    private javax.swing.JFrame vayTienFrame;
    private javax.swing.JButton vaytienBtn;
    private javax.swing.JLabel xacNhanPassmoiLbl;
    private javax.swing.JPasswordField xacNhanPassmoiTxf;
    private javax.swing.JLabel xacNhanPinMoiLbl;
    private javax.swing.JPasswordField xacNhanPinmoiTxf;
    private javax.swing.JButton xacNhanThanhtoanBtn;
    private javax.swing.JButton xacNhanVayBtn;
    private javax.swing.JButton xemHdBtn;
    private javax.swing.JFrame xemHoaDonFrame;
    private javax.swing.JButton xemLaisuatVayBtn;
    private javax.swing.JButton xemSdBtn;
    private javax.swing.JFrame xemSdFrame;
    private javax.swing.JLabel xemSdLbl;
    private javax.swing.JButton xemTKBtn;
    private javax.swing.JLabel maPinGuiTKLbl;
    private javax.swing.JPasswordField maPinGuiTKTxf;
    private javax.swing.JButton aboutBtn;
    // End of variables declaration//GEN-END:variables
//    màu user label Color(51, 255, 153)
}
