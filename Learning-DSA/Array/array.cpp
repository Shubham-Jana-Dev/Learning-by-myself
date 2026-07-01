// 1D array
#include <iostream>
using namespace std;
int main(){
    int b = 33;
    string a[3] = {"Shubham","Bikash","Rahul"};
    cout << a << endl; // it will be only returning the location of the array a on the whole array (where the array is storing in the memmory location)
    cout << a[0] << endl; // by the help of [] we can explicitly tell the compiler which element we want to print.
    printf("%d",b);
    return 0;
}
/* 
#include <iostream>
using namespace std;

int main(){

    int a[5] ={1,2,3,45,3};
    cout << a[2] << endl;
    return 0;
}
*/
/*
#include <iostream>
using namespace std;
int main(){
    int B[4] ={2,23,88,23};
    cout << "{" ;
    for (int i = 0; i<4; i++){
        if (i <= 2){
        cout << B[i] << ",";
        }
        else{
            cout << B[i] << "}" << endl;
        }
    }
    return 0;
}
*/