// you can also use imports, for example:
//import java.util.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
        public static int[] toBinary(int number)
    {
        int i=0;
        int[] binaryNumber={};
        while((number/2)>0)
        {
            i++;
            //System.out.println("Run numero: " + i);
            if(number%2!=0)
            {
                //System.out.println(Arrays.toString(binaryNumber));
                binaryNumber=Arrays.copyOf(binaryNumber, binaryNumber.length + 1);
                binaryNumber[binaryNumber.length - 1] = number%2;
                //System.out.println(Arrays.toString(binaryNumber));
            }
            else {
                //System.out.println("podzielna");
                //System.out.println(Arrays.toString(binaryNumber));
                binaryNumber=Arrays.copyOf(binaryNumber, binaryNumber.length + 1);
                binaryNumber[binaryNumber.length - 1] = 0;
                //System.out.println(Arrays.toString(binaryNumber));
            }
            number = number/2;
        }
        Double numberDouble=new Double(number);
        //System.out.println("Double wynosi: " + numberDouble);
        if (numberDouble==1)
        {
            //System.out.println("ostatni");
            //System.out.println(Arrays.toString(binaryNumber));
            binaryNumber=Arrays.copyOf(binaryNumber, binaryNumber.length + 1);
            binaryNumber[binaryNumber.length - 1] = 1;
            //System.out.println(Arrays.toString(binaryNumber));
        }
        for (int j=0; j<binaryNumber.length/2; j++)
        {
            int k = binaryNumber[j];
            binaryNumber[j]=binaryNumber[binaryNumber.length - j - 1];
            binaryNumber[binaryNumber.length - j - 1] = k;
        }
        //System.out.println("odwrocona: " + Arrays.toString(binaryNumber));
        return binaryNumber;
        }
            public static int zeroRowFinder(int[] temp)
    {
        int[] zeroRow={};
        int sumZeroRow=0;
        int[] maxValue={};
        int max=0;
        for (int i=0; i<temp.length; i++)
        {
            int temporaryValue=0;
            if(temp[i]!=1)
            {
                sumZeroRow++;
                //System.out.println("Jes 0: -> " + sumZeroRow);

            }
            else
            {
                temporaryValue=sumZeroRow;
                maxValue=Arrays.copyOf(maxValue, maxValue.length + 1);
                maxValue[maxValue.length - 1] = sumZeroRow;
                sumZeroRow=0;
                //System.out.println("Jes 1: -> " + sumZeroRow);
            }

            for (int j=0; j<maxValue.length; j++)
            {
                if(maxValue[j]>max)
                    max=maxValue[j];
            }

        }
        //System.out.println("Najwieksza przerwa wynosi: " + max);
        return max;
    }
    public static int solution(int N) {
        Solution solution=new Solution();
        return solution.zeroRowFinder(solution.toBinary(N));
    }
}
