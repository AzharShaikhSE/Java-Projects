package gasPump.classes.driver;

import gasPump.classes.abstractFactories.AbstractFactory;
import gasPump.classes.abstractFactories.ClientFactory1;
import gasPump.classes.abstractFactories.ClientFactory2;
import gasPump.classes.mda_efsm_classes.GasPump1;
import gasPump.classes.mda_efsm_classes.GasPump2;
import gasPump.classes.mda_efsm_classes.MDA_EFSM;
import gasPump.classes.mda_efsm_classes.OutputProcessor;

import java.util.Scanner;

public class GasPumpDriver {

	
		public static void main(String[] args) {
			  
			  Scanner input = new Scanner(System.in);
			  int pumpSelected;
			  float a1,b1;
			  int a2,b2,c2;
			  int cash;
			  
			  System.out.println("########## Please Select the GasPump ##########");
			  System.out.println();
			  System.out.println("      1. GasPump-1");
			  System.out.println("      2. GasPump-2 ");
			  System.out.println();
			  System.out.println("###############################################");
			  pumpSelected = input.nextInt();
			  
			  if(pumpSelected == 1){
				  AbstractFactory af = new ClientFactory1(); // Client factory for GasPump1
				  OutputProcessor op = new OutputProcessor(af); // creating output processor object
				  MDA_EFSM m = new MDA_EFSM(af,op); // m : MDA-EFSM object
				  GasPump1 gp1 = new GasPump1(af,m); // creating Gaspump1 object and passing required objects.
				  
				   char ch;
				   System.out.println();
			       System.out.println( "                          GasPump-1" );
			       System.out.println( "                  MENU of Operations" );
			       System.out.println( "          0. Activate(float, float)" );
			       System.out.println( "          1. Start()" );
			       System.out.println( "          2. PayCredit()" );
			       System.out.println( "          3. Reject()" );
			       System.out.println( "          4. Cancel()" );
			       System.out.println( "          5. Approved()" );
			       System.out.println( "          6. Super()" );
			       System.out.println( "          7. Regular()" );
			       System.out.println( "          8. StartPump()" );
			       System.out.println( "          9. PumpGallon()" );
			       System.out.println( "          a. StopPump()" );
			       System.out.println( "          q. Quit the program" );
			       System.out.println();
			       System.out.println( "           GasPump-1 Execution" );
			       ch='1';
			       System.out.println();
				   
				    while (ch !='q') {
			      System.out.println(" #################### Please Select Operation: ########################### ");
			      System.out.println();
			      System.out.println("0-Activate, 1-Start, 2-PayCredit, 3-Reject, 4-Cancel, 5-Approved, 6-Super, ");
			      System.out.println("7-Regular, 8-StartPump, 9-PumpGallon, a-StopPump, q-quit");
			      System.out.println();
			      System.out.println(" ######################################################################### ");
			      ch=input.next().charAt(0);
			      switch (ch) {
					case '0': //Activate()
							 System.out.println("  Operation:  Activate(float a, float b)");
							 System.out.println("  Enter price of Regular gas per gallon: $");
							 a1=input.nextFloat();
							 System.out.println("  Enter price of Super gas per gallon: $");
							 b1=input.nextFloat();
							 System.out.println();
							 gp1.Activate(a1,b1);
							 break;
						  
					case '1': //Start
							System.out.println("  Operation:  Start()");
							System.out.println();
							gp1.Start();
							break;
							
					case '2': //PayCredit 
							System.out.println("  Operation:  PayCredit()");
							System.out.println();
							gp1.PayCredit();
							break;
							
					case '3': //Reject 
							System.out.println("  Operation:  Reject()");
							System.out.println();
							gp1.Reject();
							break;
							
					case '4': //Cancel
							System.out.println("  Operation:  Cancel()");
							System.out.println();
							gp1.Cancel();
							break;
							
					case '5': //Approved
							System.out.println("  Operation:  Approved()");
							System.out.println();
							gp1.Approved();
							break;
								
					case '6': //Super
							System.out.println("  Operation:  Super()");
							System.out.println();
							gp1.Super();
							break;
							
					case '7': //Regular
							System.out.println("  Operation:  Regular()");
							System.out.println();
							gp1.Regular();
							break;
							
					case '8':  //StartPump
							System.out.println("  Operation:  StartPump()");
							System.out.println();
							gp1.StartPump();
							break;
								
					case '9': //PumpGallon
							System.out.println("  Operation:  PumpGallon()");
							System.out.println();
							gp1.PumpGallon();
							break;
							
					case 'a':  //StopPump
							System.out.println("  Operation:  StopPump()");	
							System.out.println();
							gp1.StopPump();
							break;
							
					  }// endswitch
				   } //endwhile
			 } //end if
			  
			  else if(pumpSelected == 2) {
				  AbstractFactory af = new ClientFactory2(); // Client factory for GasPump2
				  OutputProcessor op = new OutputProcessor(af);
				  MDA_EFSM m = new MDA_EFSM(af,op); 
				  GasPump2 gp2 = new GasPump2(af,m);
				  char ch;
				       System.out.println( "                          GasPump-2" );
				       System.out.println( "                  MENU of Operations" );
				       System.out.println( "          0. Activate(int,int,int)" );
				       System.out.println( "          1. Start()" );
				       System.out.println( "          2. PayCash()" );
				       System.out.println( "          3. Cancel()" );
				       System.out.println( "          4. Premium()" );
				       System.out.println( "          5. Super()" );
				       System.out.println( "          6. Regular()" );
				       System.out.println( "          7. StartPump()" );
				       System.out.println( "          8. PumpLiter()" );
				       System.out.println( "          a. Stop()" );
				       System.out.println( "          r. Receipt()" );
				       System.out.println( "          n. NoReceipt()" );
				       System.out.println( "          q. Quit the program" );
				       System.out.println();
				       System.out.println( "           GasPump-2 Execution" );
				       ch='1';
					   
					   while (ch !='q') {
					  System.out.println(" #################### Please Select Operation: ########################### ");
					  System.out.println();
				      System.out.println("0-Activate, 1-Start, 2-PayCash, 3-Cancel, 4-Premium, 5-Super,");
				      System.out.println("6-Regular, 7-StartPump, 8-PumpLiter,  a-StopPump, r-Receipt, n-NoReceipt,  q-quit");
				      System.out.println();
				      System.out.println(" ######################################################################### ");
				      ch=input.next().charAt(0);
				      switch (ch) {
						case '0':  //Activate()
								 System.out.println("  Operation:  Activate(int a, int b, int c)");
								 System.out.println("  Enter price of Regular gas per Liter: $");
								 a2=input.nextInt();
								 System.out.println("  Enter price of Premium gas per Liter: $");
								 b2=input.nextInt();
								 System.out.println("  Enter price of Super gas per Liter: $");
								 c2=input.nextInt();
								 System.out.println();
								 gp2.Activate(a2,b2,c2);
								 break;
							  
						case '1':  //Start
								System.out.println("  Operation:  Start()");
								System.out.println();
								gp2.Start();
								break;
								
						case '2': //PayCash
								System.out.println("  Operation:  PayCash()");
								System.out.println("  Enter the amount of Cash: $");
								System.out.println();
								cash=input.nextInt();
								gp2.PayCash(cash);
								break;
								
						
						case '3':  //Cancel
								System.out.println("  Operation:  Cancel()");
								System.out.println();
								gp2.Cancel();
								break;
								
						case '4':  //Premium
								System.out.println("  Operation:  Premium()");
								System.out.println();
								gp2.Premium();
								break;
		
						case '5':  //Super
								System.out.println("  Operation:  Super()");
								System.out.println();
								gp2.Super();
								break;
								
						case '6':  //Regular
								System.out.println("  Operation:  Regular()");
								System.out.println();
								gp2.Regular();
								break;
								
						case '7':  //StartPump
								System.out.println("  Operation:  StartPump()");
								System.out.println();
								gp2.StartPump();
								break;
									
						case '8':  //PumpLiter
								System.out.println("  Operation:  PumpLiter()");
								System.out.println();
								gp2.PumpLiter();
								break;
								
						case 'a': //StopPump
								System.out.println("  Operation:  StopPump()");	
								System.out.println();
								gp2.StopPump();
								break;
								
						case 'r':  //Receipt
								System.out.println("  Operation:  Receipt()");
								System.out.println();
								gp2.Receipt();
								break;
							
						case 'n':  //NoReceipt
								System.out.println("  Operation:  NoReceipt()");
								System.out.println();
								gp2.NoReceipt();
								break;
								
						  };// endswitch
					   }; //endwhile
				 }
				  else
				   System.out.println("Please select valid GasPump.");
				  
	}
}