// // you can also use imports, for example:
// // import java.util.*;

// // you can write to stdout for debugging purposes, e.g.
// // System.out.println("this is a debug message");

// class Solution {
//     public int solution(int X, int Y, int D) {
//                 double solution=0;
//         double Xd=X;
//         double Yd=Y;
//         double Dd=D;

//         if(X>=Y)
//         {
//             solution=0;
//         }
//         else
//         {
//             solution=(Yd-Xd)/Dd;
//         }

//         return (int)(Math.ceil(solution));
//     }
// }

import java.util.Arrays;

class Frog

{

    public static void boolCheck(Boolean[] Y)
    {
        for (boolean b : Y) {
            if (!b) {
                System.out.println("not working" + b);
            }
            System.out.println("Works fine");
        }
    }
        public static int solution(int X, int[] A) {
        //I make array with size of X
            int[] B= new int[X];
            //System.out.println("dlugosc B to " + B.length);
            //I fill array B with element from 1 to X
            for (int j=0; j<B.length; j++)
            {
                B[j]=j+1;
            }
            //I make boolean array with size of X
            Boolean[] boolArray = new Boolean[X];
            Arrays.fill(boolArray, Boolean.FALSE);
            for (int j=0; j<A.length; j++)
                for (int k=0; k<B.length; k++)
                {
                    if (A[j]==B[k]) {
                        boolArray[k]=Boolean.TRUE;
                        System.out.println("j jest rowne " + j + "A k jest rowne " + k);
                        boolCheck(boolArray);
                    }

                }

        return 0;
        }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] A={1,3,1,4,2,3,5,4};
        System.out.println(A[1]);
        solution(5,A);
    }


}
