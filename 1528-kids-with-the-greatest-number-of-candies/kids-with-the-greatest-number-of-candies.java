class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int max=0;
        for(int i: candies){
            max=Math.max(max,i);
        }
        for(int i=0; i<candies.length;i++){
            int tot=0;
            tot=candies[i]+extraCandies;
            if(tot>=max) list.add(true);
            else list.add(false);
        
        }
        return list;
    }
}