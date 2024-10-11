#include <iostream>
#include <vector>
using namespace std;

void sortColors1(vector<int> &nums)
{
    int num0 = 0, num1 = 0, num2 = 0;

    for (int i = 0; i < nums.size(); i++)
    {
        if (nums[i] == 0)
            num0++;
        else if (nums[i] == 1)
            num1++;
        else if (nums[i] == 2)
            num2++;
    }
 
 

    for (int i = 0; i < nums.size(); i++)
    {
        if (num0 > 0)
        {
            nums[i] = 0;
            num0--;
        }
        else if (num1 > 0)
        {
            nums[i] = 1;
            num1--;
        }
        else if (num2 > 0)
        {
            nums[i] = 2;
            num2--;
        }
    }
}

void sortColors2(vector<int> &nums)
{
    int low = 0, mid = 0, high = nums.size() - 1;

    while (mid <= high)
    {
        if (nums[mid] == 0)
        {
            swap(nums[low], nums[mid]);
            low++;
            mid++;
        }
        else if (nums[mid] == 1)
        {
            mid++;
        }
        else
        { // nums[mid] == 2
            swap(nums[mid], nums[high]);
            high--;
        }
    }
}

int main()
{
    vector<int> arr = {2, 0, 2, 1, 1, 0};

    sortColors2(arr);

    for (int i : arr)
    {
        cout << i << " ";
    }

    return 0;
}
