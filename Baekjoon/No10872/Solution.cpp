#include <iostream>
using namespace std;

long ans;
int num;

void factorial(int num)
{
    if (num != 1 && num != 0)
    {
        ans *= num;
        num--;
        factorial(num);
    }
}

int main()
{
    cin >> num;
    ans = 1;

    factorial(num);

    cout << ans;
}