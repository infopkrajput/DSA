#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    int maxArea(vector<int> &height)
    {
        int n = height.size();
        int st = 0, end = n - 1, maxWater = 0, area, m, water;
        while (st <= end)
        {
            // find the water length
            water = end - st;

            // find the height which is minimum
            m = min(height[st], height[end]);

            // Find the area
            area = water * m;

            // find max area
            maxWater = max(area, maxWater);

            // if the starting pointer is small increase the start pointer otherwise last
            // pointer
            if (height[st] < height[end])
            {
                st++;
            }
            else
            {
                end--;
            }
        }
        // Return result
        return maxWater;
    }
};

int main()
{
    vector<int> nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    Solution obj;
    cout << obj.maxArea(nums) << endl;
    return 0;
}