#include <iostream>
#include <vector>
#include <algorithm> 
using namespace std;
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size();
        // sort array
        sort(nums.begin(), nums.end());
        int frequency = 1, result = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                frequency++;
            } else {
                frequency = 1;
                result = nums[i];
            }
            if (frequency > n / 2) {
                return result;
            }
        }
        return result;
    }
};
int main()
{
    Solution solution;
    vector<int> nums = {2,2,1,1,1,2,2};
    int x = solution.majorityElement(nums);
    cout << "Majority element: " << x << endl;    
    return 0;
}