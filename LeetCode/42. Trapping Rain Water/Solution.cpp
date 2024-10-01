#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    int trap(vector<int> &height)
    {
        int n = height.size();
        if (n == 0)
            return 0;
        vector<int> leftMost(n);
        leftMost[0] = height[0];
        for (int i = 1; i < n; i++)
        {
            leftMost[i] = max(height[i], leftMost[i - 1]);
        }

        vector<int> rightMost(n);
        rightMost[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--)
        {
            rightMost[i] = max(height[i], rightMost[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++)
        {
            int waterLevel = min(leftMost[i], rightMost[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
};
int main()
{
    Solution ob;
    vector<int> arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int x = ob.trap(arr);
    cout << x << endl;
    return 0;
}