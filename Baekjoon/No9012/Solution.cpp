#include <iostream>
#include <stack>
using namespace std;

int num;
string bracket;
bool check;

void test() {
    cin >> bracket;
    check = true;
    stack<string> stk;

    for(int i = 0; i < bracket.length(); i++) {
        if(!check) break;
        char temp = bracket[i];
        if(temp == '(') stk.push("(");
        else {
            if(stk.empty()) check = false;
            else stk.pop();
        }
    }

    if(check && stk.empty()) cout << "YES" << endl;
    else cout << "NO" << endl;
}

int main() {
    cin >> num;
    for(int i = 0; i < num; i++) {
        test();
    }
}