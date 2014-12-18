package interview.c1;

import utils.NumberConverter;

/**
 * Created by Samuel on 2014/12/16.
 */
public class C11UniqueChar {
    public static boolean isUniqueChar(String str){
        boolean[] mark = new boolean[128];

        for(int i=0;i<str.length();++i){
            int idx = str.charAt(i);
            if(mark[idx])
                return false;
            else{
                mark[idx] = true;
            }
        }
        return true;
    }

    public static boolean isUniqueCharByBit(String str){
        int check = 0;

        for(int i=0;i<str.length();++i){
            int idx = str.charAt(i)-'A' - 31;
            System.out.println("idx = " + idx + ", check = " + NumberConverter.toBinary(check) + ", 1<<idx = " + NumberConverter.toBinary(1<<idx));
            if((check & (1 << idx)) > 0)
                return false;
            else{
                check |= 1 << idx;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(s.length() + ", " + isUniqueCharByBit(s));
    }
}
