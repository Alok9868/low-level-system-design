package org.example;

import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static int longestValidParentheses(String s) {

        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else if (s.charAt(i) == ')') {
                if (!st.isEmpty()) {
                    if (s.charAt(st.peek()) == '(') {
                        int curr_len = i - st.pop() + 1;
                        ans = Math.max(ans, curr_len);
                    }
                }

            }
        }
        return ans;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {


        Stack<Integer> st = new Stack<>();

        int n = nums2.length;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            int nextGreaterEle;
            if (st.empty()) {
                nextGreaterEle = -1;
            } else {
                nextGreaterEle = st.peek();
            }
            hashMap.put(nums2[i], nextGreaterEle);
            st.push(nums2[i]);
        }

        int m = nums1.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = hashMap.get(nums1[i]);
        }

        return ans;


    }

    public static void main(String[] args) {

        longestValidParentheses("(()");
    }

}