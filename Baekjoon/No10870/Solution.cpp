#include <iostream>
using namespace std;

int before, temp, ans, num;

void Fibonacci(int num)
{
    if (num != 1 && num != 0)
    {
        temp = ans;
        ans += before;
        before = temp;
        num--;
        Fibonacci(num);
    }
    else if (num == 0)
        ans = 0;
}

int main()
{
    before = 0;
    ans = 1;
    cin >> num;

    Fibonacci(num);

    cout << ans;
}