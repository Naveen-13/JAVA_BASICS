package naveen.javabaics;

import org.testng.annotations.Test;

public class AppTest 
{
	@Test
	public void swap() {
		int a = 10;
		int b = 20;
		
		int temp = a;
		a = b; 
		b = temp;
		
		System.out.println(a + " " + b);
	}
	
	
}
