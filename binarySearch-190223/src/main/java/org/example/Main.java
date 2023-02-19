package org.example;

public class Main {
    public static void main(String[] args) {
//        704
//        System.out.println(search(new int[] {-1,0,3,5,9,12},6));
//    278
//        firstBadVersion(5);

    }
// BINARY SEARCH
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid-1;
        }
        return start;
    }

    private static boolean isBadVersion(int mid) {
        return true;
    }

    public static int search(int[] nums, int target) {

        for (int i = nums[nums.length / 2] < target ? nums.length / 2 : 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}