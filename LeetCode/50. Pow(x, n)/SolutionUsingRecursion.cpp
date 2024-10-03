#include <iostream>
using namespace std;

class Solution
{
public:
    double myPow(double x, int n)
    {
        // Base case: any number raised to the power of 0 is 1
        if (n == 0)
            return 1.0;

        // Handle negative powers by converting to positive
        // Note: n is `int` and can overflow when negated, so use long long
        long long bin = n;
        if (bin < 0)
        {
            x = 1 / x;
            bin = -bin; // Convert the exponent to positive
        }

        // Call the recursive function to compute the power
        return powRecursive(x, bin);
    }

    double powRecursive(double x, long long n)
    {
        // Base case: if exponent becomes 0, return 1
        if (n == 0)
            return 1.0;

        // Recursively divide the problem
        double half = powRecursive(x, n / 2);

        // If n is even: x^n = (x^(n/2))^2
        // If n is odd: x^n = x * (x^(n/2))^2
        if (n % 2 == 0)
        {
            return half * half;
        }
        else
        {
            return x * half * half;
        }
    }
};

int main()
{
    Solution obj;
    double x = 4;
    int n = 8;
    double y = obj.myPow(x, n);
    cout << y << endl;
    return 0;
}
