class Solution {
    public boolean isOneBitCharacter(final int[] bits) {
        int i = 0;

        while(i < bits.length - 1)
            i += bits[i] == 0 ? 1 : 2;

        return i == bits.length - 1 && bits[i] == 0;
    }
}