import java.util.*;
public class Week_1_POW {

    //Question 1 => Min in Sort rotated Array.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a Size of an Array :");
    //     int size = sc.nextInt();

    //     int[] nums = new int[size];

    //     System.out.println("Enter a Value in the Array :");
    //     for(int i=0; i<nums.length; i++){
    //         nums[i] = sc.nextInt();
    //     }
    //     System.out.println("Output : "+ findMin(nums));
        
    // }
    // public static int findMin(int[] nums) {
    //     int left = 0;
    //     int right = nums.length - 1;
    //     while(left < right){
    //         int mid = left + (right - left) / 2;
    //         if(nums[mid] <= nums[right]){
    //             right = mid;
    //         }
    //         else{
    //             left = mid + 1;
    //         }
    //     }
    //     return nums[left];
    // }

    //Question 2 => Subarray Sum Equals K.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a Size of an Array :");
    //     int size = sc.nextInt();

    //     int[] nums = new int[size];

    //     System.out.println("Enter a Value in the Array :");
    //     for(int i=0; i<nums.length; i++){
    //         nums[i] = sc.nextInt();
    //     }

    //     System.out.println("Enter a Value of k :");
    //     int k = sc.nextInt();

    //     System.out.println("Output :"+ subarraySum(nums, k));
    // }
    // public static int subarraySum(int[] nums, int k) {
    //     HashMap<Integer, Integer> subNum = new HashMap<>();
    //     subNum.put(0, 1);
    //     int total = 0, count = 0;

    //     for (int n : nums) {
    //         total += n;

    //         if (subNum.containsKey(total - k)) {
    //             count += subNum.get(total - k);
    //         }

    //         subNum.put(total, subNum.getOrDefault(total, 0) + 1);
    //     }

    //     return count;        
    // }

    //Question 3 => Ruby Second House.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter number of houses :");
    //     int n = sc.nextInt();
    //     System.out.print("Enter number of colors :");
    //     int k = sc.nextInt();

    //     int[][] costs = new int[n][k];
    //     System.out.println("Enter the values :");
    //     for (int i = 0; i < n; i++){
    //         for (int j = 0; j < k; j++){
    //             costs[i][j] = sc.nextInt();
    //         }
    //     }
    //     System.out.println("Output :"+ minPaintCost(costs, n, k));
    // }
    // public static int minPaintCost(int[][] costs, int n, int k) {
    //     if (costs == null || k == 0){
    //         return 0;
    //     }

    //     int prevMin = 0, prevSecondMin = 0, prevMinIndex = -1;

    //     for (int i = 0; i < n; i++) {
    //         int currMin = Integer.MAX_VALUE;
    //         int currSecondMin = Integer.MAX_VALUE;
    //         int currMinIndex = -1;

    //         for (int j = 0; j < k; j++) {
    //             int cost = costs[i][j];

    //             if (j == prevMinIndex) {
    //                 cost += prevSecondMin;
    //             } else {
    //                 cost += prevMin;
    //             }

    //             costs[i][j] = cost;

    //             if (cost < currMin) {
    //                 currSecondMin = currMin;
    //                 currMin = cost;
    //                 currMinIndex = j;
    //             } else if (cost < currSecondMin) {
    //                 currSecondMin = cost;
    //             }
    //         }
    //         prevMin = currMin;
    //         prevSecondMin = currSecondMin;
    //         prevMinIndex = currMinIndex;
    //     }
    //     return prevMin;
    // }
}
