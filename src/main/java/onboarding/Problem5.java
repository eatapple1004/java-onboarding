package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {

    static final int[] moneyUnits = {50000,10000,5000,1000,500,100,50,10,1};
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        answer = getAnswer(money);
        return answer;
    }

    public static int getQuotient(int money, int moneyUnit) {
        int quotient = money/moneyUnit;
        return quotient;
    }


    public static int getRemainder(int money, int moneyUnit) {
        int remainer = money % moneyUnit;
        return remainer;
    }

    public static List<Integer> getAnswer(int money) {
        List<Integer> answer = new ArrayList<Integer>();
        int leftMoney = money;
        for(int moneyUnit : moneyUnits) {
            answer.add(getQuotient(leftMoney, moneyUnit));
            leftMoney = getRemainder(leftMoney, moneyUnit);
        }
        return answer;
    }
}