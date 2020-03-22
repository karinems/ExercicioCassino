package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.ControllerCassino;

public class Cassino extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tela1;
	private JTextField tela2;
	private JTextField tela3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cassino frame = new Cassino();
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
	public Cassino() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tela1 = new JTextField();
		tela1.setHorizontalAlignment(SwingConstants.CENTER);
		tela1.setFont(new Font("Tahoma", Font.BOLD, 17));
		tela1.setText("5");
		tela1.setBounds(27, 100, 103, 45);
		contentPane.add(tela1);
		tela1.setColumns(10);
		
		tela2 = new JTextField();
		tela2.setText("5");
		tela2.setHorizontalAlignment(SwingConstants.CENTER);
		tela2.setFont(new Font("Tahoma", Font.BOLD, 17));
		tela2.setColumns(10);
		tela2.setBounds(156, 100, 103, 45);
		contentPane.add(tela2);
		
		tela3 = new JTextField();
		tela3.setText("5");
		tela3.setHorizontalAlignment(SwingConstants.CENTER);
		tela3.setFont(new Font("Tahoma", Font.BOLD, 17));
		tela3.setColumns(10);
		tela3.setBounds(280, 100, 103, 45);
		contentPane.add(tela3);
		
		ControllerCassino cc = new ControllerCassino(tela1, tela2, tela3);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBounds(138, 199, 147, 39);
		//setBounds posiciona botão (x,y, altura e largura)


		btnJogar.addActionListener(cc);
		contentPane.add(btnJogar);
		//contetPane é a tela
	}
}
