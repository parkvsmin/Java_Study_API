package com.iu.thread;

public class ThreadTest2 implements Runnable {
	
	@Override
	public void run() {
		this.getAlpha();
		
	}
	
	private void getAlpha() {
		
		for (int i ='a';i<'z'+1;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
