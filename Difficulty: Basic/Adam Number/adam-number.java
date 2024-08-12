//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.checkAdamOrNot(N));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution {
    static String checkAdamOrNot(int N) {
        // code here
        int sqN = N*N;
        
        int rev = reverse(N);
        
        int sqR = rev * rev;
        
       String s =   new StringBuilder(String.valueOf(sqN)).reverse().toString();
       String r = String.valueOf(sqR);
       if(s.equals(r)) return "YES";
       return "NO";
    }
    
    static int reverse(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev;
    }
}