package abstract_;

public class CarUse {
	public static void main(String args[]) 
	{
		Vehicle v=new Car(6);
		System.out.println(v.n);
		v.print();
		Vehicle obj=new Vehicle(10) 
		{

			@Override
			public void noOftires() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int noOfgears() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
}
