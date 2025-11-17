package pekan8_2511532011;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperartorAritmatikaGUI_2511532011 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBilangan1;
	private JTextField txtBilangan2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperartorAritmatikaGUI_2511532011 frame = new OperartorAritmatikaGUI_2511532011();
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
	public OperartorAritmatikaGUI_2511532011() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan1");
		lblNewLabel_1.setBounds(20, 54, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setBounds(174, 10, 142, 16);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan2");
		lblNewLabel_1_1.setBounds(20, 89, 60, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setBounds(20, 124, 49, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setBounds(20, 157, 49, 14);
		contentPane.add(lblNewLabel_1_3);
		
		txtBilangan1 = new JTextField();
		txtBilangan1.setBounds(90, 51, 96, 20);
		contentPane.add(txtBilangan1);
		txtBilangan1.setColumns(10);
		
		txtBilangan2 = new JTextField();
		txtBilangan2.setColumns(10);
		txtBilangan2.setBounds(90, 86, 96, 20);
		contentPane.add(txtBilangan2);
		
		txtHasil = new JTextField();
		txtHasil.setColumns(10);
		txtHasil.setBounds(90, 154, 96, 20);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(90, 120, 96, 22);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBilangan1.getText().trim().isEmpty()) {
					pesanPeringatan("Silahkan Input Bilangan 1");
				} else if (txtBilangan2.getText().trim().isEmpty()) {
					pesanPeringatan("Silahkan Input Bilangan 2");
				} else if (txtBilangan2.getText().trim()=="0") {
					pesanPeringatan("Silahkan Input Bilangan selain 0");
				} else {
					try {
						int a = Integer.parseInt(txtBilangan1.getText());
						int b = Integer.parseInt(txtBilangan2.getText());
						int c = cbOperator.getSelectedIndex();
						
						if (c== 0) {
							hasil = a+b;
						} else if (c==1) {
							hasil = a-b;
						} else if (c==2) {
							hasil =a*b;
						} else if (c==3) {
							hasil =a/b;
						} else if (c==4) {
							hasil =a%b;
						}
						
						txtHasil.setText(String.valueOf(hasil));
			
					} catch (NumberFormatException ex) {
						pesanError("Bilangan 1 Atau Bilangan 2 Harus Angka");
					}
				}
			}
		});
		btnNewButton.setBounds(208, 120, 89, 23);
		contentPane.add(btnNewButton);

	}
}
