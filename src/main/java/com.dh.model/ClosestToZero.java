package com.dh.model;

import java.util.Arrays;
import java.util.List;

class ClosestToZero {
    public static Integer closestToZero (List<Integer> inst) {

        if( inst == null || inst.size()==0){
            return 0;
        }

        Integer diff = inst.get(0);
        for(int i=1; i<inst.size();i++){
           if(Math.abs(inst.get(i)) < Math.abs(diff) || Math.abs(inst.get(i)) == Math.abs(diff) && inst.get(i)>diff){
               diff = inst.get(i);
            }
        }
        return diff;
    }

    public static void main (String [] args) {
        System.out.println("Result " + closestToZero(Arrays.asList(-5,5,-2)));
    }
}
