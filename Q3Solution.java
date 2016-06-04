
public class Q3Solution {
	public int maxProduct(int[] nums) {
		int result=0;
		int curResult=1;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>0){
				curResult*=nums[i];
			}
			else if(curResult>result){
				result=curResult;
				
			}
			
			
		}
		return result;
        
    }
}
