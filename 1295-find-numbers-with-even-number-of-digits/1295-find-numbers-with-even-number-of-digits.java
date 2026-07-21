class Solution {
    public int findNumbers(int[] nums) {
       int count = 0;
       for(int a : nums){
            int c = 0;
            int n = a;
            while(n > 0){
                n /= 10;
                c = c + 1;
            }
            if(c%2 == 0){
                count++;
            }
       }
       return count; 
    }
}