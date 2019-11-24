#include<bits/stdc++.h>

using namespace std;

int main(int argc, const char** argv) {

    int n; cin >> n;
    int k; cin >> k;
    
    int time = 4*60 - k;
    int pb = 0;
    int t = 0;

    for(int i = 1; i <= n; i++){
        t += 5 * i;
        if(t <= time) pb++;
        else break;
    }

    cout << pb << endl;   
    return 0;
}