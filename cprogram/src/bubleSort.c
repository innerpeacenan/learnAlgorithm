#include <stdio.h>
void bubbleSort ( int [],int );
int main ( void ){
    int a[] = {45,38,26,90,87,3,2,1};
    int i,n=8;
    bubbleSort(a,n)    ;
    for (i = 0; i < n; i++){
        printf("%d ",a[i]);
    }
    printf("\n");
}

void bubbleSort ( int a[] ,int n){
    int i=0,j=0;
    //for each  time, bubble the max element to end,for i, the end is n-1-i
    for(i = 0; i < n; i++){
        // for j = 0 to n-1-j, 
        // if less(a[j+1],a[j]) do
        //    exch(a,i,j);
        for (j = 0; j < n-i-1;j++){
            if(a[j]> a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }
}
