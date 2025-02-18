package com.dh.model;

public class Drama {

    public static String addDrama(String str){
        char[] chars = str.toCharArray();
        StringBuilder groupExclam = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == '!') {
                groupExclam.append(aChar);
            } else if (!groupExclam.isEmpty()) {
                str = str.replace(groupExclam.toString(), "!");
                groupExclam = new StringBuilder();
            }
        }
        return str.replace(".", "!");
    }

    public static void main (String [] args){
        System.out.println(addDrama("Hello!!! .. !!World!!dddd!!!!"));
    }
}
