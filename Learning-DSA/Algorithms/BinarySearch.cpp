#include<iostream>
using namespace std;
void BinaryS(int arr[],int low,int high,int target){

    while (low<=high)
    {
        int mid = low+(high-low)/2;
        if (arr[mid] == target)
        {
            cout << target << "found at index: "<< mid <<"."<< endl;
            break;
        }
        else if (target<arr[mid]){
             high = mid -1;
        }
        else{
             low = mid + 1;
        }
        
    }
    if(low>high){
    cout <<target<<" Not found :("<<endl;
    }
}
int findTheSecondLastElement(int Mlist[],int length1){
    return Mlist[length1-1];
}
void BinarySearch_througnh_function(int arr[],int low,int high,int target){
    if(low<=high){
        int mid = low + (high-low)/2;
        if(arr[mid] == target){
            cout << target << " Found at index "<<mid<< " :)"<<endl;
        }
        else if(target<arr[mid]){
            BinarySearch_througnh_function(arr,low,mid-1,target);
        }
        else{
            BinarySearch_througnh_function(arr,mid+1,high,target);
        }
    }
    else{
        cout<<target<<" not found :("<<endl;
    }
}
int main(){
    int arr[] = {1,2,3,4,5,6,7,8,77,86,90,98};
    int length = sizeof(arr)/sizeof(arr[0]);
    int high = length-1;
    int low = 0;
    int target = 98;
    // BinaryS(arr,low,high,target);
    int len = (sizeof(arr)/sizeof(arr[0])) - 1;
    int secondlast = findTheSecondLastElement(arr,len);
    // cout << secondlast << endl;
    BinarySearch_througnh_function(arr,low,high,target);

    return 0;
}
