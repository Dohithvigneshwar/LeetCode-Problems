/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

*/
import java.util.ArrayList;
public class Palindrome_Number_9{
    public static void main(String args[]){
    	Solution obj = new Solution();
    	boolean result = obj.isPalindrome(10);
    	System.out.println(result);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        if(s.length()==2 && s.charAt(0)=='-') return false;
        ArrayList<Integer> list = new ArrayList<>();
        int pos = 0;
        while(pos<s.length()){
            char c = s.charAt(pos);
            if(c == '-'){
                list.add((c-'0')*-1);
                pos+=1;
            }
            else{
                list.add(c-'0');
            }
            pos+=1;
        }
        int lp = 0 , rp = list.size()-1;
        while(lp<rp){
            if(list.get(lp++) != list.get(rp--)) return false;
        }
        return true;
    }
}
