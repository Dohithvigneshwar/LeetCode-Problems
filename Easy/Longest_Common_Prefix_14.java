
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

/*

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

*/
import java.util.Arrays;
public class Longest_Common_Prefix_14{
    public static void main(String args[]){
    	Solution obj = new Solution();
    	String result = obj.longestCommonPrefix(new String[{"flower","flow","flight"});
    	System.out.println(result);
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i))
            res+=strs[0].charAt(i);
            else 
            break;
        }
        return res; 
    }
}
