#include <iostream>
#include <string> // to_string(int); int to string   stoi(str); string to int
#include <queue>
using namespace std;

int m, n, k, area, count;
int X, XX, Y, YY;
int board[101][101];

int dx[] = {1, 0, -1, 0};
int dy[] = {0, 1, 0, -1};
priority_queue<int, vector<int>, greater<int>> pq; // 오름차순  less<int> 내림차순

void dfs(int x, int y)
{
    area++;
    board[x][y]--;
    int temp_x, temp_y;

    for (int t = 0; t < 4; t++)
    {
        temp_x = x + dx[t];
        temp_y = y + dy[t];

        if (temp_x < 0 || n <= temp_x || temp_y < 0 || m <= temp_y)
            continue;
        if (board[temp_x][temp_y] == 0)
            dfs(temp_x, temp_y);
    }
}

int main()
{
    cin >> m >> n >> k;

    for (int i = 0; i < k; i++)
    {
        cin >> X >> Y >> XX >> YY;

        for (int j = X; j < XX; j++)
        {
            for (int l = Y; l < YY; l++)
            {
                board[j][l] = 1;
            }
        }
    }

    count = 0;
    for (int a = 0; a < n; a++)
    {
        for (int b = 0; b < m; b++)
        {
            if (board[a][b] == 0)
            {
                area = 0;
                count++;
                dfs(a, b);
                pq.push(area);
            }
        }
    }

    cout << count << endl;
    while (!pq.empty())
    {
        cout << pq.top() << " ";
        pq.pop();
    }
}