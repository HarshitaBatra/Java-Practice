/*import java.util.*;
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int sum=0;
		int rem=0;
		for(int i=0;i<n;i++) {
			int temp=a[i];
			while(temp>0) {
				rem = temp%10;
				sum = sum+rem;
				temp = temp/10;
			}
			if((a[i]%sum)==0) {
				System.out.println(a[i]);
			}
		}
	}

}*/
import java.util.*;
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int sum=0;
			int rem=0;
			int temp=a[i];
			while(temp>0) {
				rem = temp%10;
				sum = sum+rem;
				temp = temp/10;
			}
			if((a[i]%sum)==0) {
				System.out.println(a[i]);
			}
		}
	}

}

