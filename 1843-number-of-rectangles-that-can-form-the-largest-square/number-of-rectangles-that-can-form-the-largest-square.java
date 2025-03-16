class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = Math.min(rectangles[0][0],rectangles[0][1]);
        int count = 0;
        for(int i = 0; i<rectangles.length; i++){
            if(max < Math.min(rectangles[i][0],rectangles[i][1])){
                max = Math.min(rectangles[i][0],rectangles[i][1]);
                count = 1;
            }else if(max == Math.min(rectangles[i][0],rectangles[i][1])) count ++;
        }
        return count;
    }
}