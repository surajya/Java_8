package MethodAndConstructure;

public class Stuff {
	public static void doStuff() {
		System.out.println("this is doStuff method 0 ");
		System.out.println("this is one chutiya method 1");
		System.out.println("this is doStuff method 2");
		System.out.println("this is one chutiya method 3");
		System.out.println("this is doStuff method 4");
		System.out.println("this is one chutiya method 5");
		System.out.println("this is doStuff method 6");
		System.out.println("this is one chutiya method 7");
		
	}
	
	public static void pring()  {
		try {
			for(int i=0; i<10; i++) {
				System.out.println(i);
				//Thread.sleep(2);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	
	public void Table() {
		for(int i=0; i<11; i++) {
			System.out.println(i*3);
		}
	}
}
