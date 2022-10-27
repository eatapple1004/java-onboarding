package onboarding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
    기능 구현 목록
    1. 덧셈 함수
    2. 곱셈 함수
    3. 비교 함수
 */
class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {

        int answer = Integer.MAX_VALUE;
        int pobiFinalScore;
        int crongFinalScore;
        List<Integer> pobiNums  = new ArrayList<Integer>();
        List<Integer> crongNums = new ArrayList<Integer>();;


        for(int i=0; i < pobi.size(); i++) {
            pobiNums.add(addNum(pobi.get(i)));
            pobiNums.add(multiplyNum(pobi.get(i)));
        }
        for(int i=0; i < crong.size(); i++) {
            crongNums.add(addNum(pobi.get(i)));
            crongNums.add(multiplyNum(pobi.get(i)));
        }



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

    public static int compareNums (int num1, int num2) {
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


}