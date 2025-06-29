import java.util.Scanner;

public class 타일링2_BOJ_1172  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int dp[] = new int[N+3];
		dp[1] = 1;
		dp[2] = 3;
		for(int i=3;i<=N;i++) {
			dp[i]=(dp[i-1]+2*dp[i-2])%10007;
		}
		System.out.println(dp[N]);
	}
}