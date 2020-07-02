#include <iostream>
#include <string.h> // memset; memory set
#include <queue>
using namespace std;

int n, m, num;
int dx[] = {0, 1, 0, -1};
int dy[] = {1, 0, -1, 0};
int map[50][50];
queue<pair<int, int>> q;

// 초기화
void init() {
    memset(map, 0, sizeof(map));
}

// 탐색
void bfs() {

}

void func() {
    init();
    cin >> n >> m >> num;

}

int main() {
    int test;
    cin >> test;

    while (test > 0) {
        func();
        test--;
    }
}