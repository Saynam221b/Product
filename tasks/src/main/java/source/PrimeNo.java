package source;

public class PrimeNo {
	
	public static boolean check(int n)
    {
		int ans = n/2;
        if (n <= 1)
            return false;
 
        else if (n == 2)
            return true;
 
        else if (n % 2 == 0)
            return false;

        for (int i = 3; i <= ans; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
}
	public static void main(String args[]) {
		
		
		check(2);
	}
	
}
