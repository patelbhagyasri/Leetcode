
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=s.nextInt();
        System.out.println("Enter elements in Array:");
        for (int i = 0; i < n; i++) {
            num[i] = s.nextInt();
        }
        Solution so = new Solution();
        boolean ans = so.containsDuplicate(num);
        System.out.println("OUTPUT is: " + ans);

    }
}
