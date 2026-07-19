//
// g++ -std=c++17  Node_creation.cpp -o Node_creation.exe && ./Node_creation.exe 
//
//
//  Created by Shubham Jana on 18/07/26.
//
#include <iostream>
using namespace std;
class Node {
public:
    int data;
    Node* next;
    Node(int new_data){
        this -> data = new_data;
        this -> next = nullptr;
    }
};
int main() {
    Node* head = new Node(20);
    head -> next = new Node(30);
    head -> next -> next = new Node(40);
    head -> next -> next -> next = new Node(50);
    
    Node* temp = head;
    
    while(temp != nullptr){
        cout << temp -> data << " ";
        temp = temp -> next;
    }
    
    return 0;
}
