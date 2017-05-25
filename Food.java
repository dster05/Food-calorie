import java.util.*;
public class Food{
	SArrayList name = new SArrayList();
	SArrayList mType = new SArrayList();
	IArrayList quan = new IArrayList();
	IArrayList calor = new IArrayList();
	Scanner input = new Scanner(System.in);
	Scanner stringInput = new Scanner(System.in);
	SStackMethods stack = new SStackMethods();
	SStackMethods temp = new SStackMethods();
	SStackMethods Nstack = new SStackMethods();
    SStackMethods Tstack = new SStackMethods();
    SStackMethods Cstack = new SStackMethods();
	public String nameOfFood;
	public String mealType;
	public int quanity;
	public int calorie;
	
	
	//overloaded constructor
	public void Food(String n, String m, int q, int c){
		this.nameOfFood = n;
		this.mealType = m;
		this.quanity = q;
		this.calorie = c;
		
	}
	
	//enter the name of the food 
	public void enterFood(){
		System.out.println("Please enter the name of the food:  ");
		name.add(this.nameOfFood = stringInput.nextLine());
		
	}
	//enter the meal type
	public void enterMType(){
		System.out.println("Please enter the type of meal : Breakfast, Lunch, Dinner, Snack:   ");
		mType.add(this.mealType = stringInput.nextLine());

	}
	//enter the Quantity in oz. 
	public void enterQuantity(){
		System.out.println("Please enter the Quantity of servings:  ");
		quan.add(this.quanity = input.nextInt());
		input.nextLine();
		
	}
	//enter the number of calories
	public void enterCalorie(){
		System.out.println("Please enter the amount of calories per serving:  ");
		calor.add(this.calorie = input.nextInt());
		input.nextLine();		//must enter this line to read next string after a int or you can use a different scanner
		
	}
	//displays options
	public void pickOptions(){
		System.out.println("Choose 3 to enter name of the food: type of meal: quantity: #of calories: ");
		System.out.println("");
		System.out.println("Choose 4 to dietary history: ");
		System.out.println("");
		System.out.println("Choose 5 to see what the client has eaten: ");
		System.out.println("");
		System.out.println("Choose 6 to calculate the total calories eaten in a day: ");
		System.out.println("");
		System.out.println("Choose 7 to see the food with most calories in it: ");
		System.out.println("");
		System.out.println("Chosse 8 to see the food that was eaten most today: ");
		System.out.println("");
		System.out.println("Choose 9 to exit program: ");
		
	}
	
	public int pickOptions1(){//pick from options 1 to register or 2 to login
	int notnew;
	do{
		System.out.println("Are you a new client?  Choose 1 to register: ");
		System.out.println("");
		System.out.print("Are you a returning client?  Choose 2 to login: ");
		notnew = input.nextInt();
		input.nextLine();
		System.out.println("");
	}while(notnew < 0 || notnew > 2);
	return notnew;
	}
	//displays information about food

	public void checkFood(){			//moves foods from arrayList to stack in order to display and to use later
		for(int i = 0; i < name.myArray.length-1; i++){
			stack.push(name.myArray[i]);
		}
		if(!stack.isEmpty()){
			stack.display();
		}
		
	}
	
	public void traverse(){			//traverses multiple stacks to eliminate duplicates
	String temp;					//contains values to check against
	int tsize;						//holds original size of stack
	while(!stack.isEmpty()){			//copies the stack into two stacks
		Nstack.push(stack.takePeek());
		Cstack.push(Nstack.takePeek());
		stack.pop();						//now there are twos stacks with the same information Cstack for storage and Nstack to manipulate
	}
	while(!Cstack.isEmpty()){					//copies original values back to stack to clear up Cstack and stack still contains original values
		stack.push(Cstack.takePeek());
		Cstack.pop();
	}

	tsize = Nstack.size;
	while(tsize > 1){		//going to traverse the stacks back and fourth from Nstack to Tstack until we check every duplicate
		temp = Nstack.pop();		
			if(Tstack.isEmpty()){//checks to see if stack is empty
				while(Nstack.size> 0){
					if(!temp.equals(Nstack.takePeek())){//if temp not equal to Nstack.takepeek pop on Tstack
							Tstack.push(Nstack.pop());
						}	
						else{
							Nstack.pop();		//if duplicate found pop off stack
						}
					}
				}
	Cstack.push(temp);		//no more duplicate of the current temp push on Cstack
	tsize--;			//counter
		temp = Tstack.pop();		//new temp value
			if(Nstack.isEmpty()){			//checks if stack is empty
				while(Tstack.size > 0){
					if(!temp.equals(Tstack.takePeek())){		//if temp not equal to Tstack.takePeek then pop tstack on to nstack
						Nstack.push(Tstack.pop());			
					}
					else{
						Tstack.pop();		//if duplicate found pop off stack
					}
				}
			}
	tsize--;	
	Cstack.push(temp);			//no more duplicate of the current temp push on to Cstack		
	}
	Cstack.pop();				//pops of an error that i can get rid of any other way	
	Cstack.display();				//displays Cstack with no duplicats
	}
}
		

	

	
	
	
	
	
	








