package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        return answer;
    }

    public static List<Character> string2Char(String word) {
        List<Character> wordCharList = new ArrayList<Character>();
        for(char c : word.toCharArray()){
            wordCharList.add(c);
        }
        return wordCharList;
    }


    public static List<Integer> Char2ASCII(List<Character> wordCharList) {
        List<Integer> wordASCIIList = new ArrayList<Integer>();
        for(char c : wordCharList) {
            int charASCII = (byte)c;
            wordASCIIList.add(charASCII);
        }
        return wordASCIIList;
    }

}
