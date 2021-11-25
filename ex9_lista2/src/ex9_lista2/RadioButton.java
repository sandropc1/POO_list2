package ex9_lista2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RadioButton extends JFrame implements ActionListener{

	JRadioButton um = new JRadioButton("1");
	JRadioButton dois = new JRadioButton("2");
	JRadioButton tres = new JRadioButton("3");
	
	ButtonGroup grupo = new ButtonGroup();
	
	public RadioButton() {
		setLayout(new FlowLayout());
		
		add(um);
		add(dois);
		add(tres);
		
		grupo.add(um);
		grupo.add(dois);
		grupo.add(tres);
		
		um.addActionListener(this);
		dois.addActionListener(this);
		tres.addActionListener(this);
		
		
		setTitle("Seletor de músicas");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==um) {
		System.out.println("Agora tocando a música 1");
		}
		else if(e.getSource()== dois) {
		System.out.println("Agora tocando a música 2");
		}
		else if(e.getSource()== tres) {
			System.out.println("Agora tocando a música 3");
		}
	}

}
