/**
 * Created by Samuel on 2014/10/26.
 */
public class Test {
    public static void main(String[] args)
    {
        LinkedList<String> lk1=new LinkedList<String>();
        lk1.add("aa");
        lk1.add("bb");
        lk1.add("cc");
        lk1.add("dd");
        lk1.add("ee",0);

        for(int i=0; i<lk1.size(); ++i) {
            System.out.println(lk1.getElement(i+1));
        }
//        LinkedList<String> lk2=lk1.clonelist();
//        System.out.println(lk2.contains("xx"));
//        System.out.println(lk2.size());
//        System.out.println(lk2.getElement(1));

    }

}