//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++


class Solution {
public:
    //Function to find the roots of a quadratic equation.
    vector<double> FindRoots(int A, int B, int C) {
    	vector<double>ans;
    	
    	//calculating the discriminant.
    	double D = B*B - 4.0*A*C;
    	
    	//if discriminant is negative, equation has no real roots.
    	if(D < 0){
    		ans.push_back(-1);
    		return ans;
    	}
    	
    	//calculating the roots using quadratic formula.
    	double r1 = (-B + sqrt(D))/(2.0*A);
    	double r2 = (-B - sqrt(D))/(2.0*A);
    	
    	//storing the roots in the result vector.
    	ans.push_back(r1);
    	ans.push_back(r2);
    	
    	//sorting the roots in ascending order.
    	sort(ans.begin(), ans.end());
    	
    	//returning the result vector.
    	return ans;
    }
};



//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int A, B, C;
		cin >> A >> B >> C;
		Solution obj;
		vector<double>ans = obj.FindRoots(A, B, C);
		if(ans.size() == 1){
			cout << (int)ans[0] << "\n";
			continue;
		}
		for(auto i: ans)
			cout  << fixed << setprecision(6) << i << " ";
		cout << "\n";
	}
	return 0;
}
// } Driver Code Ends