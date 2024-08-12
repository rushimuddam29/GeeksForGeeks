//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {
            int N = scn.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> sum = ob.getSum(N);
            System.out.println(sum.get(0)+" "+sum.get(1));
        }
    }
}

// } Driver Code Ends




//User function Template for Java
class Solution{
    static ArrayList<Integer> getSum(int N){
        // code here

        ArrayList<Integer>sum=new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1;i<=N;i++){
            if(i%2==0){
                sum1 += i;
            }
            else{
                sum2 += i;
            }
        }
        sum.add(sum1);
        sum.add(sum2);
        return sum;
    }
}