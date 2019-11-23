#include<bits/stdc++.h>

using namespace std;

int main(int argc, const char** argv) {

    int n; cin >> n;
    string s; cin >> s;
    int ones = 0;
    int zeros = 0;
    int count[5] = {};
    for(int i = 0; i < s.size(); i++){
        switch (s[i])
        {
        case 'e':
            count[0]++; break;
        case 'n':
            count[1]++; break;
        case 'o':
            count[2]++; break;
        case 'r':
            count[3]++; break;
        case 'z':
            count[4]++; break;
        }
    }
    while (count[0] >= 1 && count[1] >= 1 && count[2] >= 1){
        count[0]--;
        count[1]--;
        count[2]--;
        ones++;
    }
    while (count[4] >= 1 && count[0] >= 1 && count[3] >= 1 && count[2] >= 1){
        count[4]--;
        count[0]--;
        count[3]--;
        count[2]--;
        zeros++;
    }
    
    for(int i = 0; i < ones; i++){
        cout << "1" << " ";
    }
        
    for(int i = 0; i < zeros; i++){
        cout << "0" << " ";
    }
    
    return 0;
}