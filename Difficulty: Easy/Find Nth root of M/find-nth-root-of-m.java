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
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int l=0;
        int r=m;
        
        while(l<=r){
            int mid=(l+r)/2;
            
            if(Math.pow(mid,n) == m){
                return mid;
            }
            
            else if(Math.pow(mid,n) < m){
                l=mid+1;
            }
            
            else{
                r=mid-1;
            }
        }
        return -1;
    }
}