#include <bits/stdc++.h>
using namespace std;
int findSecondLargest(int n, vector<int> &arr)
{
    // Write your code here.
    int max1 = INT_MIN, max2 = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] > max1)
        {
            max2 = max1;
            max1 = arr[i];
        }
        else if (arr[i] > max2 && arr[i] != max1)
            max2 = arr[i];
    }
    if (max2 == INT_MIN)
    {
        return -1;
    }
    return max2;

}
int main()
{
    vector<int> arr;
    int n = 5;
    arr = {9,9,9,9,9,9};
    cout << "Second largest element: " << findSecondLargest(n, arr) << endl;
    return 0;
}