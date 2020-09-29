import java.util.*;
public class Question3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.print("String to be replaced: ");
		String r = sc.next();
		System.out.print("String to be replaced with: ");
		String rw = sc.next();
		
		String str[] = s.split(" ");
		for(int i=0; i<str.length; i++) {
			if(str[i].equals(r)) 
				str[i] = rw;
		}
		String nStr = "";
		for(String x:str) 
			nStr = nStr+x+" ";
		
		String n = findValue(rw);
		nStr = nStr+n;
		System.out.println(nStr);
		
	}
	private static String findValue(String s) {
		String r = "";
		for(int i=0; i<s.length(); i++) {
			int charVal = (int)s.charAt(i) - 96;
			r = r+charVal;
		}
		return r;
	}
}
