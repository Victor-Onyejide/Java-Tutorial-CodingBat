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
