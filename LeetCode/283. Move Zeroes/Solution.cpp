#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    void moveZeroes(vector<int> &nums)
    {
        int n = nums.size();
        int i = 0;
        int j = 0;
        int t;
        while (j <= n - 1)
        {
            if (nums[i] == 0 && nums[j] != 0)
            {
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j++;
            }
            else if (nums[i] == 0 && nums[j] == 0)
            {
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
    }
};
int main()
{
    vector<int> nums = {1, 2, 0, 0, 2, 3};
    Solution obj;
    obj.moveZeroes(nums);
    for (int i : nums)
    {
        cout << i << " ";
    }
    return 0;
}