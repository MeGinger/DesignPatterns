package net.antra.design.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class SingletonTest {
	public static void main(String[] args) {
		
		Runnable r = ()->System.out.println(SingletonD.getInstance());
//		Runnable r1 = new Runnable(){
//			public void run() { 
//				System.out.println(SingletonA.getInstance());		
//			}
//		};
		ExecutorService es = Executors.newFixedThreadPool(40);
		for(int i = 0 ; i < 50; i++){
			es.submit(r);
		}
		es.shutdown();
	}
}
