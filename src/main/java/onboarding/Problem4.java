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


    public static List<Integer> char2ASCII(List<Character> wordCharList) {
        List<Integer> wordASCIIList = new ArrayList<Integer>();
        for(char c : wordCharList) {
            int charASCII = (byte)c;
            wordASCIIList.add(charASCII);
        }
        return wordASCIIList;
    }

    public static List<Integer> convertASCII(List<Integer> wordASCIIList) {
        List<Integer> convertedASCIIList = new ArrayList<Integer>();
        for(int ascii : wordASCIIList) {
            if(ascii >= 65 && ascii <= 90) {
                int convertedASCII = 155 - ascii;
                convertedASCIIList.add(convertedASCII);
            }
            else if(ascii >= 97 && ascii <= 122) {
                int convertedASCII = 219 - ascii;
                convertedASCIIList.add(convertedASCII);
            }
            else {
                convertedASCIIList.add(ascii);
            }
        }
        return convertedASCIIList;
    }

    public static String ascii2String(List<Integer> convertedASCIIList) {
        String convertedString = "";
        for(int ascii : convertedASCIIList) {
            convertedString += Character.toString(ascii);
        }
        return convertedString;
    }
}
