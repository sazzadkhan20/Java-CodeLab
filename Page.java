import javax.swing.*;
import java.awt.*;

public class Page extends JFrame
{
	JButton jbutt,jbutt1,jbutt2;
	JPanel jpanel;
	Font font=new Font("cambria",Font.ITALIC,30);
	public Page()
	{
		super("My Page");
		this.setSize(300,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
		
		jpanel=new JPanel();
		jpanel.setBounds(0,0,300,600);
		jpanel.setBackground(Color.YELLOW);
		jpanel.setLayout(null);
		
		
		jbutt=new JButton("PAGE");
		jbutt.setBounds(100,50,150,100);
		jbutt.setFont(font);
		jbutt.setBackground(new Color(30,125,56));
		//jbutt.addActionListener(this);
		
		jbutt1=new JButton("SignIn");
		jbutt1.setBounds(100,200,150,100);
		jbutt1.setFont(font);
		jbutt1.setBackground(new Color(36,150,15));
		
		jbutt2=new JButton("SignOut");
		jbutt2.setBounds(100,400,150,100);
		jbutt2.setFont(font);
		jbutt2.setBackground(new Color(36,150,15));
		
		this.add(jpanel);
		jpanel.add(jbutt);
		jpanel.add(jbutt1);
		jpanel.add(jbutt2);
	}
}