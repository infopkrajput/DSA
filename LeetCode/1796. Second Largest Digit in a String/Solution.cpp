#include <iostream>
using namespace std;
class Solution {
public:
    int secondHighest(string s) {
        int max1, max2;
        max1 = max2 = INT_MIN;
        for (int i = 0; i < s.length(); i++) {
            if (s[i] >= '0' && s[i] <= '9') {
                if (s[i] - 48 > max1) {
                    max2 = max1;
                    max1 = s[i] - 48;
                } else if (s[i] - 48 > max2 && s[i] - 48 < max1) {
                    max2 = s[i] - 48;
                }
            }
        }
        if (max2 == INT_MIN) {
            return -1;
        }
        return max2;
    }
};
int main(int argc, char const *argv[])
{
    Solution s;
    cout << s.secondHighest("dfa12321afd") << endl; // Output: 2
    cout << s.secondHighest("abc1111") << endl; // Output: -1
    return 0;
}
