
import java.util.*;
public class Question1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		int a[] = new int[4];
		a[0] = 0;
		a[1] = 0;
		a[2] = 550;
		a[3] = 275;
		if(n>0 && n<=4) {
			System.out.println(a[n-1]);
		}else {
			int res;
			if((n-1)%2 == 0) 
				res = ((n-1)/2)*a[2];	
			else 
				res = ((n-1)/2)*a[3]; 
			System.out.println(res);
		}
	}
}
