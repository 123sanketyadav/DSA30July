class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        for(int i =0; i<=nums.length-k ; i++){
            int start = i;
            for(int j =i ;j<=i ; j++){
                int sum =0 ;
                for(int k1 = j ; k1<j+k; k1++ ){
                    sum = sum +nums[k1];
                }
                double avg = (double) sum /k;
                if(avg > max ){
                    max = avg;
                }
            }
        }
        return max;
    }
    
}