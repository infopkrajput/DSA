#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    int peakIndexInMountainArray(vector<int> &arr)
    {
        int n = arr.size();
        int st = 0, end = n - 1, mid;
        while (st <= end)
        {
            mid = st + (end - st) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            if (arr[mid] > arr[mid - 1])
            {
                st = mid;
            }
            else
            {
                end = mid;
            }
        }

        return -1;
    }
};

int main()
{
    vector<int> nums = {3, 5, 3, 2, 0};
    Solution obj;
    cout << obj.peakIndexInMountainArray(nums) << endl;
    return 0;
}