import java.util.*;
public class Test{
/*************************************************
	Daniel J. Gallegos
**************************************************/

public static void main(String[] args){
Scanner input = new Scanner(System.in);
Scanner stringInput = new Scanner(System.in);
Food foodObject = new Food();
//SStackMethodsDemo stack = new SStackMethodsDemo();
SArrayList passWordTxt = new SArrayList();
WriteToFile WFile;
int option = 0;
int option1;
String userID;
System.out.println("");
option1 = foodObject.pickOptions1();	//this checks to see if new user or not
do{



switch(option1){
					case 1: System.out.println("Please enter a userId");
							System.out.print("userID: ");
							WFile = new WriteToFile(userID= stringInput.nextLine());
							passWordTxt.add(WFile.writeToFile());
					case 2:
							foodObject.pickOptions();
							option = input.nextInt();
							input.nextLine();
						
						switch(option){
	
										case 1: 
												break;
										case 2: 
												break;
										case 3:
											foodObject.enterMType();			//almost done
											foodObject.enterFood();
											foodObject.enterQuantity();
											foodObject.enterCalorie();
											break;
										case 4: foodObject.checkFood();		//why does only out put 3 things out of 4 that i input
											break;
										case 5: foodObject.traverse();		//only prints out one item when i enter at least 4 why?
												break;
										case 6: foodObject.pickOptions();		//still need to finish
												break;
										case 7: foodObject.pickOptions();		//still need to finish
												break;
										case 8: foodObject.pickOptions();		//still need to finish
												break;
										case 9:									//exit works great!!
												break;
										default:
												break;
	
	
	
}
}
}while(option != 9);




}
}