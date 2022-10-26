package onboarding;

import java.util.*;

/*
    기능 구현 목록
    1. 덧셈 함수
    2. 곱셈 함수
    3. 비교 함수
 */
class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {

        int answer = Integer.MAX_VALUE;
        //각 캐릭터들이 받음 점수 리스트.



        return answer;
    }

    public static int addNums(int pageNum) {
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
}