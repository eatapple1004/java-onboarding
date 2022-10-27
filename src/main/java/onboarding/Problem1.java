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

        List<HashMap<String, List<Integer>>> nameAndPageList = new ArrayList<>();
        HashMap<String, List<Integer>> pobiPageInfo = new HashMap<>();
        HashMap<String, List<Integer>> crongPageInfo = new HashMap<>();
        pobiPageInfo.put("pobi", pobi);
        crongPageInfo.put("crong", crong);
        nameAndPageList.add(pobiPageInfo);
        nameAndPageList.add(crongPageInfo);

        int pobiFinalScore;
        int crongFinalScore;



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




}