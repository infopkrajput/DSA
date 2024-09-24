#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    int removeElement(vector<int> &nums, int val)
    {
        int newLength=0;
        for (int i = 0; i < nums.size(); i++)
        {
            if(nums[i] != val)
            {
                nums[newLength++] = nums[i];
            }
        }
        return newLength;
    }
};
int main()
{
    Solution solution;
    vector<int> elements = {0,1,2,2,3,0,4,2};
    int value = 2;
    int x = solution.removeElement(elements, value);
    cout << "Number of elements after removing " << value << ": " << x << endl;
    return 0;
}