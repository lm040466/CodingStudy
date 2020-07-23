#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int one[] = {1, 2, 3, 4, 5};
int two[] = {2, 1, 2, 3, 2, 4, 2, 5};
int three[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
int member[3], max_s;

vector<int> solution(vector<int> answers)
{
    for (int i = 0; i < answers.size(); i++)
    {
        if (answers[i] == one[i % 5])
            member[0]++;
        if (answers[i] == two[i % 8])
            member[1]++;
        if (answers[i] == three[i % 10])
            member[2]++;
    }

    max_s = member[0] > member[1] ? member[0] : member[1];
    max_s = max_s > member[2] ? max_s : member[2];
    // int they_max = *max_element(they.begin(),they.end());

    vector<int> answer;

    for (int j = 0; j < 3; j++)
    {
        if (max_s == member[j])
            answer.push_back(j + 1);
    }

    return answer;
}