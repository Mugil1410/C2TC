package day3;

public class Customer {
	int roll_no;
	   String stu_name;
	   Customer(int i, String n) { // Parameterized constructor
	      roll_no = i;
	      stu_name = n;
	   }
	   void display() {
	      System.out.println(roll_no+" "+stu_name);
	   }
	   public static void main(String args[]) {
		   Customer s1 = new Customer(1,"Adithya");
	      Customer s2 = new Customer(2,"Jai");
	      s1.display();
	      s2.display();
	   }

}
