#include<bits/stdc++.h>

using namespace std;

int main(int argc, const char** argv) {

    int n; cin >> n;
    int a[n];
    int circle[n];
    int tall = n - 1;
    int shortt = 0; //had to add the extra 't' :'(

    for(int i = 0; i < n; i++){
        cin >> a[i];
    }
    sort(a, a+n);
    int i = 0;
    while(shortt <= tall){
        if(i%2 == 0){
            circle[shortt] = a[i];
            shortt++;
        } else {
            circle[tall] = a[i];
            tall--;
        }
        i++;
    }

    for(int i = 0; i < n; i++){
        cout << circle[i] << " ";
    }
    return 0;
}