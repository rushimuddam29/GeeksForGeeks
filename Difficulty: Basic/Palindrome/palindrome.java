//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends




//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        int rev = 0;
        int dup = n;
        while(n>0){
            int lastdigit = n % 10;
            rev = (rev*10) + (lastdigit);
            n = n/10;
        }
        return dup == rev ? "Yes" : "No";
    }
}