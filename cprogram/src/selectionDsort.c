
#include <stdio.h>
void selectionSort (int[], int );
int main (){
    int n = 7 , i;
    int a[] = {57,34,26,77,89,22,45};
    selectionSort(a,n);
    for(i = 0; i < n ;i++) {
        printf("%d  ",a[i]);
    }
    printf("\n");
    return 0;
}


void selectionSort (int a[], int n){
    int i,j,max;
    for(i = 0; i < n-1; i++) {
        max = i;
        for (j = i+1; j <= n-1; j++){
            if(a[max] < a[j]) {
                //remark the index the possible max element
                max = j;
            }
        }
        //for each inner loop compare, find the max element and exchange it with a[i]
        int temp = a[max]; // exchange a[max] and a[i]
        a[max] = a[i];
        a[i] = temp;
    }
}
