package pekan8_2511532011;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tugasPekan8_2511532011 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Bil1;
	private JTextField Hasil;
	
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
					tugasPekan8_2511532011 frame = new tugasPekan8_2511532011();
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
	public tugasPekan8_2511532011() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Bil1 = new JTextField();
		Bil1.setBounds(103, 54, 96, 20);
		contentPane.add(Bil1);
		Bil1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Bil1");
		lblNewLabel.setBounds(25, 57, 49, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox cbAssigment = new JComboBox();
		cbAssigment.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		cbAssigment.setBounds(103, 85, 95, 22);
		contentPane.add(cbAssigment);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(25, 89, 49, 14);
		contentPane.add(lblOperator);
		
		JButton Process = new JButton("Process");
		Process.addActionListener(new ActionListener() {
			int a = 0;
			public void actionPerformed(ActionEvent e) {
				
				if (Bil1.getText().trim().isEmpty()) {
					pesanPeringatan("Input tidak boleh kosong");
				} else if (Bil1.getText().equals("0")) {
					pesanPeringatan("Silahkan Input Bilangan selain 0");
				} else {
					try {
						int b = Integer.parseInt(Bil1.getText());
						int c = cbAssigment.getSelectedIndex();
						
						if (c==0) {
							a += b;
						} else if (c==1) {
							a -= b;
						} else if (c==2) {
							a *= b;
						} else if (c==3) {
							a /= b;
						} else if (c==4) {
							a %= b;
						}
						Hasil.setText(String.valueOf(a));
						
					}  catch (NumberFormatException ex) {
						pesanError("Bilangan 1 harus Angka");
					}
				}
			}
		});
		Process.setBounds(229, 85, 89, 23);
		contentPane.add(Process);
		
		JLabel lblOperatorAssignment = new JLabel("OPERATOR ASSIGNMENT");
		lblOperatorAssignment.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblOperatorAssignment.setBounds(152, 11, 143, 14);
		contentPane.add(lblOperatorAssignment);
		
		JLabel lblHasilbil = new JLabel("Hasil(Bil1)");
		lblHasilbil.setBounds(25, 121, 62, 14);
		contentPane.add(lblHasilbil);
		
		Hasil = new JTextField();
		Hasil.setColumns(10);
		Hasil.setBounds(103, 118, 96, 20);
		contentPane.add(Hasil);

	}
}
