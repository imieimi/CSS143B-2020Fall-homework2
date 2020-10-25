public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    The loop should compare the index number to the one next to it until there are no more duplicates of the
    number,assume they are not a part of the array, then
    update the i to keep count of the non duplicates.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        //return Integer.MAX_VALUE; // place holder
        int i = 0;
        if (nums.length == 0) {
            return 0;
        }
        for(int a = 1; a < nums.length; a++){
            if(nums[a] != nums[i]){
                i++;
                nums[i] = nums[a];
            }
        }
        return i + 1;
    }
}
