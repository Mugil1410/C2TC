package day11;

public class Exceptiondemo {
	public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
			   var data=100/0; 
		   }catch(ArithmeticException e){System.out.println(e);}   
		   //rest code of the program   
		   System.out.println("code after exception...");  
		  }

}
