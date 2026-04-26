#include <iostream>
using namespace std;

int main(){

string man ;
cout << "Enter your English text here: ";
getline(cin, man);
cout << man.length() <<endl;
int strLength = man.length();
cout << "the length of your text is: " << man.length() <<endl;
for (int i = 0; i<strLength;i++){
    if (man[i] == 'a' or man[i] == 'A'){cout << ".- ";}
    else if (man[i] == 'b' or man[i] == 'B'){cout << "-... ";}
    else if (man[i] == 'c' or man[i] == 'C'){cout << "-.-. ";}
    else if (man[i] == 'd' or man[i] == 'D'){cout << "-.. ";}
    else if (man[i] == 'e' or man[i] == 'E'){cout << ". ";}
    else if (man[i] == 'f' or man[i] == 'F'){cout << "..-. ";}
    else if (man[i] == 'g' or man[i] == 'G'){cout << "--. ";}
    else if (man[i] == 'h' or man[i] == 'H'){cout << ".... ";}
    else if (man[i] == 'i' or man[i] == 'I'){cout << ".. ";}
    else if (man[i] == 'j' or man[i] == 'J'){cout << ".--- ";}
    else if (man[i] == 'k' or man[i] == 'K'){cout << "-.- ";}
    else if (man[i] == 'l' or man[i] == 'L'){cout << ".-.. ";}
    else if (man[i] == 'm' or man[i] == 'M'){cout << "-- ";}
    else if (man[i] == 'n' or man[i] == 'N'){cout << "-. ";}
    else if (man[i] == 'o' or man[i] == 'O'){cout << "--- ";}
    else if (man[i] == 'p' or man[i] == 'P'){cout << ".--. ";}
    else if (man[i] == 'q' or man[i] == 'Q'){cout << "--.- ";}
    else if (man[i] == 'r' or man[i] == 'R'){cout << ".-. ";}
    else if (man[i] == 's' or man[i] == 'S'){cout << "... ";}
    else if (man[i] == 't' or man[i] == 'T'){cout << "- ";}
    else if (man[i] == 'u' or man[i] == 'U'){cout << "..- ";}
    else if (man[i] == 'v' or man[i] == 'V'){cout << "...- ";}
    else if (man[i] == 'w' or man[i] == 'W'){cout << ".-- ";}
    else if (man[i] == 'x' or man[i] == 'X'){cout << "-..- ";}
    else if (man[i] == 'y' or man[i] == 'Y'){cout << "-.-- ";}
    else if (man[i] == 'z' or man[i] == 'Z'){cout << "--.. ";}

    else if (man[i] == '0'){cout << "----- ";}
    else if (man[i] == '1'){cout << ".---- ";}
    else if (man[i] == '2'){cout << "..--- ";}
    else if (man[i] == '3'){cout << "...-- ";}
    else if (man[i] == '4'){cout << "....- ";}
    else if (man[i] == '5'){cout << "..... ";}
    else if (man[i] == '6'){cout << "-.... ";}
    else if (man[i] == '7'){cout << "--... ";}
    else if (man[i] == '8'){cout << "---.. ";}
    else if (man[i] == '9'){cout << "----. ";}
    else if (man[i] == ' '){cout << "/ ";}
}
cout << endl;

    return 0;
}