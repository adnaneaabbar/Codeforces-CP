#include<bits/stdc++.h>

using namespace std;

int main(int argc, const char** argv) {

    int q; cin >> q;
    while (q--)
    {
        int c, m, x; cin >> c >> m >> x;

        int diff = max(c, m) - min(c, m);
        if(c > m) c -= diff;
        else m -= diff;
        x += diff;

        int perfect = min(c, min(m, x));
        c -= perfect;
        m -= perfect;
        x -= perfect;

        perfect += (c + m)/3;
        cout << perfect << endl;
    }
        
    return 0;
}