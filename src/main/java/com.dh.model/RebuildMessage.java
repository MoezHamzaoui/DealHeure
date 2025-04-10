package com.dh.model;

import java.util.*;

public class RebuildMessage {
    public static String rebuildMessage(List<String> parts){
        Map<Character, String> startMap =new HashMap<>();

        for (String s:parts){
            startMap.put(s.charAt(0),s);
        }
        StringBuilder message = new StringBuilder(startMap.get('A'));
        while (message.charAt(message.length()-1) !='Z'){
            char lastChar = message.charAt(message.length() - 1);
            String nextPart = startMap.get(lastChar);
            message.append(nextPart.substring(1));
        }
        return message.toString();
    }

    public static void main(String[] args){
        List<String> parts = Arrays.asList(
                "*====#",
                "X-+-+-+-+-+-Z",
                "#______X",
                "A.........*");
        System.out.println("message "+ rebuildMessage(parts));
    }
}
