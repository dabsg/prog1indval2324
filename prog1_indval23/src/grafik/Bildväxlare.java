package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildväxlare {

	// instansvariabler
	JFrame f = new JFrame("hej");
	JLabel bild = new JLabel(new ImageIcon("bild.jpg"));
	JButton knapp = new JButton("byt bild");
	
	int vilkenBildvisas=0;

	// konstruktor
	public Bildväxlare() {
		// TODO Auto-generated constructor stub
		f.setVisible(true);
		f.setSize(new Dimension(400, 400));
		f.setLayout(new FlowLayout());
		f.add(bild);
		f.add(knapp);

		knapp.addActionListener(e -> {
			
			if (vilkenBildvisas ==0) {
			bild.setIcon(new ImageIcon("bild3.jpg"));
			vilkenBildvisas=1;
			}else if (vilkenBildvisas ==1) {
				
				bild.setIcon(new ImageIcon("bild.jpg"));
				vilkenBildvisas=0;
			}
		});

	}

	public static void main(String[] args) {
		new Bildväxlare();
	}

}
