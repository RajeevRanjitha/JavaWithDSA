package inheritence;

public class Child1 extends Parent {
    String name;
    int rollno;
    public void parentPrint() {
    	super.getName();
    	super.rollno=96;
        super.print();
    }
    public Child1(String str) 
    {
    	super(str);
    }

    public void print() {
        System.out.println("Child name: " + this.name + " Parent name: " + super.getName() + " Child rollno: " + this.rollno + " Parent rollno: " + super.rollno);
    }
}
