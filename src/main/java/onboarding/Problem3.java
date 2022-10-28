package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        return answer;
    }

    public static void checkInputError(int num) {
        if(num < 1 || num > 10000) { // 규격에 맞지 않는 수를 입력
            throw new ArithmeticException();
        }
    }

    public static boolean checkPlaceValue(int num) {
        int tempNum = num;
        while(tempNum != 0) {
            int placeValue = tempNum % 10;
            tempNum = tempNum/10;
            if(placeValue == 3 || placeValue == 6 || placeValue == 9) {
                return true;
            }
        }
        return false;
    }

    public static int calClapNum(int num) {
        int clapNum = 0;
        int tempNum = num;
        while(tempNum != 0) {
            int placeValue = tempNum % 10;
            tempNum = tempNum/10;
            if(placeValue == 3 || placeValue == 6 || placeValue == 9) {
                clapNum++;
            }
        }
        return clapNum;
    }
}
