#include <iostream>
#include <climits> // For INT_MAX and INT_MIN

class Solution
{
public:
    int reverse(int x)
    {
        int rev = 0;
        while (x != 0)
        {
            int rem = x % 10;

            if (rev > (INT_MAX / 10) || (rev < (INT_MIN / 10)))
            {
                return 0;
            }

            rev = rev * 10 + rem;
            x /= 10;
        }

        return rev;
    }
};

using namespace std;

int main()
{
    Solution s;
    int num = -2147483648; // Testing with INT_MIN
    int reverse_num = s.reverse(num);
    if (reverse_num == 0)
    {
        cout << "Overflow occurred, cannot reverse the number." << endl;
    }
    else
    {
        cout << "Reversed number is: " << reverse_num << endl;
    }
    return 0;
}
