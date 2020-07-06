#include <iostream>
#include <string.h> // memset; memory set
#include <queue>
using namespace std;

int n, m, k, num;
int dx[] = {0, 1, 0, -1};
int dy[] = {1, 0, -1, 0};
int map[50][50];
queue<pair<int, int>> q;

// 초기화
void init()
{
    memset(map, 0, sizeof(map));
    num = 0;
}

// 탐색
void bfs(int a, int b)
{
    num++;
    q.push(make_pair(a, b));
    map[a][b] = 0;

    pair<int, int> now;
    int temp_x, temp_y;

    while (!q.empty())
    {
        now = q.front();
        q.pop();

        for (int i = 0; i < 4; i++)
        {
            temp_x = now.first + dx[i];
            temp_y = now.second + dy[i];

            if (0 <= temp_x && temp_x < n && 0 <= temp_y && temp_y < m && map[temp_x][temp_y] == 1)
            {
                q.push(make_pair(temp_x, temp_y));
                map[temp_x][temp_y] = 0; // 여기서 초기화를 안해주면 이미 방문한(queue에 들어간) 좌표가 계속 queue에 추가되어 메모리 초과가 발생
            }
        }
    }
}

void func()
{
    init();
    cin >> n >> m >> k;

    int x, y;
    for (int i = 0; i < k; i++)
    {
        cin >> x >> y;
        map[x][y] = 1;
    }

    for (int a = 0; a < n; a++)
    {
        for (int b = 0; b < m; b++)
        {
            if (map[a][b] == 1)
                bfs(a, b);
        }
    }

    cout << num << endl;
}

int main()
{
    int test;
    cin >> test;

    while (test > 0)
    {
        func();
        test--;
    }
}