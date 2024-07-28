package inheritence;
public class ShapeUse {
	public static void main(String args[]) 
	{
		Shape obj=new Rectangle(4,3,4);
		System.out.println(obj.sides);
		System.out.println();
		Rectangle obj1=(Rectangle)obj;
		System.out.println(obj1.length);
	}
}
