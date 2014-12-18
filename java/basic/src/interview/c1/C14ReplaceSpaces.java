package interview.c1;

/**
 * Created by Samuel on 2014/12/17.
 */
public class C14ReplaceSpaces {
    static void replaceSpaces2(char[] str, int length){
        int i, newlength, spaceCount = 0;

        for(i=0; i<length; ++i){
            if(str[i] == ' ') ++spaceCount;
        }
        newlength = length + 2 * spaceCount;
        str[newlength] = 0;

        for(i=length-1; i>=0; --i){
            if(str[i] == ' '){
                str[--newlength] = '0';
                str[--newlength] = '2';
                str[--newlength] = '%';
            }else{
                str[--newlength] = str[i];
            }
        }
    }

    public static void main(String[] args) {
        char[] s = "hello world !                  ".toCharArray();
        replaceSpaces2(s, 13);

        System.out.println(s);
    }
}
