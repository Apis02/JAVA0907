package com.apus.sample;

public class threadTest extends Thread {
	
	@Override
	public void run(){
		try{
			
		long l = (long) (Math.random() * 100);
		System.out.println("I am a new thread" + this.getName() + "");
		Thread.sleep(2000);
		System.out.println(getName());
		
		
		
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadTest t1 =  new threadTest();
		t1.setPriority(MIN_PRIORITY);
		threadTest t2 =  new threadTest();
		t1.setPriority(NORM_PRIORITY);
		threadTest t3 =  new threadTest();
		t1.setPriority(MAX_PRIORITY);
		threadTest t4 =  new threadTest();
		threadTest t5 =  new threadTest();
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
