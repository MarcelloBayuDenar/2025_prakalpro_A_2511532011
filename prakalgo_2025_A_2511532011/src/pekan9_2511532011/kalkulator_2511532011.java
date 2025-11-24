package pekan9_2511532011;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kalkulator_2511532011 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfTampil;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnJumlah_2511532011;
	private JButton btnTambah_2511532011;
	private JButton btnKurang_25115320111;
	private JButton btnKali_2511532011;
	private JButton btnBagi_2511532011;
	private JButton btnMod_2511532011;
	private double a;
	private double b;
	
	Boolean tambah = false;
	Boolean kurang = false;
	Boolean kali = false;
	Boolean bagi = false;
	Boolean mod = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator_2511532011 frame = new kalkulator_2511532011();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public kalkulator_2511532011() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "7" );
			}
		});
		btn7.setBounds(10, 138, 51, 48);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "4" );
				
			}
		});
		btn4.setBounds(10, 197, 51, 48);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "1" );
			}
		});
		btn1.setBounds(10, 256, 51, 48);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "2" );
			}
		});
		btn2.setBounds(71, 256, 51, 48);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "3" );
			}
		});
		btn3.setBounds(132, 256, 51, 48);
		contentPane.add(btn3);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "5" );
				
			}
		});
		btn5.setBounds(71, 197, 51, 48);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "6" );
			}
		});
		btn6.setBounds(132, 197, 51, 48);
		contentPane.add(btn6);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "8" );
			}
		});
		btn8.setBounds(71, 138, 51, 48);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "9" );
			}
		});
		btn9.setBounds(132, 138, 51, 48);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "0" );
			}
		});
		btn0.setBounds(10, 315, 51, 48);
		contentPane.add(btn0);
		
		JButton btnKoma = new JButton(".");
		btnKoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtfTampil.getText().contains(".")) {
					txtfTampil.setText(txtfTampil.getText() + ".");
				}
			}
		});
		btnKoma.setBounds(71, 315, 51, 48);
		contentPane.add(btnKoma);
		
		JButton btnJumlah_2511532011 = new JButton("=");
		btnJumlah_2511532011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b = Double.parseDouble(txtfTampil.getText());
				if (tambah == true ) {
					b = a + b;
				} else if (kurang == true ) {
					b = a - b;
				} else if (kali == true ) {
					b = a * b;
				} else if (bagi == true ) {
					b = a / b;
				} else if (mod == true ) {
					b = a%b;
				}
				txtfTampil.setText(Double.toString(b));
				
				tambah = false;
				kurang = false;
				kali = false;
				bagi = false;
				mod = false;
			}
		});
		btnJumlah_2511532011.setBounds(132, 315, 51, 48);
		contentPane.add(btnJumlah_2511532011);
		
		JButton btnMod_2511532011 = new JButton("%");
		btnMod_2511532011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtfTampil.getText());
				txtfTampil.setText("");
				mod = true;
			}
		});
		btnMod_2511532011.setBounds(193, 315, 51, 48);
		contentPane.add(btnMod_2511532011);
		
		JButton btnBagi_2511532011 = new JButton("/");
		btnBagi_2511532011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtfTampil.getText());
				txtfTampil.setText("");
				bagi = true;
			}
		});
		btnBagi_2511532011.setBounds(193, 256, 51, 48);
		contentPane.add(btnBagi_2511532011);
		
		JButton btnKali_2511532011 = new JButton("*");
		btnKali_2511532011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtfTampil.getText());
				txtfTampil.setText("");
				kali = true;
			}
		});
		btnKali_2511532011.setBounds(193, 197, 51, 48);
		contentPane.add(btnKali_2511532011);
		
		JButton btnKurang_2511532011 = new JButton("-");
		btnKurang_2511532011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtfTampil.getText());
				txtfTampil.setText("");
				kurang = true;
			}
		});
		btnKurang_2511532011.setBounds(193, 138, 51, 48);
		contentPane.add(btnKurang_2511532011);
		
		JButton btnPanah = new JButton("<-");
		btnPanah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current = txtfTampil.getText();
				if(!current.isEmpty()) {
					txtfTampil.setText(current.substring(0, current.length() - 1));
				}
			}
		});
		btnPanah.setBounds(10, 79, 51, 48);
		contentPane.add(btnPanah);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText("");
				tambah = false;
				kurang = false;
				kali = false;
				bagi = false;
				mod = false;
				
				a = 0;
				b = 0;
				
			}
		});
		btnC.setBounds(71, 79, 51, 48);
		contentPane.add(btnC);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfTampil.setText(txtfTampil.getText() + "00");
			}
		});
		btn00.setBounds(132, 79, 51, 48);
		contentPane.add(btn00);
		
		JButton btnTambah_2511532011 = new JButton("+");
		btnTambah_2511532011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtfTampil.getText());
				txtfTampil.setText("");
				tambah = true;
			}
		});
		btnTambah_2511532011.setBounds(193, 79, 51, 48);
		contentPane.add(btnTambah_2511532011);
		
		txtfTampil = new JTextField();
		txtfTampil.setBounds(10, 11, 230, 48);
		contentPane.add(txtfTampil);
		txtfTampil.setColumns(10);
	}
}
