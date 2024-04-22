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
		
		this.x =this.x+vx;
		this.y =this.y+vy;		
		
	}
	

}
