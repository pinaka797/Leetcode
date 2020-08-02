package AugLeetcode;

//Given a word, you need to judge whether the usage of capitals in it is right or not.
//
//        We define the usage of capitals in a word to be right when one of the following cases holds:
//
//        All letters in this word are capitals, like "USA".
//        All letters in this word are not capitals, like "leetcode".
//        Only the first letter in this word is capital, like "Google".
//        Otherwise, we define that this word doesn't use capitals in a right way.
//        Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.


public class Solution2Aug2020 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
    }

    static public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        int len=word.length();
        for(int i=1;i<len;i++){
            char ch=word.charAt(i);
            if('A'<=ch && ch<='Z'){
                return false;
            }
        }
        return true;
    }
}
