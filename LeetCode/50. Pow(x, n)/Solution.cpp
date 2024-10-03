#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    double myPow(double x, int n)
    {
        long long bin = (long long)n;
        if (bin == 0)
            return 1.0;
        if (bin == 0)
            return 0.0;
        if (x == 1)
            return 1.0;
        if (x == -1 && bin % 2 == 0)
            return 1.0;
        if (x == -1 && bin % 2 != 0)
            return -1.0;
        double ans = 1;
        if (bin < 0)
        {
            x = 1 / x;
            bin = -bin;
        }
        while (bin != 0)
        {
            if (bin % 2 == 1)
            {
                ans *= x;
            }
            x *= x;
            bin /= 2;
        }
        return ans;
    }
};
int main()
{
    Solution obj;
    double x = 2.0;
    int n = -2147483648;
    double y = obj.myPow(x, n);
    cout << y << endl;
    return 0;
}