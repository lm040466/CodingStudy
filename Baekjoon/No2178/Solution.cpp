#include <iostream>
#include <queue>

using namespace std;

int n, m;
int dx[] = {0, 1, 0, -1};
int dy[] = {1, 0, -1, 0};
// C++에서는 함수의 매개변수로 배열을 사용하는 것에 많은 주의를 요한다.
// 원래는 java 풀이법과 동일하게 하고싶었지만 불가능해서, 매개변수로 2차원배열을 쓰려했지만 포기
// 문제에서 제시되는 최대값으로 선언하여 사용했다.
// 참고: https://blog.naver.com/tipsware/220993190781
int maze[101][101];

void bfs()
{
    // queue와 함께 pair를 사용할 때는 #include <utility> 생략가능
    queue<pair<int, int>> q;
    q.push(make_pair(0, 0));

    pair<int, int> now; // 현재좌표
    int temp_x, temp_y; // 이동좌표

    while (!q.empty())
    {
        now = q.front();
        q.pop();

        for (int i = 0; i < 4; i++)
        {
            temp_x = now.first + dx[i];
            temp_y = now.second + dy[i];

            if (0 <= temp_x && temp_x < n && 0 <= temp_y && temp_y < m && maze[temp_x][temp_y] == 1)
            {
                q.push(make_pair(temp_x, temp_y));
                maze[temp_x][temp_y] += maze[now.first][now.second]; // 이동좌표에 지금까지 이동거리 + 1
            }
        }
    }
}

int main()
{
    cin >> n >> m;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            scanf("%1d", &maze[i][j]); // 한글자씩 입력
        }
    }

    bfs();
    cout << maze[n - 1][m - 1];
}