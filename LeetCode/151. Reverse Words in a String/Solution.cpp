#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    string reverseWords(string s)
    {
        reverse(s.begin(), s.end());

        string newS = "";
        string word = "";
        
        for (int i = 0; i < s.length(); i++)
        {
            if (s[i] == ' ')
                continue;

            word = "";
            while (i < s.length() && s[i] != ' ')
            {
                word += s[i];
                i++;
            }
            
            reverse(word.begin(), word.end());
            
            if (!newS.empty())
                newS += ' ';
                
            newS += word;
        }
        return newS;
    }
};

int main()
{
    Solution obj;
    string str = "the sky   is blue";
    cout << obj.reverseWords(str) << endl;
    return 0;
}
