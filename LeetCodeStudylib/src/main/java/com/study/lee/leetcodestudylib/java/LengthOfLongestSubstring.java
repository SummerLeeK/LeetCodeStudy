package com.study.lee.leetcodestudylib.java;


import java.util.regex.Pattern;

/**
 * Created by Administrator on 2018/8/30 0030.
 * <p>
 * <p>
 * <p>
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 无重复字符的最长子串是 "abc"，其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 无重复字符的最长子串是 "b"，其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 无重复字符的最长子串是 "wke"，其长度为 3。
 * 请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
 */

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String[] fbsArr = {"\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|"};
        String s = "abc";

        int maxLength = 0;
//        int curlength;
//
//        String regex;
//        for (int i = 0; i < s.length(); i++) {
//            String si = s.substring(i, i + 1);
//            curlength = 1;
//            regex = si;
//            for (int j = i + 1; j < s.length(); j++) {
//                String sj = s.substring(j, j + 1);
//                if (Pattern.matches(regex, sj) || j == s.length() - 1) {
//                    if (!Pattern.matches(regex, sj)) {
//                        curlength++;
//                    }
//                    maxLength = Math.max(curlength, maxLength);
//                    System.out.println("start\t" + si + "\tend\t" + sj + "\tmax\t" + curlength);
//                    break;
//                } else {
//                    if (sj.equals("|")) {
//                        regex = regex + "\\|" + sj;
//                    } else if (sj.equals("\\")) {
//                        regex = regex + "|" + sj;
//                    } else {
//                        regex = regex + "|" + sj;
//                    }
//
//                    curlength++;
//                }
//
//            }
//        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String si = s.substring(i, j);
                String sj = s.substring(j, j + 1);

                if (si.contains(sj) || j == s.length() - 1) {

                    if (!si.contains(sj) && j == s.length() - 1) {
                        maxLength = Math.max(maxLength, si.length() + 1);
                    } else {
                        maxLength = Math.max(maxLength, si.length());
                    }
                    break;
                }
            }
        }
        System.out.println(maxLength);


        if (Pattern.matches("b\\||c|a|b", "b")) {
            System.out.println("match");
        }
    }

}
