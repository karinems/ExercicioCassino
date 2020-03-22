package controller;

//swing do java para fazer tela
import javax.swing.JTextField;

//extends Herança (ela herda todos os atributos)
//Thread processo que acontece em paralelo ao mesmo tempo

public class ThreadCassino extends Thread{

	JTextField texto;
	
	public ThreadCassino(JTextField texto) {
		// TODO Auto-generated constructor stub
		
		this.texto = texto;
	}
	
	//sobre escrita
	@Override
	public void run() {
		// TODO Auto-generated method stub
		gerarNumero();
		super.run();
	}
	
	public void gerarNumero() {
		
		//LimiteBouble serve para a velocidade em que as caixinhas giram
		double limiteDouble =  (Math.random() * 100) + 1;
		int limite = (int) limiteDouble;
	
		for(int i = 0; i< limite; i++) {
			double valorDouble = (Math.random() * 7) + 1;
			int valor  = (int) valorDouble;
			
			
			texto.setText(valor+"");
			
			//try significa tentar
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

