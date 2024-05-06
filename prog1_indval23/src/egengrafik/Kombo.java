package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kombo extends JComponent {

	
	int x=200;
	
	public Kombo() {

		this.setPreferredSize(new Dimension(500,500));
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.red);
			g.fillArc(x, 200, 100, 100, 0, 90);
			
	}
	
	public void move() {
		
		x+=20;
		repaint();
	}
	
	
	public static void main(String[] args) {
	
		JButton b= new JButton("->");
		Kombo k=new Kombo();
		JPanel p=new JPanel();
		
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		
		p.add(k);
		p.add(b);
		
		f.add(p);
		f.pack();
		
		b.addActionListener(e->{
			
			k.move();
			
		});
		
		
		
		
	}
	
	
	
	
}
