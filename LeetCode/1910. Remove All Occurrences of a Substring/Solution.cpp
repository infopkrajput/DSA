#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    string removeOccurrences(string s, string part)
    {
        while(s.length() > 0 && s.length() > s.find(part))
        {   
            s.erase(s.find(part),part.length());
        }
        return s;
    }
};
int main()
{
    Solution obj;
    string s = "daabcbaabcbc";
    string part = "abc";
    cout << obj.removeOccurrences(s, part) << endl;

    return 0;
}