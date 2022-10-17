package pratica02;
/**
 * @author Alexandre deucher
 * @date 16/10/2022
 * 
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex02 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex02 frame = new Ex02();
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
	public Ex02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBackground(new Color(192, 192, 192));
		txtNome.setBounds(155, 37, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setBackground(new Color(192, 192, 192));
		txtNota1.setBounds(155, 72, 86, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBackground(new Color(192, 192, 192));
		txtNota2.setBounds(155, 111, 86, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBackground(new Color(192, 192, 192));
		txtNota3.setBounds(155, 142, 86, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(99, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota1:");
		lblNewLabel_1.setBounds(99, 75, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota2:");
		lblNewLabel_2.setBounds(99, 114, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota3:");
		lblNewLabel_3.setBounds(99, 145, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtName=txtNome.getText();
				
				String txtN=txtNota1.getText();
				String txtN2=txtNota2.getText();
				String txtN3=txtNota3.getText();
				
				if(!txtN.isEmpty() && !txtN2.isEmpty() && !txtN3.isEmpty()) {
					Double n1=Double.valueOf(txtN);
					Double n2=Double.valueOf(txtN2);
					Double n3=Double.valueOf(txtN3);
					
					JOptionPane.showMessageDialog(null,(n1+n2+n3)/3);
				}
				
			}
		});
		btnCalc.setBackground(new Color(192, 192, 192));
		btnCalc.setBounds(143, 187, 119, 23);
		contentPane.add(btnCalc);
	}
}