import java.util.Scanner;

public class DP_Problem1_2  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int dp[] = new int[N+1];
		dp[1] = 2;
		dp[2] = 5;
		for(int i=3;i<=N;i++) {
			dp[i]=(dp[i-1]*2+dp[N-2]);
		}
		System.out.println();
	}
	void f1(){
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int dp[] = new int[N+1];
		dp[1]=2;
		dp[2]=3;
		for(int i=3;i<=N;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		System.out.println(dp[N]);
	}
}
