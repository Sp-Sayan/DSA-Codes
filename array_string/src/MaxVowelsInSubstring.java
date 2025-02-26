/*
https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75
 */


//279ms time
public class MaxVowelsInSubstring {

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
    }



    public static int maxVowels(String s, int k) {
        String word = "";
        int count = 0,max=0,isVowel=0;
        word = s.substring(0,k);
        //count initial no.of vowels
        for(int i = 0; i<word.length();i++){
            if(checkVowel(word.charAt(i)))
                count++;
        }
        max = count;

        for(int i =k;i<s.length();i++){

            //check if current char is vowel
            if(checkVowel(s.charAt(i)))
                isVowel = 1;

            //check if first word of word is vowel
            if(checkVowel(word.charAt(0)))
                isVowel--;

            word = word.substring(1) + s.charAt(i); //remove first letter and add last;
            count += isVowel;

            if(count> max)
                max = count;



            isVowel = 0;  //set to default value
        }
        return max;
    }

    public static boolean checkVowel(char a){
        if(a == 'a' || a == 'e' ||a == 'i' ||a == 'o' ||a == 'u')
            return true;
        else
            return false;
    }
}
