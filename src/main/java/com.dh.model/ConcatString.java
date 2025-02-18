package com.dh.model;

class ConcatString {

         static String concat(String[] strings) {
        StringBuilder tot = new StringBuilder();
        for(String str : strings){
             tot.append(str);
             }
         return tot.toString();

        	}
         }
