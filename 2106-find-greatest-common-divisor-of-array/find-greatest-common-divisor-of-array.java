class Solution {
	public static int findGCD(int[] nums) {

		int n =  nums.length;
		Arrays.sort(nums);
		int ans = 1; 
		int min =  nums[0];
		int max = nums[n-1];



		for (int i = 1; i <= min; i++) {  
			if (min % i == 0 && max % i == 0) {
				ans = i;  
			}
		}


		return ans;
	}
}