package MethodAndConstructure;

public class RefeDemo {
	public static void main(String[] args) throws InterruptedException {
		//System.out.println("This is reference page");
//		Reuse use=()->{
//			System.out.println("There is nothing of reference data");
//			System.out.println("what is the main useful");
//		};
		
		Reuse use=Stuff::doStuff;
		
		Runnable runn=Stuff::pring;
		
		Thread d=new Thread(runn);
		d.start();
		//Thread.sleep(2);
		use.doReuse();
		
		Runnable run=new Stuff()::Table;
		Thread dd=new Thread(run);
		dd.start();
	}
}
