#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    int countPrimes(int n)
    {
        if (n <= 1)
            return 0;
        vector<int> isPrime(n + 1, true);
        int count = 0;
        for (int i = 2; i < n; i++)
        {
            if (isPrime[i])
            {
                count++;
                for (int j = i * 2; j < n; j += i)
                {
                    isPrime[j] = false;
                }
            }
        }
        return count;
    }
};
int main()
{
    Solution obj;
    int n = 50;
    cout << obj.countPrimes(n) << endl;
    return 0;
}