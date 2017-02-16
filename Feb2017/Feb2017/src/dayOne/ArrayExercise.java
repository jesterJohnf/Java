package dayOne;

/**
 * Created by student on 13/02/2017.
 */
public class ArrayExercise {
    public static void main (String[] args) {
        int[] test = {1,2,3,4,5,6};
        int[] test2 = {1,2,3};

        /*System.out.println(commonEnd(test));*/
    }

    static boolean firstLast6(int[] nums) {
        return (nums [0] == 6) || (nums[nums.length - 1] == 6);
    }

    static boolean sameFirstLast(int[] nums) {
        return (nums[0] == nums[nums.length - 1]) && (nums.length >= 1);

    }

    static boolean commonEnd(int[] nums, int[] nums2) {
        return (nums[0] == nums2 [0]) || (nums[nums.length-1] == nums2[nums2.length-1]);
    }
}
