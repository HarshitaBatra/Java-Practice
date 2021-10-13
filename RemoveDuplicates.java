import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char a[] = new char[n.length()];
		for(int i=0;i<n.length();i++) {
			a[i] = n.charAt(i);
		}
		
		for(int i=0;i<n.length();i++) {
			for(int j=i+1;j<n.length();j++) {
				int count=1;
				if(a[i]==a[j]) {
					count++;
					a[j]='0';
				}
		//		if(count>1 && a[i]!='0') {
		//			System.out.println(a[i]);
		//		}
			}
		}
		for(int i=0;i<n.length();i++) {
			System.out.print(a[i]);
		}
	}

}
