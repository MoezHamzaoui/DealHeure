package com.dh.model;

import java.util.*;
public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        Set<Integer> set = new HashSet<>();
        int uniqueResult = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.addLast(num);
            set.add(num);

            if(deque.size()>m){
                int numero = (int)deque.removeFirst();
                if(!deque.contains(numero)){
                    set.remove(numero);
                }

            }
            if(deque.size()==m){
                uniqueResult = Math.max(uniqueResult, set.size());

            }
        }
        System.out.println(uniqueResult);
    }
}



