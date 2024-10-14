#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    static bool containsDuplicate(int nums[], int size)
    {
        sort(nums, nums + size);
        for (int i = 0; i < size - 1; i++)
        {
            if (nums[i] == nums[i + 1])
            {
                return true;
            }
        }
        return false;
    }
};

int main()
{
    Solution obj;
    int arr[] = {1, 2, 3, 1};
    int size = sizeof(arr) / sizeof(arr[0]);

    if (obj.containsDuplicate(arr, size))
    {
        cout << "true" << endl;
    }
    else
    {
        cout << "false" << endl;
    }
    return 0;
}
