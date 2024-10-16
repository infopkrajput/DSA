#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    int search(vector<int> &nums, int target)
    {
        int n = nums.size();
        int start = 0;
        int end = n - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
            {
                return mid;
            }
            else if (target > nums[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
};
int main()
{
    Solution obj;
    vector<int> nums = {-1, 0, 3, 5, 9, 12};
    int target = 9;
    cout << obj.search(nums, target) << endl;
    return 0;
}