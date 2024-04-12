package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Räknare {

	int i =0;
	JFrame f= new JFrame();
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JLabel  tal = new JLabel(""+i);
	
	public Räknare() {
		
	f.setVisible(true);
	f.setLayout(new FlowLayout());
	f.setSize(new Dimension(300,300));
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.add(plus);
	f.add(minus);
	f.add(tal);
	
	plus.addActionListener(e->{
		
		i++;
		tal.setText(""+i);
		
	});
minus.addActionListener(e->{
		
		i--;
		tal.setText(""+i);
		
	});
	
	
	}
	
	

	
	public static void main(String[] args) {
		
		new Räknare();
		new Räknare();
	}
	
	
}
