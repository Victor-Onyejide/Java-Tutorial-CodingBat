Solution

public int[] fizzArray(int n) {
  
  int [] num = new int[n];
  int sum =0;
  for(int i = 0; i < num.length; i++)
  {
    num[i]=sum;
    sum++;
  }
  return num;
}