package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kombo extends JComponent {

	int f=0;
	int h=2;
	
	int x=200;
	
	public Kombo() {

		this.setPreferredSize(new Dimension(500,500));
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.red);
			g.fillOval(200, 200, 200, 200);
			g.setColor(Color.BLACK);
			g.fillArc(200, 200, 200, 200, f, f+2);
			g.drawString("sdsdfsfd", 10, 10);
			Graphics2D g2d = (Graphics2D) g;
			g.
		    CubicCurve2D cubcurve = new CubicCurve2D.Float(30, 400, 150, 400, 200, 500, 350, 450);
		    g2d.draw(cubcurve);
			
	}
	
	public void move() {
		
		h--;
		f--;
		
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
