package other;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class GrayCheck
{
    //METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int grayCheck(byte term1, byte term2){
        // INSERT YOUR CODE HERE
        byte mask = 0x01;

        int b1, b2;
        int cntDupBits = 0;

        int check = 0;

        // 01001001
        // 01001011
        for(int ii=0; ii<8; ++ii){
            b1 = term1 & mask;
            b2 = term2 & mask;

//            System.out.println("ii=" + ii + ",b1=" + b1 + ",b2=" + b2 + ",mask=" + mask);
            mask <<= 1;
            if(b1 == b2){
                continue;
            }else{
                if(cntDupBits == 0)
                    ++cntDupBits;
                else{
                    return 0;
                }
            }
        }

        return cntDupBits;
    }
// METHOD SIGNATURE ENDS

    // DO NOT IMPLEMENT THE main( ) METHOD
    public static void main(String[] args)
    {
        // PLEASE DO NOT MODIFY THIS FUNCTION
        // YOUR FUNCTION SHALL BE AUTOMATICALLY CALLED AND THE INPUTS FROM HERE SHALL BE PASSED TO IT
        byte term1=(byte)0x4D,term2=(byte)0x4C;
        int out;
        // ASSUME INPUTS HAVE ALREADY BEEN TAKEN
        out = grayCheck(term1,term2);
        System.out.println(out);
    }
}