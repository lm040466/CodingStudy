#include <iostream>
#include <stack>
using namespace std;

int num, temp;
string order;
stack<int> stk;

void func()
{
    cin >> order;

    if (order == "push")
    {
        cin >> temp;
        stk.push(temp);
    }
    else if (order == "pop")
    {
        if (stk.empty())
            cout << -1 << endl;
        else
        {
            cout << stk.top() << endl;
            stk.pop();
        }
    }
    else if (order == "size")
        cout << stk.size() << endl;
    else if (order == "empty")
    {
        if (stk.empty())
            cout << 1 << endl;
        else
            cout << 0 << endl;
    }
    else
    {
        if (stk.empty())
            cout << -1 << endl;
        else
            cout << stk.top() << endl;
    }
}

int main()
{
    cin >> num;

    for (int i = 0; i < num; i++)
    {
        func();
    }
}