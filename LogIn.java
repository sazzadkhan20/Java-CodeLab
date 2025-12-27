import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
public class LogIn extends JFrame {  
    LogIn() {
		
    JFrame f=new JFrame("LogIn Screen");   
	 final JLabel label = new JLabel();            
     label.setBounds(20,150, 200,50);  
	 
     final JPasswordField value = new JPasswordField();   
     value.setBounds(100,75,100,30);
	 
     JLabel l1=new JLabel("Username:");    
     l1.setBounds(20,20, 80,30);  
	 
     JLabel l2=new JLabel("Password:");    
     l2.setBounds(20,75, 80,30);
	 
     JButton b = new JButton("Login");  
     b.setBounds(100,120, 80,30);   
	 
     final JTextField text = new JTextField();  
     text.setBounds(100,20, 100,30); 
	 
	ImageIcon ImageIcon = new ImageIcon("icon.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	JLabel Background;
	ImageIcon img = new ImageIcon("bg.png");
	Background = new JLabel ("",img,JLabel.CENTER);
	Background.setBounds(0,0,300,600);

	 
     f.add(value); 
	 f.add(l1); 
	 f.add(label); 
	 f.add(l2); 
	 f.add(b); 
	 f.add(text); 
	 f.add(Background);
	 
	f.setSize(300,600);    
	f.setLayout(null);
    f.setLocationRelativeTo(null);     
	f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
	b.addActionListener(new ActionListener() {  
	public void actionPerformed(ActionEvent e) {       
	   String data = "Username " + text.getText();  
	   data += ", Password: " + new String(value.getPassword());   
	   label.setText(data);          
	}  
 });   
}  
}  