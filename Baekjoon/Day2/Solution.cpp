#include <iostream>  // std::cout, std::cin
#include <vector>    // std::vector
#include <algorithm> // std::fill
#include <queue>
using namespace std;

void dfs(int start, vector<int> graph[], bool check[])
{
    check[start] = true;
    cout << start << " ";

    for (int i = 0; i < graph[start].size(); i++)
    {
        if (!check[graph[start][i]])
            dfs(graph[start][i], graph, check);
    }
}

void bfs(int start, vector<int> graph[], bool check[])
{
    queue<int> queue;
    queue.push(start);
    check[start] = true;

    while (!queue.empty())
    {
        int temp = queue.front(); // 제일 앞에 있는 원소
        queue.pop();
        cout << temp << " ";

        for (int i = 0; i < graph[temp].size(); i++)
        {
            if (!check[graph[temp][i]])
            {
                queue.push(graph[temp][i]);
                check[graph[temp][i]] = true;
            }
        }
    }
}

int main()
{
    int n, m, start;
    cin >> n >> m >> start;

    vector<int> graph[n + 1];
    // stack과 유사한 개념. 이 문제에선 graph를 사용하여 간선(연결점)을 저장
    bool check[n + 1];
    fill(check, check + n + 1, false); // 배열 초기화를 위한 채우기 함수

    for (int i = 0; i < m; i++)
    {
        int x, y;
        cin >> x >> y;

        graph[x].push_back(y);
        graph[y].push_back(x);
    }

    // 차례대로 접근하기 위해 sort
    for (int j = 1; j < n + 1; j++)
    {
        sort(graph[j].begin(), graph[j].end());
    }

    dfs(start, graph, check);
    cout << endl;

    fill(check, check + n + 1, false);

    bfs(start, graph, check);
}