#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); };
    int findGCD(vector<int>& nums) {
        int a = *min_element(nums.begin(), nums.end());
        int b = *max_element(nums.begin(), nums.end());
        return gcd(a, b);
    }
};
int main()
{
    vector<int> nums = {2,5,6,9,10};
    Solution obj;
    cout << obj.findGCD(nums) << endl;
    return 0;
}