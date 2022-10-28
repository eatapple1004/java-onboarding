package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";

        try {
            checkInputData(cryptogram);
        }
        catch(ArithmeticException e) {
            return e.getMessage();
        }

        List<Character> cryptogramCharList = new ArrayList<Character>();
        for(char c : cryptogram.toCharArray()){
            cryptogramCharList.add(c);
        }

        boolean overlapYN = checkOverlap(cryptogramCharList);
        while(overlapYN) {
            cryptogramCharList = removeOverlapChar(cryptogramCharList);
            overlapYN = checkOverlap(cryptogramCharList);
        }

        answer = generateAnswer(cryptogramCharList);
        return answer;
    }

    public static boolean checkOverlap(List<Character> cryptogramChar) {
        for(int i=0; i< cryptogramChar.size()-1; i++) {
            char currentChar = cryptogramChar.get(i);
            char nextChar = cryptogramChar.get(i+1);

            if(currentChar == nextChar) {
                return true;
            }
            else {
                continue;
            }
        }
        return false;
    }

    public static List<Character> removeOverlapChar(List<Character> cryptogramChar) {
        for(int i=0; i<cryptogramChar.size()-1; i++) {
            char currentChar = cryptogramChar.get(i);
            char nextChar = cryptogramChar.get(i+1);

            if(currentChar == nextChar) {
                cryptogramChar.remove(i);
                cryptogramChar.remove(i);
                i--;
            }
        }
        return cryptogramChar;
    }

    public static String generateAnswer(List<Character> cryptogramCharList) {
        String answer = "";
        for(char c : cryptogramCharList) {
            answer += c;
        }
        return answer;
    }

    public static void checkInputData(String inputString){
        if(inputString.length() > 1000 || inputString.length() < 1) {
            throw new ArithmeticException("length of string is over 1000 or less then 1");
        }
    }
}
