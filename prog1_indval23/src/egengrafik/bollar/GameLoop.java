package egengrafik.bollar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;


public class GameLoop extends JComponent {

	Boll b[] =new Boll[1000000];
	Timer t1;
	
public GameLoop() {
	
	for (int i = 0; i < b.length; i++) {
	
		int vvx;
		
		if(i%3==0) {
			
			vvx= ((int)(Math.random()*10))*-1;
			
		}else {
			vvx= ((int)(Math.random()*10));
			
		}
		
		
		
		b[i]= new Boll((int)(Math.random()*400),
					   (int)(Math.random()*400),
				       new Color(   (int)(Math.random()*255) , (int)(Math.random()*255) , (int)(Math.random()*255) ),
				       vvx,
				       2,
				       50);
		
	}
	
	
	

	this.setPreferredSize(new Dimension(400,400));
	
	t1= new Timer(50, e->{
		
		for (int i = 0; i < b.length; i++) {
			b[i].move();	
		}
		
		
		
		
		repaint();
	});
	
	t1.start();
	
	
}	

@Override
protected void paintComponent(Graphics g) {
	// TODO Auto-generated method stub
	super.paintComponent(g);

	for (int i = 0; i < b.length; i++) {
		
	
	g.setColor(b[i].c);
	g.fillOval( b[i].x  ,  b[i].y , b[i].r*2  , b[i].r*2   );
	}
}


public static void main(String[] args) {
	
	JFrame f = new JFrame("bollar som studsar");
	f.setVisible(true);
	f.setLayout(new FlowLayout());
	f.add(new GameLoop());
	f.pack();
	
}



	
}
