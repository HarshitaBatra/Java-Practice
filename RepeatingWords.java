import java.util.*;
public class RepeatingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to be matched");
		String n1 = sc.nextLine();
		System.out.println("Enter string");
		String n2 = sc.nextLine();
		for(int i=0;i<n2.length();i++) {
			char c = n2.charAt(i);
			if(!(c>='A'&&c<='Z')&&!(c>='a'&&c<='z')&&!(c==' ')) {
				System.out.println("Invalid string");
				System.exit(0);
			}
		}
		String a[] = n2.split(" ");
		String b[] = n1.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].equals(b[0])) {
				count=count+1;
			}
		}
		System.out.println("Score is: "+count);
	}

}
