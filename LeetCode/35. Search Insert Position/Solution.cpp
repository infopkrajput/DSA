#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int i;
        for (i = 0; i < nums.size(); i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return i;
    }
};
int main()
{
    Solution solution;
    vector<int> elements = {1,3,5,6};
    int target = 5;
    int x = solution.searchInsert(elements, target);
    cout << "Index of the first occurrence of " << target << ": " << x << endl;
    return 0;
}