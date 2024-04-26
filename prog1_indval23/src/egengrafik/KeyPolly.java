package egengrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class KeyPolly extends JComponent {

	
	// variabler
	
	int [] x= new int[4];
	int[]  y= {50,100,200,80};
	
	
	
	
	public KeyPolly() {
		x[0]=50;
		x[1]=100;
		x[2]=100;
		x[3]=40;
		
		this.setPreferredSize(new Dimension(400,400));
		
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawPolygon(x, y, x.length);
	}
	
	
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.add(new KeyPolly());
		f.pack();
		
		
	}
	
	
}
