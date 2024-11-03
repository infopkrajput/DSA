#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int checkPoint = -1;
        int n = nums.size();
        int t;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                checkPoint = i;
                break;
            }
        }
        if (checkPoint == -1) {
            reverse(nums.begin(),nums.end());
        } else {
            for (int i = n - 1; i > checkPoint; i--) {
                if (nums[i] > nums[checkPoint]) {
                    swap(nums[i],nums[checkPoint]);
                    break;
                }
            }
            reverse(nums.begin() + checkPoint + 1, nums.end());
        }
    }

};
int main(int argc, char const *argv[])
{
    Solution obj;
    vector<int> nums = {1,2,3};
    obj.nextPermutation(nums);
    for(int i : nums)
    {
        cout << i << " ";
    }    
    return 0;
}
