import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("First string:");
		String n1 = sc.nextLine();
		System.out.println("Second string:");
		String n2 = sc.nextLine();
		char a[] = new char[n1.length()];
		char b[] = new char[n2.length()];
		for(int i=0;i<n1.length();i++) {
			a[i] = n1.charAt(i);
		}
		for(int i=0;i<n2.length();i++) {
			b[i] = n2.charAt(i);
		}
		int count = 0;
		for(int i=0;i<n1.length();i++) {
			for(int j=0;j<n2.length();j++) {
				if(a[i]==b[j]) {
					count++;
					break;
					
				}
			}
		}
		if(count == n1.length()) {
			System.out.println("Same");
		}
		else {
			System.out.println("not same");
		}
	
	}

}
