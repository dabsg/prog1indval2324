package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Helloworld extends JFrame implements ActionListener {

	JLabel lab =new JLabel("hej");                   // skapar referensvariabeln lab, skapar objekt av klassen jlabel 
	JButton switchText = new JButton("byt text");    // skapr referensvariabel switchtext, skapr objekt av jbutton skickar inparmeter till konstruktor av typen string.
	
	public Helloworld() {							//skapar konstruktor.
		
		this.setLayout(new FlowLayout());     		//sätter layoutmanager
		this.setVisible(true);						//gör synlig
		this.setSize(new Dimension(400,500));		//  sätter storlek på fönster
		this.add(lab);								// lägger till jlabel
		this.add(switchText);
		switchText.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		
		new Helloworld();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	if(	lab.getText().equals( "hej")) {
		
		lab.setText("hej då");
	}else{
		lab.setText("hej");
		
	}
		
	}
	
}
