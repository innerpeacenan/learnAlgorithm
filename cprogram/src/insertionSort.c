#include <stdio.h>
void insertionSort (int [], int);
int main (){
    int a[] = {22,37,86,54,32,1,7,99,34} ;
    int n = 9;
    insertionSort(a,n);
    for (int i = 0; i < n ; i++){
        printf("%d  ",a[i]);
    }
    printf("\n");
    return 0;
}

void insertionSort (int a[], int n){
    int i,j,temp;
    for(i = 1; i < n; i++){
        // insert a[i] int a[i-1],a[i-2],...,
        for (j = i; j > 0; j--){//made a mistick here, so the array is exceed its bundary if j++, throw Segmentation fault (core dumped)
            if(a[j] < a[j-1]){
                temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
    }
}
