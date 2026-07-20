import java.util.*;
public class MaxSubArraySum {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        MaxSubArraySum obj = new MaxSubArraySum();
        System.out.println(obj.maxSubArray(nums));
        sc.close();
    }
}
