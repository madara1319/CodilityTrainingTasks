import java.util.Arrays;

class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
                int[] temp={};
        temp=Arrays.copyOf(A, A.length);
        for (int i=0; i < A.length; i++)
        {
            if(i>=K)
            {
                temp[i]=A[i-K];
            }
            else
            {
                temp[i]=A[A.length-K+i];
            }
        }


        //System.out.println("temp: " + Arrays.toString(temp));
        //System.out.println("array: " + Arrays.toString(A));
        return temp;
    }
}