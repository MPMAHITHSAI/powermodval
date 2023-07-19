package powerwithmod;
import java.util.Scanner;

public class powermod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(power(a,b,c));
    }

    static int power(int a, int b , int c) {
    	int result=1;
        for(int i=0;i<b;i++) {
        	a%=c;
            result=((result*a)%c);
        }
        	
			

        
		return result;
		
    }

}