public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    The loop should compare the index number to the one next to it until there are no more duplicates of the
    number, and move the duplicates to the end and assume they are not a part of the array, then
    update the newLength to keep count of the non duplicates.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        //return Integer.MAX_VALUE; // place holder
        int length = nums.length;
        int lengthMinusOne = nums.length - 1;
        int newLength = 1;
        for(int i = 0; i < lengthMinusOne; i++){
            for(int a = 0; a < length; a++){
                if(nums[i] == nums[a]){
                    newLength = nums.length - 1;
                }
            }
        }
        return newLength;
    }
}
