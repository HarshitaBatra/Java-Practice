import java.util.Scanner;
public class Repitition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		System.out.println("Enter the key ");
		int key = sc.nextInt();	
		int i=num;
		int rem;
		int count=0;
		while(i>0) {
			rem = i%10;
			i=i/10;
			if(rem==key) {
				count=count+1;
			}
		}
		System.out.println(key+" appears "+count+" times in "+num);
	}
}
