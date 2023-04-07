import java.util.Arrays;

class Solution {
        public int Max(int[] A)
    {
        int max=A[0];
        for(int k=0; k<A.length; k++)
        {
            if(max<A[k])
            {
                max=A[k];
            }
        }
        return max;
    }
    
    public int solution(int[] A) {
                int temp = 0;
        int max=Max(A);
        //System.out.println(max);
        int[] box= new int[max+1];
        //System.out.println(Arrays.toString(box));

        if (A.length==1)
        {
            temp=A[0];
        }
        else
        {
            for (int i = 0; i < A.length; i++)
            {
                box[A[i]]+=1;
            }
            //System.out.println(Arrays.toString(box));

            for (int j = 0; j < box.length; j++)
            {
                if(box[j]==1)
                {
                    //System.out.println(j);
                    temp=j;
                }
            }
        }

        return temp;
    }
}