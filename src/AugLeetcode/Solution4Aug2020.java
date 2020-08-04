package AugLeetcode;


//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//        Note: For the purpose of this problem, we define empty string as valid palindrome.
//
//        Example 1:
//
//        Input: "A man, a plan, a canal: Panama"
//        Output: true
//        Example 2:
//
//        Input: "race a car"
//        Output: false
//
//
//        Constraints:
//
//        s consists only of printable ASCII characters.
//

public class Solution4Aug2020 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("a."));
        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
    }
        public static boolean isPalindrome(String s) {
            String fixedString="";

            for(char ch: s.toCharArray()){
                if(Character.isDigit(ch) || Character.isLetter(ch))
                    fixedString += ch;
            }
            //System.out.println(fixedString);
            fixedString=fixedString.toLowerCase();
            int first_pointer=0;
            int second_pointer=fixedString.length()-1;

            while(first_pointer<=second_pointer){
                if(fixedString.charAt(first_pointer)!=fixedString.charAt(second_pointer)){
                    return false;
                }

                first_pointer++;
                second_pointer--;
            }

            return true;


        }

}
