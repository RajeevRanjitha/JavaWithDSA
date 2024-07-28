
package inheritence;

public class Parent {
    private String name;
    int rollno; // Package-private access

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String father;
    public Parent(String father)
    {
    	this.father=father;
    }

    public void print() {
        System.out.println("The name of the parent is " +name + " The rollno is " +rollno);
    }
}
