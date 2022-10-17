package pratica03;
/**
 * @author Alexandre deucher
 * @Date 16/10/2022
 * 
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Ex03 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex03 frame = new Ex03();
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
	public Ex03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> box = new JComboBox();
		box.setBounds(84, 50, 131, 22);

		/*
		 * String[] vet= {"Brasil", "Argentina", "Chile", "Uruguai"}; for (int i = 0; i
		 * < vet.length; i++) {
		 * 
		 * }
		 */

		box.addItem("Brasil");
		box.addItem("Uruguai");
		box.addItem("Argentina");
		box.addItem("Chile");
		contentPane.add(box);

		JLabel lblNewLabel = new JLabel("opções");
		lblNewLabel.setBounds(28, 54, 46, 14);
		contentPane.add(lblNewLabel);
				
						
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setBounds(52, 83, 372, 153);
						contentPane.add(scrollPane);
						
								JTextArea textArea = new JTextArea();
								scrollPane.setViewportView(textArea);

								JButton btnAdicionar = new JButton("ADICIONAR");
								btnAdicionar.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										
										String valorSelecionado = (String) box.getSelectedItem();
										textArea.setText(textArea.getText()+valorSelecionado+"   ||||||||   ");
										
									}
								});
								btnAdicionar.setBounds(245, 50, 96, 23);
								contentPane.add(btnAdicionar);
	}
}