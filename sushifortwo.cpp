#include<bits/stdc++.h>

using namespace std;

int main(int argc, const char** argv) {

    int one = 0, two = 0;
    int flagone = 0, flagtwo = 0;
    int consecutive = 0;
    int temp;
    int n; cin >> n;
    for(int i = 0; i < n; i++){
        cin >> temp;
        if(temp == 1){
            if(flagone == 0){
                one = 0;
                flagone = 1;
            }
            one++;
            flagtwo = 0;
        } else {
            if(flagtwo == 0){
                two = 0;
                flagtwo = 1;
            }
            two++;
            flagone = 0;            
        }
        consecutive = max(consecutive, min(one, two));
    }

    cout << consecutive * 2 << endl;
    return 0;
}