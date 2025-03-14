
public class ProvaIsAssignable {
	
	
	
	private static class Base{ }
	private static class Derived extends Base { }
	
	public static void main(String[] args) {
		// dovrebbe stampare true (sottoclasse)
		System.out.println(Base.class.isAssignableFrom(Derived.class));
		// dovrebbe stampare true (identita)
		System.out.println(Base.class.isAssignableFrom(Base.class));
		// dovrebbe stampare false
		System.out.println(Base.class.isAssignableFrom(String.class));
		
	}
	
}
