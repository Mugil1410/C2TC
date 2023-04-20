package day5;

public class chilB extends Parent {
	void name() {
		System.out.println("Child B name");
	}
	public static void main(String[] args) {
		chilB b = new chilB();
		b.name();
		b.address();
		b.phno();
}

}
