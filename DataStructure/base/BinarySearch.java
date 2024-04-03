package DataStructure.base;

public class BinarySearch {
    public static void main(String[] args) {

    }
/**
 * <h2>二分查找基础版</h2>
 * @description 1.有序数组 <br>
 *              2.无重复元素
 * @param nums:
 *              待查找数组
 * @param target:
 *              待查找目标值
 * @return int  若找到目标值则返回对应下标，若未找到则返回-1
 * @author earlymor
 * @date 2024/3/29 下午11:36
 */
    public int binarySearchBase(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid;
        while (l <= r) { // 若r=nums.length，意味着位于不可比位置，应改为l<r
            mid = l + (r - l) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
