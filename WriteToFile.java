import java.util.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteToFile{
public String fileName;
	//default constructor
public WriteToFile(){
	this.fileName = "password.txt";
	}
	//constructor overloaded constructor
public WriteToFile(String fileName){
	this.fileName = fileName;
	}
public String writeToFile(){	
try{
	PrintWriter outputStream = new PrintWriter(fileName);
	outputStream.println(passWord());
	outputStream.flush();//flushes the data to the fileName you can continue to write to it
	//outputStream.close();//fluses the data to the fileName but you cannot write to it anymore
} catch (FileNotFoundException e){
	//TODO Auto-generated catch block
	e.printStackTrace();
}
return fileName;
}



public String passWord(){
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter a password: ");
	String passWordTxt = input.nextLine();
	System.out.println("");
	return passWordTxt;
	
}
}