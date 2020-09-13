package DZ2;

public class DZ25 {

    public static void main(String[] args) {


        int[] arr25 = {33,11,55,66};

        boolean compare=true;
        int i=3;

        for (; i<=arr25.length; ++i) {
            if (arr25[i-1]<=arr25[i]) {
                break;
            } else System.out.println(i);
            }
        /*
        if (i>0) {
          System.out.println(++i);
        } else if (i<0) {
            System.out.println(i=i-2);
        } else {
            System.out.println(i=10);
        }
        */
    }
}
