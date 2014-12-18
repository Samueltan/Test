package other;

public class EliminateVowel
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static String eliminateVowelString(String string){
        // Eliminate all the vowels from the input string
        // Return the string without vowels
        // INSERT YOUR CODE HERE
        char[] vowel = {'a', 'e','i','o','u','A','E','I','O','U'};
        StringBuffer sb = new StringBuffer();

        try {
            // Search the string and check the letter one by one and mark if a vowel is found
            for(int ii=0; ii<string.length(); ++ii) {
                boolean isVowel = false;
                char c = string.charAt(ii);
                for (int jj = 0; jj < 10; ++jj) {
                    if (c == vowel[jj]) {
    //                    System.out.println("*** jj = " + jj + ", c = " + c + ", isVowel = " + isVowel);
                        isVowel = true;
                        break;
                    }
                }
//                System.out.println("sb = " + sb);
                    // Add the char to sb if it is not a vowel character
                    if (!isVowel) {
                        sb.append(c);
                    }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }
// METHOD SIGNATURE ENDS

    // DO NOT IMPLEMENT THE main( ) METHOD
    public static void main(String[] args)
    {
        // PLEASE DO NOT MODIFY THIS FUNCTION
        // YOUR FUNCTION SHALL BE AUTOMATICALLY CALLED AND THE INPUTS FROM HERE SHALL BE PASSED TO IT
        String string="abcdefghijklmnopqrstuvwxyz";
        String result;
        // ASSUME INPUTS HAVE ALREADY BEEN TAKEN
        result=eliminateVowelString(string);
        System.out.println(result);
        // Print the output
    }
}
