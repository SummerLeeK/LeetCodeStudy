package com.study.lee.leetcodestudylib.java;

/**
 * Created by Administrator on 2018/9/1 0001.
 * <p>
 * <p>
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * <p>
 * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 * <p>
 * 你可以假设 nums1 和 nums2 不同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 中位数是 (2 + 3)/2 = 2.5
 */

public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int nums1[] = {3};
        int nums2[] = {-2, -1};

        float medianS1 = 0f;
        float medianS2 = 0f;
        int multiple = 0;
        if (nums1 != null && nums1.length > 0) {
            if (nums1.length == 1) {
                medianS1 = nums1[0];
            } else {
                int index = nums1.length / 2;
                if (nums1.length % 2 != 0) {
                    medianS1 = nums1[index];
                } else {
                    medianS1 = (nums1[index] + nums1[index - 1] * 1.0f) / 2;
                }
            }
            multiple++;
        }


        if (nums2 != null && nums2.length > 0) {
            if (nums2.length == 1) {
                medianS2 = nums2[0];

            } else {
                int index = nums2.length / 2;
                if (nums2.length % 2 != 0) {
                    medianS2 = nums2[index];
                } else {
                    medianS2 = (nums2[index] + nums2[index - 1] * 1.0f) / 2;
                }
            }
            multiple++;
        }
//        System.out.print(medianS1 + "\t" + medianS2);
//
//        float median = (medianS1 + medianS2) / multiple;

        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums = new int[n1 + n2];
        while (n1 != 0 && n2 != 0) { // 公共长度先对比，小的放在新的数组里
            nums[k] = (nums1[i] < nums2[j]) ? nums1[i] : nums2[j];
            if (nums1[i] < nums2[j]) {
                i++;
                k++;
                n1--;
            } else {
                j++;
                k++;
                n2--;
            }
        }
        if (n1 == 0) { // 如果nums1比较小，把nums2剩下的放入nums中
            while ((n2--) != 0) {
                nums[k] = nums2[j];
                j++;
                k++;
            }
        } else if (n2 == 0) { // 如果nums2比较小，把nums1剩下的放入nums中
            while ((n1--) != 0) {
                nums[k] = nums1[i];
                i++;
                k++;
            }
        }
        double median;
        if ((nums1.length + nums2.length) % 2 == 0) { // 如果数字个数为偶数
            median = (nums[(nums1.length + nums2.length) / 2] + nums[(nums1.length + nums2.length) / 2 - 1]) / 2.0;
        } else { // 如果数字个数为奇数
            median = nums[(nums1.length + nums2.length) / 2];
        }


        System.out.print(median);
    }
}
