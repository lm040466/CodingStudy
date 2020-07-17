#include <iostream>
#include <queue>
using namespace std;

int num, temp, ans;
priority_queue<int, vector<int>, greater<int>> pq;

int main()
{
    cin >> num;

    for (int i = 0; i < num; i++)
    {
        cin >> temp;
        pq.push(temp);
    }

    ans = 0;

    while (num != 0)
    {
        ans += pq.top() * num;
        pq.pop();
        num--;
    }

    cout << ans;
}