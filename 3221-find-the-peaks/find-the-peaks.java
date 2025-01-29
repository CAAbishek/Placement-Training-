class Solution {
    public List<Integer> findPeaks(int[] mountain) {
    int n=mountain.length;
    List<Integer>ind=new ArrayList<>();
    if(n==1){
        ind.add(0);
        return ind;
    }
    for(int i=1;i<n-1;i++){
        if(mountain[i]>mountain[i+1] && mountain[i]>mountain[i-1]){
            ind.add(i);
        }
    }
    return ind;
    }
}