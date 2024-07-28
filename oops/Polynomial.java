package oops;
import java.util.Scanner;
public class Polynomial {
	static Scanner sc=new Scanner(System.in);
	private int a[];
	Polynomial()
	{
		a=new int[5];
	}
	
	public void setCoefficient(int degree, int coeff) {
	    if (degree >= this.a.length) {
	        int b[] = new int[2*a.length + 1];
	        for (int i = 0; i < this.a.length; i++) {
	            b[i] = this.a[i];
	        }
	        this.a = b;
	        this.a[degree] += coeff;
	    }
	    else 
	    {
	    	 this.a[degree] += coeff;
	    }
	}
	public Polynomial subtract(Polynomial p) 
	{
		int i=0;
		Polynomial obj=new Polynomial();
		for(i=0;i<this.a.length && i<p.a.length;i++) 
		{
			obj.setCoefficient(i, this.a[i]-p.a[i]);
		}
		while(i<p.a.length) 
		{
			obj.setCoefficient(i,-p.a[i]);
			i++;
		}
		while(i<a.length) 
		{
			obj.setCoefficient(i,a[i]);
			i++;
		}
		return obj;
	}
	public int getCoeff(int degree) 
	{
		if(degree>=this.a.length) 
		{
			return -1;
		}
		else 
		{
			return this.a[degree];
		}
	}
	public Polynomial add(Polynomial p) 
	{
		int i=0;
		Polynomial obj=new Polynomial();
		for(i=0;i<this.a.length && i<p.a.length;i++) 
		{
			obj.setCoefficient(i, this.a[i]+p.a[i]);
		}
		while(i<p.a.length) 
		{
			obj.setCoefficient(i,p.a[i]);
			i++;
		}
		while(i<a.length) 
		{
			obj.setCoefficient(i,a[i]);
			i++;
		}
		return obj;
	}
	public Polynomial multiply(Polynomial p1) 
	{
		Polynomial obj=new Polynomial();
		for(int i=0;i<this.a.length;i++ ) 
		{
			for(int j=0;j<p1.a.length;j++) 
			{
				obj.setCoefficient(i+j,this.a[i]*p1.a[j]);
			}
		}
		return obj;
	}
	
	public void print() {
        StringBuilder output = new StringBuilder();
        boolean firstTerm = true;
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i] != 0) {
                if (!firstTerm) {
                    output.append(" + ");
                }
                output.append(this.a[i]).append("x^").append(i);
                firstTerm = false;
            }
        }
        System.out.println(output.toString());
    }
}
