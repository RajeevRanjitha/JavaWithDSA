package switchcase;

public class SwitchUpdated {
	public static void main(String args[]) 
	{
		String str="Monday";
		String str1;
		
		str1=switch(str) 
		{
		case "Monday"->"Today is Monday";
		case "Tuesday"->"Hiii";
		default ->"Wastefellow";
		};
		
		str1=switch("Mond")
		{
		case "Mond": yield "Monday";
		case "TuesDay":yield "Tuesday";
		default : yield "Wednesday";
		};
	}
}
