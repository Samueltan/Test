package utils;

/**
 * Created by Samuel on 2014/12/15.
 */
public class NumberConverter {
    // Number to binary string
    public static String toBinary(int number){
        StringBuffer bin = new StringBuffer();
        for(int i=0; i<32; ++i){
            if(i%8 == 0){
                bin.append(" ");
            }
            bin.append((number >> (31 - i)) & 1);
        }
        return bin.toString();
    }


    public static void main(String[] args){
        int i=0x2467;    //9678453
        System.out.println(toBinary(i));
    }
}
