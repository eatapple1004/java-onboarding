package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem7 {
    static List<String> friendList = new ArrayList<String>();
    static List<String> relateFriendList = new ArrayList<String>();
    static List<String> visitorList = new ArrayList<String>();
    static List<String> recommendFriendList = new ArrayList<String>();
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }

    public static List<String> removeOverlapData(List<String> list) {
        List<String> newList = list;
        newList.stream().distinct().collect(Collectors.toList());
        return newList;
    }


    public static void setFriendList(List<List<String>> friends) {
        for(List<String> friendInfo : friends) {
            friendList.add(friendInfo.get(0));
        }
        friendList = removeOverlapData(friendList);
    }

    public static void setRelateFriendList(List<List<String>> friends) {
        for(List<String> friendInfo : friends) {
            relateFriendList.add(friendInfo.get(1));
        }
        relateFriendList = removeOverlapData(relateFriendList);
        relateFriendList = subtrackList(relateFriendList, friendList);
    }

    public static List<String> subtrackList(List<String> baseList, List<String> subtrackList) {
        List<String> returnList = baseList;
        returnList.removeAll(Arrays.asList(subtrackList));
        return returnList;
    }


}