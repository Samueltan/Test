package other;

import utils.NumberConverter;

import java.io.UnsupportedEncodingException;

/**
 * Created by Samuel on 2014/12/11.
 */
public class Test {
    public static void main(String[] argc){
//        Test test = new Test();
//        String s = null;
//        String s2 = null;
//        try {
//            s = new String("汉字".getBytes("utf8"), "GBK");
//            s2 = new String(s.getBytes("GBK"), "utf8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("s = " + s);
//        System.out.println("s2 = " + s2);
//        System.out.println(test);
//
//        String sf = new String("3.14");
//        float f = Float.parseFloat(sf);
//        System.out.println(f);
//
//        String sf2 = String.valueOf(f);
//        String sf22 = Float.toString(f);
//        System.out.println("sf2 = " + sf2 + ", sf22 = " + sf22);

        System.out.println("1<<33 = " + NumberConverter.toBinary(1 << 33));
        System.out.println("-2>>2 = " + (-2 >> 5) + ", " + NumberConverter.toBinary(-2 >>> 5));
    }
}
