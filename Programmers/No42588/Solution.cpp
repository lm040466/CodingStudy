#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> heights)
{
    vector<int> answer(heights.size());

    for (int i = 0; i < heights.size(); i++)
    {
        for (int j = i + 1; j < heights.size(); j++)
        {
            if (heights[i] > heights[j])
                answer[j] = i + 1;
        }
    }

    return answer;
}