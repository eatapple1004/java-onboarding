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

    
}
