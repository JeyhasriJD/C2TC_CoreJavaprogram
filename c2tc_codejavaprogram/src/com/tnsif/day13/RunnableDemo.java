package com.tnsif.day13;

public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable  obj = new UsingRunnable(10,20,"Dear Coder ");
		
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Runnable with Anonymous Class");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		runnable = ()->{
			System.out.println("Runnable with lambda Expression");
		};
		
		new Thread(runnable).start();
		
		System.out.println("------------------------------");
		int n=5;
		runnable = () -> {
			try {
				for (int i = 1; i <= n;i++) {
					System.out.println("Loop Iteration:"+i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) { 
				System.out.println("Task interrupted");
			}
		};
		
		new Thread(runnable).start();

	}

}
