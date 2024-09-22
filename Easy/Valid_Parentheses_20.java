/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true
*/
public class Valid_Parentheses_20{
    public static void main(String args[]){
    	Solution obj = new Solution();
    	boolean result = obj.isValid("[{}[]()({})]");
    	System.out.println(result);
    }
}
class Solution {
    public boolean isValid(String s) {
        String openStr = "";
		String closeStr = "";
		String open = "{([";
		String close = "})]";
		boolean check = false;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(open.contains(""+c)) {
				if(check) {
					openStr = HelperFunction(openStr,closeStr);
					closeStr = "";
					if(openStr == "false") return false;
					check = false;
				}
				int index = open.indexOf(""+c);
				openStr += index;
			}
			else {
				check = true;
				int index = close.indexOf(""+c);
				closeStr = index+closeStr;
			}
		}
        if(openStr.length()!=closeStr.length()) return false;
		s = HelperFunction(openStr,closeStr);
		if(s=="false") return false;
		return true;
    }
    public static String HelperFunction(String openStr,String closeStr) {
		if(closeStr.length()>openStr.length()) return "false";
		while(!closeStr.isEmpty()) {
			if(closeStr.charAt(closeStr.length()-1) == openStr.charAt(openStr.length()-1)){
				openStr = openStr.substring(0,openStr.length()-1);
				closeStr = closeStr.substring(0,closeStr.length()-1);
			}
			else {
				return "false";
			}
		}
		return openStr;
	}
}
