#include <iostream>
#include <string>
using namespace std;

int num, ans;
string word, comp;

void check() {
    cin >> word;
    comp = "";

    for(int i = 0; i < word.length(); i++) {
        comp += word[i];
        if(comp.length() - 1 == comp.find(word[i])) continue;
        if(comp[i - 1] == comp[i]) continue;
        ans--;
        break;
    }

}

int main() {
    cin >> num;
    ans = num;

    for(int i = 0; i < num; i++) {
        check();
    }

    cout << ans;
}