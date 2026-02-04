/* 
// basic syntax exploring: 
#include<iostream>
using namespace std;
int main(){
    int x,y;
cout << "Hellow" << endl;
cin >> x>>y;
cout << x << " " << y << endl;
    return 0;
}
*/
/*
#include<iostream>
#include<string>
using namespace std;
int main(){
string name,sername;
cin >> name >> sername;
cout << "Hellow" << " " << name << " " << sername;  

    return 0;
}
*/
/*
#include<iostream>
#include<string>
using namespace std;
int main(){
    string fullName ;
    cout << "Enter your full name: ";
    getline(cin,fullName);
    cout << "Hellow " << fullName << "!";
    return 0;
}
*/
// Arithmatic oparetion:-
/*
#include<iostream>
#include<cmath>
using namespace std;
int main(){
    float r;
    cin >> r;
    cout << 3.14*(r*r);
    return 0;
}
*/
// understanding function and recursion. 
#include<iostream>
#include<cmath>
using namespace std;
int fact(int num){    // function 1
    if (num == 0 or num == 1){
        return 1;
    }
    else{
        int fac = num*fact(num-1);
        return fac;
    }
}
/*
Loops in C++
There are 3 types of loops
1. For loops
2. while loops
3. Do-while loops
*/
int ForLoop(int num){    // function 2
    if (num == 0 or num == 1){
        return 1;
    }
    int fact = 1;
    for(int i = 1; i <= num; i++){
        fact = fact*i; 
    }
    return fact;
}
int findMax(int num1,int num2,int num3){
    if (num1>num2 && num1 > num3){
        return num1;
    }
    else if (num2>num3){
        return num2;
    }
    else {
        return num3;
    }
}
void dynamicPartten(int row_num){
    for(int i = 0; i <= row_num; i++){
        for (int j = 0; j<=row_num;j++){
            cout << "* ";
        }
    cout << " "<<endl;
    }
}
void dynamicRightangleTriangle(int rows_num){
    for(int i = 0; i <= rows_num; i++){
        for(int j = 0; j <= rows_num; j++){
            if(i+j >= rows_num){
                cout << "* ";
            }
        }
    cout << " "<<endl;
    }
}
void arrayPrint(int arr[],int length){
    for(int i = 0; i < length; i++){
        cout << arr[i] <<" ";
    }
}
int main(){
    // int result = fact(5);  // function 1
    // cout << result;
    // int num;
    // cout << "Enter the number: ";
    // cin >> num;
    // int result = ForLoop(num);    // function 2
    // cout << result<< endl;
    float num1 = 45.73; // by default c++ treats this as a double
    float num2 = 45.73f; // we use f for tell the compiler that it's a floating point value
    long double num3 = 45.73l; // we use l for tell the compiler that it's a long double.
    // cout << sizeof(num1) << endl;
    // cout << sizeof(num2) << endl;
    // cout << sizeof(num3) << endl;
    //*************Reference Variables*************
    float div = 234.89;
    float & mil = div;
    //cout <<"div = " << div << endl;
    //cout <<"mil = " << mil << endl;
    //*************Typecasting*************
    // cout << "The value of div is "<<div<<endl;
    // cout << "The integer value of div is " << (int)div << endl;
    int maximunNumber = findMax(23,44,21);
    // cout << maximunNumber << endl;
    //*************Hard coded partten printing*************
    // cout <<"*\n* *\n* * *\n* * * *\n* * * * *"<< endl;
    // dynamicPartten(5);
    // dynamicRightangleTriangle(5);
    int array[] = {12,23,34,45,66,78,79,89,90,100};
    for(int x:array){
        cout << x<< " ";
    }
    // cout << array[2] << endl;
    int length = sizeof(array)/sizeof(array[0]);
    cout <<"\n\n" << length << "\n\n";
//arrayPrint(array,length);
    return 0;
}