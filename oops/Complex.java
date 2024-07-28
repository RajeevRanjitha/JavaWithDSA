package oops;
import java.util.Scanner;
public class Complex {
	static Scanner sc=new Scanner(System.in);
	private int real;
	private int imaginary;
	public Complex(int a,int b) 
	{
		this.real=a;
		this.imaginary=b;
	}
	public Complex() 
	{
		
	}
	public void setReal(int real) 
	{
		this.real=real;
	}
	public void setImaginary(int imaginary) 
	{
		this.imaginary=imaginary;
	}
	public int getReal() 
	{
		return this.real;
	}
	public int getImaginary() 
	{
		return this.imaginary;
	}
	public void print() 
	{
		System.out.println(real+"+"+imaginary+"i");
	}
	public void add(Complex obj) 
	{
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;
	}
	public void multipy(Complex obj) 
	{
		int flag=this.real;
		this.real=(this.real*obj.real)-(obj.imaginary*this.imaginary);
		this.imaginary=(obj.imaginary*flag+this.imaginary*flag);
	}
	public static Complex add(Complex obj1 , Complex obj2) 
	{
		Complex obj3=new Complex();
		obj3.real=obj1.real+obj2.real;
		obj3.imaginary=obj1.imaginary+obj2.imaginary;
		return obj3;
	}
}
