#include<bits/stdc++.h>

using namespace std;

int main(int argc, const char** argv) {

    int n; cin >> n;
    int a[n];
    for(int i = 0; i < n; i++){
        cin >> a[i];
    }
    int m; cin >> m;
    int b[m];
    for(int i = 0; i < m; i++){
        cin >> b[i];
    }
    int maxA = a[0];
    for(int i = 1; i < n; i++){
        if(a[i] > maxA) maxA = a[i];
    }
    int maxB = b[0];
    for(int i = 1; i < m; i++){
        if(b[i] > maxB) maxB = b[i];
    }

    cout << maxA << " " << maxB << endl;   
    return 0;
}