import java.util.*;
public class SArrayList{
	
	int size;
	int capacity;
	String[] myArray;
	String error;
	int[] position;
	int[][] scoreArray;
	
	public SArrayList(){  //default constructor
		myArray = new String[4];
		this.size = 0;
		this.capacity = 4;
		this.error = "Error";
		position = new int[4];
		scoreArray = new int[8][8];
		
	}
	
	// overloaded constructor
	public SArrayList(int beginSize){
		myArray = new String[beginSize];
		this.size = 0;
		this.capacity = beginSize;
		this.error = "Error";
		position = new int[beginSize];
		scoreArray = new int[beginSize][beginSize];
	}
	
	//reallocate method
	public void reallocate(){
		this.capacity *=2;
		String[] tmp = new String [this.capacity];
		// code to copy array data
		for(int i =0; i < myArray.length; i++){
			tmp[i] = myArray[i];
		}
		this.myArray = tmp;
	}

	//adds data to the end
	public void add(String a){
		if(size < capacity){
			myArray[size] = a;
			size++;
		}
		else{
			System.out.println("Reallocate called");
			this.reallocate();
			myArray[size++] = a;
			
		}
	}
	//method adds data to a specific location
	public void add(String a, int index){
		if(index == size){
			this.add(a);
		}
		else{
			if(size == capacity){
				this.reallocate();
			}
			for(int i = size ; i > index ; i--){
				this.myArray[i] = this.myArray[i-1];
			}
			this.myArray[index] = a;
			size++;
		}
	}
	//removes data at a specific index
	public String remove(int index){
		if(index < 0 || index > (size - 1)){
			System.out.println("Invalid index. Data not deleted");
			return this.error;
		}
		String tmp = this.myArray[index];
		for(int i = index; i < size -1; i++){
			this.myArray[i] = this.myArray[i +1];
		}
		size--;
		return tmp;
	}
	//gets the content of the index
	public String getIndex(int index){
		if(index >= 0 && index < size){
			return myArray[index];
		}
		else{
			return this.error;		//indicates invalid
		}
	}
	
	//shows the current size of the array.
	public int getSize(){
		return this.size;
	}
	
	//shows current capacity
	public int getCapacity(){
		return this.capacity;
	}
	
	// prints the arraylist
	public void display(){
		for(int i = 0; i < size; i++){
			System.out.println(myArray[i]);
		}
		System.out.println("");
	}
	
	//adds the data at the end of the arraylist
	public void add(int a){
		if(size < capacity){
			position[size] = a;
			size++;
		}
		else{
			System.out.println("Reallocate called");
			this.reallocate();
			position[size++] = a;
		}
	}
	

	
}