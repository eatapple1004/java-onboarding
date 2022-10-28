package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";

        try {
            checkInputData(cryptogram);
        }
        catch(ArithmeticException e) {
            return e.getMessage();
        }

        boolean overlapYN = true;
        char[] charCryptogram = cryptogram.toCharArray();

        while(overlapYN) {

        }

        return answer;
    }

    public static void checkInputData(String inputString){
        if(inputString.length() > 1000 || inputString.length() < 1) {
            throw new ArithmeticException("length of string is over 1000 or less then 1");
        }
    }

    public static boolean checkOverlap(char[] charCryptogram) {
        for(int i=0; i< charCryptogram.length-1; i++) {
            char currentChar = charCryptogram[i];
            char nextChar = charCryptogram[i+1];

            if(currentChar == nextChar) {
                return true;
            }
            else {
                continue;
            }
        }
        return false;
    }

}
