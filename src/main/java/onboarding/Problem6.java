package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {
    static List<String> partNameList        = new ArrayList<String>();
    static List<String> overlapPartNameList = new ArrayList<String>();
    static List<String> nameList            = new ArrayList<String>();
    static List<String> emailList           = new ArrayList<String>();

    static List<String> overlapNameEmailList = new ArrayList<String>();
    static List<Integer> overlapNameIndexList   = new ArrayList<Integer>();
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");

        return answer;
    }

    public static void getNameList(List<List<String>> forms) {
        for (List<String> form : forms) {
            nameList.add(form.get(1));
        }
    }

    public static void getEmailList(List<List<String>> forms) {
        for (List<String> form : forms) {
            int dividePoint = form.get(0).indexOf("@");
            emailList.add(form.get(0).substring(0, dividePoint-1));
        }
    }

    public static String getPartName(String fullName, int i) {
        String currentName ="";
        currentName += fullName.charAt(i);
        currentName += fullName.charAt(i+1);
        return currentName;
    }

    public static void getPartNameList(List<String> nameList) {
        for(String name : nameList) {
            for(int i=0; i<name.length()-1; i++) {
                partNameList.add(getPartName(name, i));
            }
        }
    }

    public static void getOverlapPartNameList() {
        for(int i=0; i< partNameList.size(); i++) {
            String currentPartName = partNameList.get(i);
            for(int j=i+1; j<partNameList.size(); j++) {
                String checkPartName = partNameList.get(j);
                if(currentPartName.equals(checkPartName)) {
                    overlapPartNameList.add(currentPartName);
                    partNameList.remove(j);
                    j--;
                }
            }
        }
    }

    public static void getOverlapNameIndexList() {
        for(String partName : overlapPartNameList) {
            for(int i=0;i<nameList.size(); i++) {
                String currentName = nameList.get(i);
                for(int j=0; j<currentName.length()-1; j++) {
                    if(partName.equals(getPartName(currentName, j))){
                        overlapNameIndexList.add(i);
                    }
                    else {
                        continue;
                    }
                }
            }
        }
    }

    public static void getOverlapNameEmailList() {
        for(int index : overlapNameIndexList) {
            overlapNameEmailList.add(emailList.get(index));
        }
    }



}
