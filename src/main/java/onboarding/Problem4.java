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

}
