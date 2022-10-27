package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {

        try {
            checkInputData(cryptogram);
        }
        catch(ArithmeticException e) {
            return e.getMessage();
        }

        String answer = "answer";

        return answer;
    }

    public static void checkInputData(String inputString){
        if(inputString.length() > 1000 || inputString.length() < 1) {
            throw new ArithmeticException("length of string is over 1000 or less then 1");
        }
    }

}
