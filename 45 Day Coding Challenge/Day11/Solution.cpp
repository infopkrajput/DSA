#include <bits/stdc++.h>
using namespace std;
int findFirstPosition(const vector<int> &arr, int x) {
  int low = 0, high = arr.size() - 1;
  int firstPos = -1;
  while (low <= high) {
    int mid = low + (high - low) / 2;
    if (arr[mid] == x) {
      firstPos = mid;
      high = mid - 1;
    } else if (arr[mid] < x) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }
  return firstPos;
}
int findLastPosition(const vector<int> &arr, int x) {
  int low = 0, high = arr.size() - 1;
  int lastPos = -1;
  while (low <= high) {
    int mid = low + (high - low) / 2;
    if (arr[mid] == x) {
      lastPos = mid;
      low = mid + 1;
    } else if (arr[mid] < x) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }
  return lastPos;
}
vector<int> searchRange(const vector<int> &arr, int x) {
  vector<int> result(2, -1);
  int firstPos = findFirstPosition(arr, x);
  if (firstPos != -1) {
    int lastPos = findLastPosition(arr, x);
    result[0] = firstPos;
    result[1] = lastPos;
  }
  return result;
}
int main()
{
   vector<int> arr = {1, 2, 4, 4, 5};
   int x = 4;
   vector<int> result = searchRange(arr, x);
   cout << "First occurrence of " << x << ": " << result[0] << endl;
   cout << "Last occurrence of " << x << ": " << result[1] << endl;
    return 0;
}