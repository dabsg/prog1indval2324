package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Pacman extends JComponent {


	int pollyx[]= {150,100,100};
	int pollyy[]= {150,140,175};
	
	public Pacman() {
			this.setPreferredSize(new Dimension(400,400));
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);

		g.setColor(Color.YELLOW);
		g.fillOval(100, 100, 100, 100);
		g.setColor(this.getBackground());
		g.fillPolygon(pollyx, pollyy, 3);
		
	}
	
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.add(new Pacman());
		f.pack();
		
		
	}
}
