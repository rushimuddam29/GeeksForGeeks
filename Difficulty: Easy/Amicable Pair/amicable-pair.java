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
            String S[] = read.readLine().split(" ");
            
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.isAmicable(A,B));
        }
    }
}
// } Driver Code Ends





class Solution {
    static int isAmicable(int A, int B) {
        
        int sumA = sumOfDivisors(A);
        int sumB = sumOfDivisors(B);
        
        if (sumA == B && sumB == A) {
            return 1;  
        } else {
            return 0;  
        }
    }
    
    static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
