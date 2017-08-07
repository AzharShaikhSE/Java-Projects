package gasPump.classes.strategyClasses;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class DisplayMenuGP1 extends Abstract_DisplayMenu{

	public void DisplayMenu() {

		System.out.println("            Menu GP1");
		System.out.println("            Please select the type of Gas :");
		System.out.println("            1. Regular Gas (Press 7)");
		System.out.println("            2. Super Gas   (Press 6)");
		
	}
}
