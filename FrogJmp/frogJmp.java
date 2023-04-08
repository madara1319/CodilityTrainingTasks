// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
                double solution=0;
        double Xd=X;
        double Yd=Y;
        double Dd=D;

        if(X>=Y)
        {
            solution=0;
        }
        else
        {
            solution=(Yd-Xd)/Dd;
        }

        return (int)(Math.ceil(solution));
    }
}