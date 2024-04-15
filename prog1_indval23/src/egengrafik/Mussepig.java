package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Mussepig extends JComponent {

	public Mussepig() {
		
		this.setPreferredSize(new Dimension(400,400));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		g.fillOval(20, 20, 10, 10);
		g.setColor(Color.pink);
		g.fillOval(30,30, 10, 10);
		
	}
	
	public static void main(String[] args) {
		
		JFrame f= new JFrame();
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setContentPane(new Mussepig());
		f.pack();
		
		
	}
	
	
}
