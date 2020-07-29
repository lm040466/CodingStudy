#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    vector<int> ans;
    int num, temp;
    cin >> num;

    for (int i = 0; i < num; i++)
    {
        cin >> temp;
        ans.push_back(temp);
    }

    sort(ans.begin(), ans.end());

    for (int j = 0; j < num; j++)
        cout << ans[j] << endl;
}