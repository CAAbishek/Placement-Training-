class Solution {
    public int largestAltitude(int[] gain) {
        int [] peak=new int[gain.length+1];
        peak[0]=0;
        for (int i = 1; i <gain.length+1 ; i++) {

            peak[i]=peak[i-1]+gain[i-1];

        }
        int max=0;
        for (int i = 0; i < peak.length; i++) {

            if(peak[i]>=max)
            {
                max=peak[i];
            }
        }
        return max;

    }
}