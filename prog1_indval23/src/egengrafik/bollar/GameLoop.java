package egengrafik.bollar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;


public class GameLoop extends JComponent {

	Boll b1;
	Boll b2;
	Timer t1;
	
public GameLoop() {
	
	b1= new Boll(20,20, Color.black, -2,2,50);
	
	b2= new Boll(300,40, Color.green, 4,4,20);
	this.setPreferredSize(new Dimension(400,400));
	
	t1= new Timer(50, e->{
		
		b1.move();
		b2.move();
		repaint();
	});
	
	t1.start();
	
	
}	

@Override
protected void paintComponent(Graphics g) {
	// TODO Auto-generated method stub
	super.paintComponent(g);
	g.setColor(b1.c);
	g.fillOval( b1.x  ,  b1.y , b1.r*2  , b1.r*2   );
	g.setColor(b2.c);
	g.fillOval( b2.x  ,  b2.y , b2.r*2  , b2.r*2   );
}


public static void main(String[] args) {
	
	JFrame f = new JFrame("bollar som studsar");
	f.setVisible(true);
	f.setLayout(new FlowLayout());
	f.add(new GameLoop());
	f.pack();
	
}



	
}
