package gasPump.classes.strategyClasses;

//########## Part of Strategy Pattern ###############
//Concrete Class

public class DisplayMenuGP2 extends Abstract_DisplayMenu {

	public void DisplayMenu() {

		System.out.println("       Menu GP2");
		System.out.println("       Please select the type of Gas :");
		System.out.println("       1. Regular Gas (Press 6)");
		System.out.println("       2. Super Gas   (Press 5)");
		System.out.println("       3. Premium Gas (Press 4)");
	}
}
