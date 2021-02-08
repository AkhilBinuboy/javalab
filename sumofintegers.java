import java.util.Scanner;
import java.util.StringTokenizer;

public class sumofintegers {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the "+ n + " number (space seperated)");
		String numList = sc.nextLine();
		StringTokenizer st = new StringTokenizer(numList," ");
		// Tokenization is process of spliting the given sentence.
		int sum = 0;
		while(st.hasMoreTokens()){ //[10,20,30,40,50]
		sum = sum + Integer.parseInt(st.nextToken());
		}
		System.out.println("Sum = "+sum);
		}
		}
	
