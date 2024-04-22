package egengrafik.bollar;

import java.awt.Color;

public class Boll {

	public int x;
	public int y;
	public Color c;
	public int vx;
	public int vy;
	public int r;

	public Boll(int x, int y, Color c, int vx, int vy, int r) {

		this.x = x;
		this.y = y;
		this.c = c;
		this.vx = vx;
		this.vy = vy;
		this.r = r;

	}
	
	public void move() {
		
		if(y>(400 -r*2) ||  y< 0 ) {
			
			vy=vy*-1;
		}
		
		if(x>(400 -r*2) ||  x< 0 ) {
			
			vx=vx*-1;
		}
		
		
		this.x =this.x+vx;
		this.y =this.y+vy;		
		
	}
	

}
