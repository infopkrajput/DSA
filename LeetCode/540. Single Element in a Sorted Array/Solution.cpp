#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    int singleNonDuplicate(vector<int> &nums)
    {
        int n = nums.size();
        if (n == 1)
        {
            return nums[0];
        }
        int start = 0;
        int end = n - 1;
        int mid;
        while (start <= end)
        {
            mid = start + (end - start) / 2;

            if (mid == 0 && nums[0] != nums[1])
            {
                return nums[mid];
            }
            if (mid == n - 1 && nums[n - 1] != nums[n - 2])
            {
                return nums[mid];
            }

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
            {
                return nums[mid];
            }

            if (mid % 2 == 0)
            { // Even index
                if (nums[mid - 1] == nums[mid])
                { // left side
                    end = mid - 1;
                }
                else
                { // right side
                    start = mid + 1;
                }
            }
            else
            { // Odd index
                if (nums[mid - 1] == nums[mid])
                { // right side
                    start = mid + 1;
                }
                else
                { // left side
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
};
int main()
{
    vector<int> nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
    Solution obj;
    cout << obj.singleNonDuplicate(nums) << endl;
    return 0;
}