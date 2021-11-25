package ex10_lista2;

import java.awt.*;
import javax.swing.*;

public class CaixaDeTexto extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField nome = new JTextField(30);
	JTextField RA = new JTextField(30);
	
	public  CaixaDeTexto(String nome_aluno,String RA_aluno) {
		
		setLayout(new FlowLayout());
		
		add(nome);
		add(RA);
		
		nome.setText(nome_aluno);
		RA.setText(RA_aluno);
		
		
		setTitle("Informações do aluno");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}

}
