#include <iostream>
#include <string.h> // memset
#include <queue>
using namespace std;

int w, h, count; // w, h 주의
int dx[] = {1, 0, -1, 0, -1, -1, 1, 1};
int dy[] = {0, 1, 0, -1, -1, 1, -1, 1};
int map[51][51];
queue<pair<int, int>> q;

// 초기화
void init()
{
    memset(map, 0, sizeof(map));
    count = 0;
}

// 탐색
void bfs(int a, int b)
{
    count++;
    q.push(make_pair(b, a));
    map[b][a] = 0;

    pair<int, int> now;
    int temp_x, temp_y;

    while (!q.empty())
    {
        now = q.front();
        q.pop();

        for (int i = 0; i < 8; i++)
        {
            temp_y = now.first + dx[i];
            temp_x = now.second + dy[i];

            if (0 <= temp_x && temp_x < w && 0 <= temp_y && temp_y < h && map[temp_y][temp_x] == 1)
            {
                q.push(make_pair(temp_y, temp_x));
                map[temp_y][temp_x] = 0;
            }
        }
    }
}

void func()
{
    init();

    for (int i = 0; i < h; i++)
    {
        for (int j = 0; j < w; j++)
        {
            cin >> map[i][j];
        }
    }

    for (int a = 0; a < h; a++)
    {
        for (int b = 0; b < w; b++)
        {
            if (map[b][a] == 1)
                bfs(a, b);
        }
    }

    cout << count << endl;
}

int main()
{
    while (1)
    {
        cin >> w >> h;

        if (w == 0 && h == 0)
            break;
        else
            func();
    }
}