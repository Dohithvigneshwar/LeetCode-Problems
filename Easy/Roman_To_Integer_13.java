/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/
public class Roman_To_Integer_13{
    public static void main(String args[]){
    	Solution obj = new Solution();
    	int result = obj.romanToInt("MCMXCIV");
    	System.out.println(result);
    }
}
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int pos = 0;
        while(pos<s.length()){
            char c = s.charAt(pos);
            char c1 = '0';
            int size = s.length()-1;
            if(pos!=s.length()-1){
                c1 = s.charAt(pos+1);
            }
            if(c=='I'){
                if(size != pos){
                    if(c1=='V'){
                        result+=4;
                        pos+=2;
                    }
                    else if(c1=='X'){
                        result+=9;
                        pos+=2;
                    }
                    else{
                        result+=1;
                        pos+=1;
                    }
                }
                else{
                    result+=1;
                    pos+=1;
                }
            }
            else if(c=='X'){
                if(size!=pos){
                    if(c1 == 'L'){
                        result+=40;
                        pos+=2;
                    }
                    else if(c1 == 'C'){
                        result+=90;
                        pos+=2;
                    }
                    else{
                        result+=10;
                        pos+=1;
                    }
                }
                else{
                    result+=10;
                    pos+=1;
                }
            }
            else if(c == 'C'){
                if(size != pos){
                    if(c1=='D'){
                        result+=400;
                        pos+=2;
                    }
                    else if(c1=='M'){
                        result+=900;
                        pos+=2;
                    }
                    else{
                        result+=100;
                        pos+=1;
                    }
                }
                else{
                    result+=100;
                    pos+=1;
                }
            }
            else if(c == 'V'){
                result+=5;
                pos+=1;
            }
            else if(c=='L'){
                result+=50;
                pos+=1;
            }
            else if(c=='D'){
                result+=500;
                pos+=1;
            }
            else{
                result+=1000;
                pos+=1;
            }
        } 
        return result;
    }
}
