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
#include<iostream>
#include<cmath>
using namespace std;
int main(){
    float r;
    cin >> r;
    cout << 3.14*(r*r);
    return 0;
}