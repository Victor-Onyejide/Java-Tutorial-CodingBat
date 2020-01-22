
Solution

public boolean isEverywhere(int[] nums, int val) {
 for(int i = 0; i < nums.length-1; i++)
	{
		if(nums[i] != val && nums[i+1] != val) // They paid attention to the negation.
			return false;
	}  
	return true;
}