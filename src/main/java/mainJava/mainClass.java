package mainJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import newIterator.MyIterator;

public class mainClass {
	public static void main(String []args) throws InterruptedException {
		List<Integer> hi=new ArrayList<>();
	
		String []str= {"dd","kii","hari","mari","a","iyyanar"};
		
		MyIterator<String> my=new MyIterator<String>(str);
		my.filter(n->n.contains("a")).forEach(System.out::println);;
		System.out.println("allwin");
		
		my.forEach(n->System.out.println(n));
		testing[] trst= {};
		for(int a:hi) {
			
		}
		try {
			my.sort();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Thread.sleep(1000);
		while(my.hasNext()) {
		my.next();
//			System.out.println(my.next());
//			System.out.println(my.firstElement());
//			System.out.println(my.lastElement());
		}
	}
}
