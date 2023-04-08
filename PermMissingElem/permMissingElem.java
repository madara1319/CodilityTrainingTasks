import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
                int max = 0;
        int solution = 0;
        int sum=0;
        //--------------------------------------------------------------------------
        //looking for max value from array
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        //--------------------------------------------------------------------------
        //create empty array with pockets to storage values from array A
        int array[] = new int[max + 1];
        //System.out.println(Arrays.toString(array));

        //if array A is 1
        if (A.length == 0) {
            array[0] = 2137;
            solution=1;

        }
        else if(A.length==1)
        {
            if(A[0]==0)
            {
                solution=1;
            }
            else if(A[0]==1)
            {
                solution=2;
            }
            else if(A[0]==2)
            {
                solution=1;
            }
        }
        else {
            //if a number exists in array A add +1 to the matching array field
            for (int j = 0; j < A.length; j++) {
                array[A[j]] += 1;
            }
        }
        //--------------------------------------------------------------------------
        //if theres 0 it means there wasnt such value in array A
        for (int l = 1; l < array.length; l++)
        {
            sum+=array[l];
            if (array.length > 2) {
                if (array[l - 1] == 0 ) {
                    solution = l - 1;
                }
                else if (sum==(array.length-1))
                {
                    solution = l+1;
                }
            }
        }
     //--------------------------------------------------------------------------

        //System.out.println(Arrays.toString(array));
        //System.out.println("Suma: " + sum);
        //System.out.println("Dlugosc: " + (array.length-1));
        return solution;
    }
}