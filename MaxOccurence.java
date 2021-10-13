import java.util.*;
public class MaxOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char a[] = new char[n.length()];
		int arr[] = new int[n.length()];
		for(int i=0;i<n.length();i++) {
			a[i] = n.charAt(i);
		}
		
		
			int count1=0;
			int k=0;
			for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {  // jaaavvvvvv
				if(a[i]==a[j]) {
					count = count+1;
					if(count>count1) {
						count1=count;
						k=i;
					}
				}
//				arr[i] = count; // jaaaavve
			}
		}
			System.out.print(a[k]);
/*		int max=-1;
		int word_ind=0;
		for(int k = 0;k<a.length;k++) {
			if(max<arr[k]){  // 0 0 0 1 0 0
				max = arr[k];
				word_ind = k;
			}
		}  */
	//	System.out.println(a[word_ind]);
	}

}
