package onboarding;

import java.util.ArrayList;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        List<Integer> playerTotalScores = new ArrayList<Integer>();
        List<List<Integer>> allPlayerPageInfo = new ArrayList<List<Integer>>();
        allPlayerPageInfo.add(pobi);
        allPlayerPageInfo.add(crong);

        try {
            checkInputData(allPlayerPageInfo);
        }
        catch(ArithmeticException e) {
            return -1;
        }

        for(int i=0; i<allPlayerPageInfo.size(); i++) {
            List<Integer> eachPageScores = new ArrayList<Integer>();
            List<Integer> singlePlayerPages = allPlayerPageInfo.get(i);
            for(int j=0; j < singlePlayerPages.size(); j++) {
                int pageScore;
                pageScore = getBiggerNum(addNum(singlePlayerPages.get(j)), multiplyNum(singlePlayerPages.get(j)));
                eachPageScores.add(pageScore);
            }
            playerTotalScores.add(getBiggerNum(eachPageScores.get(0),eachPageScores.get(1)));
        }
        answer = getWinner(playerTotalScores.get(0),playerTotalScores.get(1));

        return answer;
    }

    public static int addNum(int pageNum) {
        List<Integer> placeValue = new ArrayList<Integer>() {};

        int tempPageNum = pageNum;
        while(tempPageNum != 0) {
            placeValue.add(tempPageNum % 10);
            tempPageNum = tempPageNum/10;
        }

        int totalAddNum = 0;
        for(int i=0; i<placeValue.size(); i++) {
            totalAddNum += placeValue.get(i);
        }
        return totalAddNum;
    }

    public static int multiplyNum(int pageNum) {
        List<Integer> placeValue = new ArrayList<Integer>() {};

        int tempPageNum = pageNum;
        while(tempPageNum != 0) {
            placeValue.add(tempPageNum % 10);
            tempPageNum = tempPageNum/10;
        }

        int totalMultiplyNum = 1;
        for(int i=0; i<placeValue.size(); i++) {
            totalMultiplyNum *= placeValue.get(i);
        }
        return totalMultiplyNum;
    }

    public static int getBiggerNum (int num1, int num2) {
        if(num1 > num2)       {return num1;}
        else if(num1 < num2)  {return num2;}
        else if(num1 == num2) {return num1;}
        else                  {return -1;}
    }
    public static int getWinner (int pobiScore, int crongScore) {
        if(pobiScore > crongScore)       {return 1;}
        else if(pobiScore < crongScore)  {return 2;}
        else if(pobiScore == crongScore) {return 0;}
        else                             {return -1;}
    }

    public static void checkInputData(List<List<Integer>> allPlayerPageInfo) {
        for(int i=0; i<allPlayerPageInfo.size(); i++) {
            List<Integer> singlePlayerPages = allPlayerPageInfo.get(i);

            if(singlePlayerPages.get(0)%2 != 1) { //왼쪽 페이지가 짝수일 경우
                throw new ArithmeticException();
            }
            else if(singlePlayerPages.get(1)%2 != 0) { //오른쪽 페이지가 홀수일 경우
                throw new ArithmeticException();
            }
            else if(singlePlayerPages.get(1) - singlePlayerPages.get(0) != 1) {
                // 한 플레이어의 두 페이지의 차가 1이 아닐 경우
                throw new ArithmeticException();
            }
        }
    }
}