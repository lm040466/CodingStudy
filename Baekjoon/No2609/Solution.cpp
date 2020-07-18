#include <iostream>
using namespace std;

int a, b, r, temp;

int main()
{
    cin >> a >> b;

    int min, max;
    min = a * b;

    if (a < b)
    {
        temp = a;
        a = b;
        b = temp;
    }

    if (min != 0)
    {
        while (true)
        {
            if (a % b == 0 || b == 1)
                break;
            int r = a % b;
            a = b;
            b = r;
        }
        max = b;
        min = min / max;
    }

    cout << max << endl
         << min;
}