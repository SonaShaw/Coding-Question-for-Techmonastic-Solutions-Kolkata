
import java.util.*;
public class Question2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		int a[] = new int[127];
		for(int i=0; i<s.length(); i++) {
			int index = (int)s.charAt(i);
			a[index]++;
		}
		char ch = sc.next().charAt(0);
		System.out.println("Frequency of "+ ch + " = " + a[(int)ch]);
		
		String str[] = s.split(" ");
		for(int i=0; i<str.length; i++) {
			if(str[i].charAt(0) > 90) {
				int upper = (int)str[i].charAt(0) - 32;
				str[i] = (char)upper + str[i].substring(1);
			}
		}
		
		char sp[] = {'~','`','!','@','#','$','%','^','&','*','(',')','-','_','+','=','[',']','{','}','|','/',':',';','"','<','>',',','.','?'};
		Random rand = new Random();
		int spc = rand.nextInt(sp.length);
		String nStr = "";
		for(int i=0; i<str.length; i++) {
			if(i == str.length-1) 
				nStr = nStr+str[i].substring(0,str[i].length()-1)+" "+sp[spc]+str[i].substring(str[i].length()-1);
			else
				nStr = nStr+str[i]+" ";
		}
		
		System.out.println(nStr);
		
		
		
	}
}
