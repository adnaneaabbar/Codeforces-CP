#include<bits/stdc++.h>

using namespace std;

int main(int argc, const char** argv) {

    int q;
    cin >> q;
    while(q--){
        int n;
        cin >> n;
        int a[n+1] = {};
        int temp;
        int answer = INT_MAX;
        bool flag = false;
        for(int i = 1; i <= n; i++){
            cin >> temp;       
            if(a[temp] != 0){
                answer = min(answer, abs(i - a[temp]));
                flag = true;
            }
            a[temp] = i;
        }
        if(flag) cout << answer + 1 << endl;
        else cout << "-1" << endl;
    }

    return 0;
}