#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    bool isPalindrome(string s)
    {
        int start = 0, end = s.length() - 1;

        while (start <= end)
        {
            if (!isalnum(s[start]))
            {
                start++;
            }
            else if (!isalnum(s[end]))
            {
                end--;
            }
            else if (tolower(s[start]) != tolower(s[end]))
            {
                return false;
            }
            else
            {
                start++;
                end--;
            }
        }
        return true;
    }
};

int main()
{
    string s = "A man, a plan, a canal: Panama";
    Solution obj;
    cout << obj.isPalindrome(s) << endl;
    return 0;
}
