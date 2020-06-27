#include <iostream>
#include <cmath>
using namespace std;

void hanoi(int num, int s, int m, int e) {
    if(num == 1) cout << s << " " << e << endl;
    else {
        hanoi(num - 1, s, e, m);
        cout << s << " " << e << endl;
        hanoi(num - 1, m, s, e);
    }
}

int main() {
    int num;
    cin >> num;

    cout << pow(2, num) - 1 << endl;
    if(num < 21) hanoi(num, 1, 2, 3);
}