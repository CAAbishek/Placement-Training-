class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> resultArr = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++){
            int diff =  arr[i] - arr[i-1];
            if(diff < minDiff){
                resultArr.clear();
                minDiff = diff;
            }
            if(minDiff == diff){
                resultArr.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return resultArr;
    }
}