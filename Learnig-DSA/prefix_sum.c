#include<stdio.h>
void prefixSumArray(int arri[],int n,int count,int i){
        while (i < n)
    {
        count += arri[i];
        arri[i] = count;
        i++;
    }
    printf("\nlength: %d\n",n);
    printf("[");
    for(int j=0; j<n;j++){
        if(j<n-1){
            printf(" %d,",arri[j]);
        }
        else{
            printf(" %d",arri[j]);
        }
    }
    printf("]");
    }
int main(){
    int arr1[] = {1,2,3,4,5};
    int n = sizeof(arr1)/sizeof(arr1[0]);
    int count = 0;
    int i = 0 ;
    prefixSumArray(arr1,n,count,i);
    return 0;
}
