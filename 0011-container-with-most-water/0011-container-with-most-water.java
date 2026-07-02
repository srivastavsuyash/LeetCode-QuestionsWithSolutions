class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1, maxWater = 0;
        while(i<j){
            int w = j-i;
            int ht = Math.min(height[i], height[j]);
            int currWater = w * ht;
            maxWater = Math.max(maxWater, currWater);
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
}