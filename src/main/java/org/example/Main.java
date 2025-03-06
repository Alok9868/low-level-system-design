package org.example;


import lombok.Data;

import java.util.Stack;

public class Main {

    //0, 13 ,15 ,8
//    idx=1
//    days - 1
    private static Pair helper(int[] arr, int idx, int days, Pair[] dp) {
        Pair result = new Pair();
        result.setDays(days);
        result.setEfforts(0);

        if (idx == arr.length) {
            return result;
        }

        if (dp[idx] != null) {
            return dp[idx];
        }

        if (arr[idx] == 0) {
            return dp[idx] = helper(arr, idx + 1, days, dp);
        }

        Pair arb_case = helper(arr, idx + 1, days + 1, dp);

        arb_case.setEfforts(arb_case.getEfforts() + arr[idx]);

        //0 13 15 8
        Pair adj_case = new Pair();
        adj_case.setDays(Integer.MAX_VALUE);
        adj_case.setEfforts(Integer.MAX_VALUE);

        if (idx + 1 < arr.length && arr[idx + 1] > 0) { // check if it is broken or not
            adj_case = helper(arr, idx + 2, days + 1, dp);
            adj_case.setEfforts(adj_case.getEfforts() + 2 * (arr[idx + 1] + arr[idx]));
        }

        if (arb_case.getDays() < adj_case.getDays()) {
            result.setEfforts(arb_case.getEfforts());
            result.setDays(arb_case.getDays());
        } else if (arb_case.getDays() > adj_case.getDays()) {
            result.setEfforts(adj_case.getEfforts());
            result.setDays(adj_case.getDays());
        } else { // equal case
            result.setEfforts(Math.min(adj_case.getEfforts(), arb_case.getEfforts()));
            result.setDays(adj_case.getDays());
        }

        return dp[idx] = result;
    }

    public static Integer findMinimumEfforts(int[] arr) {

        Pair[] dp = new Pair[arr.length];


        Pair pair = helper(arr, 0, 0, dp);

        System.out.println(pair.getDays());
        System.out.println(pair.getEfforts());
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(dp[i][j]);
//            }
//            System.out.println();
//        }
//
//        for (int j = 0; j < arr.length; j++) {
//            if (dp[0][j] != -1) {
//                return dp[0][j];
//            }
//        }
        return null;

    }


//    string simplifyPath(string path) {
//
//        stringstream ss(path);


//        string token="";
//        stack<string>st;
//        while(getline(ss,token,'/'))
//        {
//            if(token=="" || token==".")continue;
//            if(token!="..")
//            {
//                st.push(token);
//            }
//            else if(!st.empty())
//            {
//                st.pop();
//            }
//        }
//        if(st.empty())
//        {
//            return "/";
//        }
//        string result="";
//        while(!st.empty())
//        {
//            result ="/"+st.top()+result;
//            st.pop();
//        }
//
//        return result;
//
//    }
//


    public static void main(String[] args) {

//        int[] arr = {0, 13, 15, 8};
//        System.out.println(findMinimumEfforts(arr));


        String token = "";
//
//        A single period '.' represents the current directory.
//        A double period '..' represents the previous/parent directory.
//        Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
//        Any sequence of periods that does not match the rules above should be treated as a valid directory
//        or file name. For example, '...' and '....' are valid directory or file names.
//        The simplified canonical path should follow these rules:
//
//        The path must start with a single slash '/'.
//                Directories within the path must be separated by exactly one slash '/'.
//                The path must not end with a slash '/', unless it is the root directory.
//                The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.

        // "/home//foo/"

        String path = "/home//foo/";

        Stack<String> stack = new Stack<>();
        int n = path.length();
        for (int i = 0; i < path.length(); i++) {

            if (path.charAt(i) == '/') {
                continue;
            }

            String temp = "";
            while (i < n && path.charAt(i) != '/') {
                temp += path.charAt(i);
                i++;
            }

            if (temp.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            } else if (temp.equals(".")) {
                continue;
            }

            stack.push(temp);
        }


        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        if (stack.isEmpty()) {
            stringBuilder.append("/");
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stringBuilder.insert(0, "/" + stack.pop());
        }

        System.out.println(stringBuilder.toString());


    }

}

@Data
class Pair {
    Integer efforts;
    Integer days;
}
