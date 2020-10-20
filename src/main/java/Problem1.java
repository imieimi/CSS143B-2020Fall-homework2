public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    Similar to the sorting in homework 1, I made it so that
    there is a way to switch without having to go through
    the array twice. By making i = -1 at the end of the if
    statement, it resets the loop so that it can adjust the place.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if (nums[i] > nums[i+1]){
                int current = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = current;
                i = -1;
                }
            }
        }
    }
