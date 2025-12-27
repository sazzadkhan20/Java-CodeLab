import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInFrame extends JFrame implements ActionListener
{
	JButton jbutt;
	JPanel jpanel;
	Font font=new Font("cambria",Font.ITALIC,30);
	public LogInFrame()
	{
		super("My Page");
		this.setSize(300,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
		
		jpanel=new JPanel();
		jpanel.setBounds(0,0,300,600);
		jpanel.setLayout(null);
		
		
		jbutt=new JButton("LogIn");
		jbutt.setBounds(100,200,150,50);
		jbutt.setFont(font);
		jbutt.setBackground(new Color(126, 245, 66));
		jbutt.addActionListener(this);
		
		
		
		this.add(jpanel);
		jpanel.add(jbutt);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(jbutt==e.getSource())
		{
			this.setVisible(false);
			Page p=new Page();
			
		}
	}
}