// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


// haveThree([3, 1, 3, 1, 3]) → true
// haveThree([3, 1, 3, 3]) → false
// haveThree([3, 4, 3, 3, 4]) → false
	
// Solution


public boolean haveThree(int[] nums) {

  int count = 0;
  boolean isPerv3 = false;
  for(int i = 0 ; i < nums.length && count <= 3; i++)
  {
  	if(nums[i] == 3)
  	{
  		if(isPerv3)
  			return false;
  		else
  		{
  			count++;
  			isPerv3 = true;
			}
  	}
  	else
  		isPerv3 = false;
  }
  return (count == 3);
}
