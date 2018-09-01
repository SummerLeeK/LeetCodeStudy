package com.study.lee.leetcodestudylib.java;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba"也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 * Created by Administrator on 2018/9/1 0001.
 */

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "aaabaaaa";


        String maxS;

        int headerIndex;
        int footerIndex;
        int maxLength = 0;

        int maxIndex = 0;
//        if (s.length() == 1) {
//            return s;
//        }

        for (int m = 0; m < s.length() - 1; m++) {

            int i = m;
            int j = s.length() - 1;
            headerIndex = i;
            footerIndex = j;
            boolean equal = false;
            while (true) {
                String si = s.substring(i, i + 1);
                String sj = s.substring(j, j + 1);

                if (si.equals(sj)) {
                    equal = true;

                    i++;
                    j--;
                } else if (equal) {
//                    第一次匹配成功但后续匹配失败 头归零 尾巴减一位
                    i = m;
                    j--;
                    headerIndex = i;
                    footerIndex = j;


                } else if (!equal) {
//                    第一次匹配失败 尾巴进一位
                    j--;
                    footerIndex = j;

                }

                if (i >= j) {


                    if (maxLength - 1 < footerIndex - headerIndex) {
                        maxLength = footerIndex - headerIndex + 1;
                        maxIndex = headerIndex;
                    }
//                    System.out.println(headerIndex + "\t" + footerIndex + "\t" + maxIndex + "\t" + maxLength);


                    break;
                }
            }
        }
        System.out.println("maxIndex\t" + maxIndex + "\tmaxLength\t" + maxLength);
        maxS = s.substring(maxIndex, maxIndex + maxLength);
        System.out.println(maxS);
    }
}
