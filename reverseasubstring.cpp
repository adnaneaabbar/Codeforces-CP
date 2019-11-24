#include<bits/stdc++.h>

using namespace std;

int main(int argc, const char** argv) {
    int n;
    cin >> n;
    string s;
    cin >> s;
    for(int i = 1; i < s.size(); i++){
        if(s[i] < s[i-1]){
            cout << "YES" << endl;
            cout << i << " " << i + 1 << endl;
            return 0;
        }
    }

    cout << "NO" << endl;
    return 0;
}