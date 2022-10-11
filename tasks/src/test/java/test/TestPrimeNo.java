package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import source.PrimeNo;

public class TestPrimeNo {
	@Test
    public void posValues() {
		
		//check 1
		boolean ans = PrimeNo.check(11);
        assertEquals(true, ans);
        System.out.println("11 is a prime no");
      
              
        //check 2
        boolean ans3 = PrimeNo.check(3);
        assertEquals(true, ans3);
        System.out.println("3 is a prime no");
        
        System.out.println();
}

	@Test
    public void negValues() {
		
       
        //check 1
      	boolean ans2 = PrimeNo.check(10);
        assertEquals(false, ans2);
    	System.out.println("10 is not a prime no");
    	
    	//check 2
      	boolean ans4 = PrimeNo.check(12);
        assertEquals(false, ans4);
    	System.out.println("12 is not a prime no");
    	
    	System.out.println();
              
}
}
