#include<bits/stdc++.h>

using namespace std;

int main(int argc, const char** argv) {

    int n; cin >> n;
    int m; cin >> m;
    long long unsigned a[n];
    long long unsigned presum[n];
    cin >> a[0];
    presum[0] = a[0];
    for(int i = 1; i < n; i++){
        cin >> a[i];
        presum[i] = presum[i-1] + a[i];
    }

    long long unsigned letter;
    long long unsigned room;
    for(int i = 0; i < m; i++){
        cin >> letter;
        long long unsigned position = lower_bound(presum, presum+n, letter) - presum;
        if(position == 0) room = letter;
        else room = letter - presum[position - 1];
        cout << position + 1 << " " << room << endl;
    }
    return 0;
}