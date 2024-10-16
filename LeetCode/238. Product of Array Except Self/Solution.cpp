#include <iostream>
#include <vector>

using namespace std;
class Solution
{
public:
    vector<int> productExceptSelf(vector<int> &nums)
    {
        int n = nums.size();
        vector<int> ans(n, 1); // Initialize the result array with 1's

        // Forward pass to calculate the prefix products
        for (int i = 1; i < n; i++)
        {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Backward pass to calculate the suffix products
        int suffix = 1;
        for (int i = n - 2; i >= 0; i--)
        {
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }

        return ans;
    }
};

int main()
{
    Solution obj;
    vector<int> arr = {1, 2, 3, 4};
    vector<int> newArr = obj.productExceptSelf(arr);

    for (int i : newArr)
    {
        cout << i << " ";
    }

    return 0;
}
