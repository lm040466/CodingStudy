#include <iostream>
#include <cmath> // pow
using namespace std;

int n, ans;
string str;

int main()
{
    cin >> str >> n;
    int index = 0; // 지수

    for (int i = str.size() - 1; i >= 0; i--)
    {
        // 'A' = 65(ASCII), '1' = 49(ASCII)
        if (str[i] > 64)
            ans += (int)pow(n, index) * ((int)str[i] - 55);
        else
            ans += (int)pow(n, index) * ((int)str[i] - 48);

        index++;
    }

    cout << ans << endl;
}