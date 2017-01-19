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
    int i,j,min;
    for(i = 0; i < n-1; i++) {
        min = i;
        for (j = i+1; j < n; j++){
            printf("a[min] %d and a[j] %d \n",a[min],a[j]);
            if(a[min] > a[j]) {
                min = j;
            }
            printf("min is %d and  j is %d \n",min,j);
        }
        int temp = a[min]; // exchange a[min] and a[i],not exchange with a[j],I should be always be clear ablout that
        a[min] = a[i];
        a[i] = temp;
        printf("i is %d and a[i] is %d \n",i,a[i]);
    }
}
