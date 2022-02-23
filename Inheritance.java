class Animal{
	public void cat()
	{
		System.out.println("meo meo");
	}
}

class Animal2 extends Animal{
	public void dog() {
		System.out.println("Bao BAo");
	}
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal al = new Animal();
		al.cat();
		
		Animal2 al2 = new Animal2();
		al2.dog();

	}

}
