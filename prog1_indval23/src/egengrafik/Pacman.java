package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Pacman extends JComponent implements KeyListener {

	int x= 100;
	int y=100;

	int pollyx[]= {x+50,x,x};
	int pollyy[]= {y+50,y+40,y+75};
	Timer t ;
	
	public Pacman() {
			this.setPreferredSize(new Dimension(400,400));
	
	t=new Timer(1000,e->{
		
		
		if(pollyy[1]==175) {
		pollyy[1]=140;
		}else {
			pollyy[1]=175;
			
		}
		repaint();
		
		
	});
	t.start();
	
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);

		g.setColor(Color.YELLOW);
		g.fillOval(x,y, 100, 100);
		g.setColor(this.getBackground());
		g.fillPolygon(pollyx, pollyy, 3);
		
	}
	
	
	public static void main(String[] args) {
		
		
		Pacman p = new Pacman();
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.add(p);
		f.pack();
		f.addKeyListener(p);
		
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			
			x=x+10;
			
			pollyx[0]=x+50;      
			pollyx[1]=x;
			pollyx[2]=x;
			repaint();
			
			
			
		}
		
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
