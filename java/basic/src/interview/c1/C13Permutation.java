package interview.c1;

import java.util.Arrays;

/**
 * Created by Samuel on 2014/12/17.
 */
public class C13Permutation {
    public static boolean isPermutation1(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        char[] sa1 = s1.toCharArray();
        char[] sa2 = s2.toCharArray();

        Arrays.sort(sa1);
        Arrays.sort(sa2);

        s1 = new String(sa1);
        s2 = new String(sa2);

        return s1.equals(s2);
    }

    public static boolean isPermutation2(String s1, String s2){
        int len = s1.length();
        if(len != s2.length())
            return false;

        int[] mark = new int[128];
        for(int i=0; i<len; ++i){
            ++mark[s1.charAt(i)];
        }

        for(int i=0; i<len; ++i){
            if(--mark[s2.charAt(i)] < 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hoell";

        System.out.println(isPermutation2(s1, s2));
    }
}
