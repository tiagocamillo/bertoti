public class Main {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		
		System.out.println(singleton);
		System.out.println(Singleton.getInstance());
	}

}