class Complex
{
	private int real,imag;
	public Complex()
	{
		
	}
	
	public Complex(int r,int i)
	{
		real=r;
		imag=i;
	}
	void showComplexNumber()
	{
		System.out.println(imag+"i + "+real+"\n");
	}
	public Complex SumTwoComplexNum(Complex C)
	{
		Complex temp=new Complex();
		temp.real=real+C.real;
		temp.imag=imag+C.imag;
		return temp;
	}
	public Complex DifferenceTwoComplexNum(Complex C)
	{
		Complex temp=new Complex();
		if(imag>C.imag)
		{
		temp.real=real-C.real;
		temp.imag=imag-C.imag;
		return temp;
		}
		else
		{
		temp.real=real-C.real;
		temp.imag=C.imag-imag;
		return temp;
		}
	}
}
public class ComplexNumberDemo
{
	public static void main(String [] args)
	{
	Complex C1=new Complex(12,9);
	Complex C2=new Complex(3,6);
	Complex C3=C1.SumTwoComplexNum(C2);
	Complex C4=C1.DifferenceTwoComplexNum(C2);
	C1.showComplexNumber();
	C2.showComplexNumber();
	C3.showComplexNumber();
	C4.showComplexNumber();
	Complex C5=C2.SumTwoComplexNum(C3);
	Complex C6=C1.SumTwoComplexNum(C5);
	C6.showComplexNumber();
	}
}
	