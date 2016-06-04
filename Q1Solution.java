import java.util.Arrays;


public class Q1Solution {
	public int integerBreak(int n) {
		int[] result=new int[n];
		Arrays.fill(result, 1);
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				result[i]=Math.max(Math.max(j, result[j])*(i-j), result[i]);
			}
		}
		return result[n-1];
	}

}
