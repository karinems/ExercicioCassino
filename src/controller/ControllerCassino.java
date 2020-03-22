package controller;


import java.awt.event.ActionEvent;

//ele ouvi uma ação
import java.awt.event.ActionListener;

import javax.swing.JTextField;


//implements  
public class ControllerCassino implements ActionListener{

	JTextField txt1, txt2, txt3;
	
	//construtor
	public ControllerCassino(JTextField txt1, JTextField txt2, JTextField txt3) {
		// TODO Auto-generated constructor stub
		this.txt1 = txt1;
		this.txt2 = txt2;
		this.txt3 = txt3;
	}
	@Override
	//actionPErformedformed ele ouve a ação e manda executar algo
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ThreadCassino tc = new ThreadCassino(txt1);
		ThreadCassino tc2 = new ThreadCassino(txt2);
		ThreadCassino tc3 = new ThreadCassino(txt3);
		
		//para eu chamar o metodo public void run() escrevo .start()
		tc.start();
		tc2.start();
		tc3.start();
	}

}

