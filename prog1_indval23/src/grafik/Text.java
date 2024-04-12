package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Text {

	JFrame f= new JFrame();
	JTextField text= new JTextField(20);
	JLabel textnamn=new JLabel("ange ditt namn");
	JLabel svar = new JLabel();
	JButton b1= new JButton("send form");
	JRadioButton r1 = new JRadioButton();
	JRadioButton r2 = new JRadioButton();
	JRadioButton r3 = new JRadioButton();
	ButtonGroup bg= new ButtonGroup();
	JCheckBox box1=new JCheckBox();
	JCheckBox box2=new JCheckBox();
	
	String country[]={"1","2","3","4","5"};        
    JComboBox cb=new JComboBox(country); 
	
    public Text() {
		
		f.setVisible(true);
		f.setSize(new Dimension(400,300));
		f.setLayout(new FlowLayout());
		f.add(textnamn);
		f.add(text);
		
		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(box1);
		f.add(box2);
		f.add(cb);
		f.add(b1);
		f.add(svar);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		    
		
	
		b1.addActionListener(e->{
			
			String textsvar="";
			
			String s1=text.getText();
			
			textsvar=textsvar+ s1;
			
			if(r1.isSelected()) {
				
				textsvar=textsvar+ "du har valt hund";
				
			}
			if(r2.isSelected()) {
				
				textsvar=textsvar+ "du har valt kanin";
				
			}
			if(r3.isSelected()) {
				
				textsvar=textsvar+ "du har valt katt";
				
			}
			
			svar.setText(textsvar);
		});
		
	}
	
	public static void main(String[] args) {
		
		new Text();
		
	}
}
