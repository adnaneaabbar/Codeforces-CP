#include<bits/stdc++.h>

using namespace std;

int main(int argc, const char** argv) {

    int n; cin >> n;
    int a[n];
    cin >> a[0];
    for(int i = 1; i < n; i++){
        cin >> a[i];
        a[i] += a[i-1];
    }
    
    int m; cin >> m;
    int worm;
    for(int i = 0; i < m; i++){
        cin >> worm;
        /*
        for(int j = 1; j <= n; j++){
            if(worm <= a[j-1]){
                cout << j << endl;
                break;
            }
        }
        */
        cout << lower_bound(a, a+n, worm) - a + 1 << endl; //STL
    }

    return 0;
}
