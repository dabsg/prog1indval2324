package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Boll extends JComponent {

	int r = 20;
	int vikt = 20;
	Color c = Color.BLUE;
	int x = 100;
	int y = 100;
	int vx = 2;
	int vy = 1;
	double g=1;
	Timer t;

	public Boll() {

		this.setPreferredSize(new Dimension(400, 400));

		t = new Timer(45, e -> {

			update();

		});

		t.start();
	}
	public void update() {
		
		if(y>(400-(r*2))) {
			
			vy=vy*-1;
			
		}
		
		
		vy=vy+(int)g;
		y=y+vy;
		x++;
		this.repaint();
		
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.fillOval(x, y, r * 2, r * 2);
		g.drawLine(x, y, 12, 12);

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.add(new Boll());
		f.pack();

	}

}
