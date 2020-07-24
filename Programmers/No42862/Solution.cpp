#include <string>
#include <vector>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve)
{
    int answer = 0;
    vector<int> member(n + 2);
    for (int x : reserve)
        member[x]++;
    for (int y : lost)
        member[y]--;
    for (int i = 1; i < member.size() - 1; i++)
    {
        if (member[i] > 0 && member[i - 1] < 0)
        {
            member[i]--;
            member[i - 1]++;
        }
        if (member[i] > 0 && member[i + 1] < 0)
        {
            member[i]--;
            member[i + 1]++;
        }
    }
    for (int z : member)
    {
        if (z >= 0)
            answer++;
    }

    return answer - 2;
}