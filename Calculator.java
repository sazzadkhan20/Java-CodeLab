import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame implements ActionListener
{
	Font font=new Font("Agency FB",Font.BOLD+Font.ITALIC+Font.PLAIN,25);
	Font font1 = new Font("cambria", Font.PLAIN, 20);
	JPanel panel;
	JTextField screen;
	JLabel jlabel;
	JButton butt7,butt8,buttPlus,buttEqual,buttDiv,buttNeg,buttMul,butt0,butt1,butt2,butt3,butt4,butt5,butt6,butt9,butt00,buttPercentage,buttPower,buttClear,buttClearAll;
	double result,op1,op2;
	String operator;
	public Calculator()
	{
		//Creating the Main Window
		/*JFrame jframe=new JFrame("My Calculator");
		jframe.setSize(400,600);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setLocation(300,50);
		jframe.setLayout(null);
		jframe.setResizable(false);
		
		
		//Display the window after all initialization
		jframe.setVisible(true);*/
		
		//Creating the Main Window
		super("My Calculator");
		this.setSize(400,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(300,50);
		this.setLayout(null);
		this.setResizable(false);
		//this.setFont(font);
		
		//Creating a Panel Container
		panel=new JPanel();
		panel.setBounds(0,0,400,600);
		panel.setBackground(new Color(36,171,153));
		panel.setLayout(null);
		
		//Creating a Label
		jlabel=new JLabel("MS-50");
		jlabel.setBounds(20,10,200,40);
		jlabel.setFont(font);
		
		//Creating the Screen
		screen=new JTextField();
		screen.setBounds(80,70,200,40);
		screen.setFont(font1);
		
		//Creating The Buttons
		buttPower=new JButton("^");
		buttPower.setBounds(20,125,50,50);
		buttPower.setBackground(new Color(49,82,120));
		buttPower.setFont(font1);
		buttPower.addActionListener(this);
		
		buttDiv=new JButton("/");
		buttDiv.setBounds(90,125,50,50);
		buttDiv.setBackground(new Color(49,82,120));
		buttDiv.setFont(font1);
		buttDiv.addActionListener(this);
		
		buttClear=new JButton("Clear");
		buttClear.setBounds(160,125,80,60);
		buttClear.setBackground(new Color(126, 245, 66));
		buttClear.setFont(font1);
		buttClear.addActionListener(this);
		
		buttClearAll=new JButton("ClearAll");
		buttClearAll.setBounds(260,125,100,60);
		buttClearAll.setBackground(new Color(245, 72, 66));
		buttClearAll.setFont(font1);
		buttClearAll.addActionListener(this);
		
		butt9=new JButton("9");
		butt9.setBounds(50,200,50,50);
		butt9.setBackground(new Color(49,82,120));
		butt9.setFont(font1);
		butt9.addActionListener(this);
		
		buttPlus=new JButton("+");
		buttPlus.setBounds(120,200,50,50);
		buttPlus.setBackground(new Color(49,82,120));
		buttPlus.setFont(font1);
		buttPlus.addActionListener(this);
		
		buttNeg=new JButton("-");
		buttNeg.setBounds(190,200,50,50);
		buttNeg.setBackground(new Color(49,82,120));
		buttNeg.setFont(font1);
		buttNeg.addActionListener(this);
		
		buttMul=new JButton("*");
		buttMul.setBounds(260,200,50,50);
		buttMul.setBackground(new Color(49,82,120));
		buttMul.setFont(font1);
		buttMul.addActionListener(this);
		
		butt5=new JButton("5");
		butt5.setBounds(50,265,50,50);
		butt5.setBackground(new Color(49,82,120));
		butt5.setFont(font1);
		butt5.addActionListener(this);
		
		butt6=new JButton("6");
		butt6.setBounds(120,255,50,50);
		butt6.setBackground(new Color(49,82,120));
		butt6.setFont(font1);
		butt6.addActionListener(this);
		
		butt7=new JButton("7");
		butt7.setBounds(190,265,50,50);
		butt7.setBackground(new Color(49,82,120));
		butt7.setFont(font1);
		butt7.addActionListener(this);
		
		butt8=new JButton("8");
		butt8.setBounds(260,265,50,50);
		butt8.setBackground(new Color(49,82,120));
		butt8.setFont(font1);
		butt8.addActionListener(this);
		
		butt1=new JButton("1");
		butt1.setBounds(50,330,50,50);
		butt1.setBackground(new Color(49,82,120));
		butt1.setFont(font1);
		butt1.addActionListener(this);
		
		butt2=new JButton("2");
		butt2.setBounds(120,330,50,50);
		butt2.setBackground(new Color(49,82,120));
		butt2.setFont(font1);
		butt2.addActionListener(this);
		
		butt3=new JButton("3");
		butt3.setBounds(190,330,50,50);
		butt3.setBackground(new Color(49,82,120));
		butt3.setFont(font1);
		butt3.addActionListener(this);
		
		butt4=new JButton("4");
		butt4.setBounds(260,330,50,50);
		butt4.setBackground(new Color(49,82,120));
		butt4.setFont(font1);
		butt4.addActionListener(this);
		
		butt0=new JButton("0");
		butt0.setBounds(50,395,50,50);
		butt0.setBackground(new Color(49,82,120));
		butt0.setFont(font1);
		butt0.addActionListener(this);
		
		butt00=new JButton("00");
		butt00.setBounds(120,395,60,60);
		butt00.setBackground(new Color(49,82,120));
		butt00.setFont(font1);
		butt00.addActionListener(this);
		
		buttPercentage=new JButton("%");
		buttPercentage.setBounds(200,395,60,60);
		buttPercentage.setBackground(new Color(49,82,120));
		buttPercentage.setFont(font1);
		buttPercentage.addActionListener(this);
	
		
		buttEqual=new JButton("=");
		buttEqual.setBounds(280,395,50,50);
		buttEqual.setBackground(new Color(49,82,120));
		buttEqual.setFont(font1);
		buttEqual.addActionListener(this);
		
		//Add Components to Window
		this.add(panel);
		
		//Add Components to Panel
		panel.add(jlabel);
		panel.add(screen);
		panel.add(butt7);
		panel.add(butt8);
		panel.add(buttPlus);
		panel.add(buttEqual);
		panel.add(buttNeg);
		panel.add(buttMul);
		panel.add(buttDiv);
		panel.add(butt1);
		panel.add(butt2);
		panel.add(butt3);
		panel.add(butt4);
		panel.add(butt5);
		panel.add(butt6);
		panel.add(butt9);
		panel.add(butt0);
		panel.add(butt00);
		panel.add(buttPower);
		panel.add(buttPercentage);
		panel.add(buttClear);
		panel.add(buttClearAll);
		
		//Display the window after all initialization
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) 
	{

		String text=e.getActionCommand();
		if(butt0==e.getSource() || butt00==e.getSource() || butt1==e.getSource() || butt2==e.getSource() || butt3==e.getSource() || butt4==e.getSource() || butt5==e.getSource() || butt6==e.getSource() || butt7==e.getSource() || butt8==e.getSource() || butt9==e.getSource())
		{
			screen.setText(screen.getText()+text);
		}
		else if(buttPlus==e.getSource())
		{
			op1=Double.parseDouble(screen.getText());
			operator=text;
			screen.setText("");
		}
		else if(buttNeg==e.getSource())
		{
			op1=Double.parseDouble(screen.getText());
			operator=text;
			screen.setText("");
		}
		else if(buttMul==e.getSource())
		{
			op1=Double.parseDouble(screen.getText());
			operator=text;
			screen.setText("");
		}
		else if(buttDiv==e.getSource())
		{
			op1=Double.parseDouble(screen.getText());
			operator=text;
			screen.setText("");
		}
		else if(buttPercentage==e.getSource())
		{
			op1=Double.parseDouble(screen.getText());
			operator=text;
			screen.setText("");
		}
		else if(buttPower==e.getSource())
		{
			op1=Double.parseDouble(screen.getText());
			operator=text;
			screen.setText("");
		}
		
		else if(buttEqual==e.getSource())
		{ 
			op2=Double.parseDouble(screen.getText());
			if(operator.equals("+"))
			{
				result=op1+op2;
			}
			else if(operator.equals("-"))
			{
			  result=op1-op2;
			}
			else if(operator.equals("*"))
			{
				result=op1*op2;
			}
			else if(operator.equals("/"))
			{
				result=op1/op2;
			}
			else if(operator.equals("^"))
			{
				result=Math.pow(op1,op2);
			}
			else if(operator.equals("%"))
			{
				result=op1%op2;
			}
			screen.setText(""+result);
		}
		else if(buttClearAll==e.getSource())
		{
			op1=0;
			op2=0;
			screen.setText("");
		}
		else if(buttClear==e.getSource())
		{
			screen.setText("");
		}
	}
	
}	
	
	
	
	
	
	
	
	/* public void actionPerformed(ActionEvent e) 
	{

		String text=e.getActionCommand();
		if(butt7==e.getSource() || butt8==e.getSource())
		{
			screen.setText(screen.getText()+text);
		}
		else if(buttPlus==e.getSource())
		{
			result=Double.parseDouble(screen.getText());
			operator=text;
			screen.setText("");
		}
		else if(buttNeg==e.getSource())
		{
			result=Double.parseDouble(screen.getText());
			operator=text;
			screen.setText("");
		}
		else if(buttMul==e.getSource())
		{
			result=Double.parseDouble(screen.getText());
			operator=text;
			screen.setText("");
		}
		else if(buttDiv==e.getSource())
		{
			result=Double.parseDouble(screen.getText());
			operator=text;
			screen.setText("");
		}
		else if(buttEqual==e.getSource())
		{ 
			
			if(operator.equals("+"))
			{
				result=result+Double.parseDouble(screen.getText());
			}
			else if(operator.equals("-"))
			{
			  result=result-Double.parseDouble(screen.getText());
			}
			else if(operator.equals("*"))
			{
				result=result*Double.parseDouble(screen.getText());
			}
			else if(operator.equals("/"))
			{
				result=result/(Double.parseDouble(screen.getText()));
			}
			screen.setText(""+result);
		}*/
		