class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);

        for(int i=0;i<moveFrom.length;i++){
            set.remove(moveFrom[i]);
            set.add(moveTo[i]);
        }
        List<Integer> result = new ArrayList<>(set);
        //for(int num :set) result.add(num);
        Collections.sort(result);

        return result;
    }
}