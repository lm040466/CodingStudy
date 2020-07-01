#include <iostream>
#include <cmath> // pow
using namespace std;

int num, n;
string ans;

int main()
{
    cin >> num >> n;
    int temp;

    while (num != 0)
    {
        temp = num % n; // 나머지
        num = num / n;  // 몫

        // 'A' = 65(ASCII), '1' = 49(ASCII)
        if (temp > 9)
            ans = (char)(temp + 55) + ans;
        else
            ans = (char)(temp + 48) + ans;
    }

    cout << ans << endl;
}