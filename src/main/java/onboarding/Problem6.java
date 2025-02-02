package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem6 {
    static List<String> partNameList        = new ArrayList<String>();
    static List<String> overlapPartNameList = new ArrayList<String>();
    static List<String> nameList            = new ArrayList<String>();
    static List<String> emailList           = new ArrayList<String>();

    static List<String> overlapNameEmailList = new ArrayList<String>();
    static List<Integer> overlapNameIndexList   = new ArrayList<Integer>();
    static List<String> sortedEmailList = new ArrayList<String>();
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        getAnswer(forms);
        return sortedEmailList;
    }

    public static void getAnswer(List<List<String>> forms) {

        getNameList(forms);
        getEmailList(forms);
        getPartNameList(nameList);
        getOverlapPartNameList();
        removeOverlapPartNameList();
        getOverlapNameIndexList();
        getOverlapNameEmailList();
        sortEmailList();

    }

    public static void getNameList(List<List<String>> forms) {
        for (List<String> form : forms) {
            nameList.add(form.get(1));
        }
    }

    public static void getEmailList(List<List<String>> forms) {
        for (List<String> form : forms) {
            //int dividePoint = form.get(0).indexOf("@");
            //emailList.add(form.get(0).substring(0, dividePoint-1));
            emailList.add(form.get(0));
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
                }
            }
        }
    }

    public static void removeOverlapPartNameList() {
        overlapPartNameList = overlapPartNameList.stream().distinct().collect(Collectors.toList());
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

    public static void sortEmailList() {
        List<String> sortEmailList= new ArrayList<String>();
        String[] emailList = new String[overlapNameEmailList.size()];
        for(int i=0; i<overlapNameEmailList.size(); i++) {
            emailList[i] = overlapNameEmailList.get(i);
        }
        Arrays.sort(emailList);
        for(int i=0; i<emailList.length; i++) {
            sortEmailList.add(emailList[i]);
        }
        sortedEmailList = sortEmailList;
    }




}
