
#include <stdio.h>
void shellSort (int [], int);
int main (){
    int a[] = {22,37,86,54,32,1,7,99,34} ;
    int n = 9;
    shellSort(a,n);
    for (int i = 0; i < n ; i++){
        printf("%d  ",a[i]);
    }
    printf("\n");
    return 0;
}

void shellSort(int a[], int n){
    //construct a serials 3^k+1
    int h = 1,i,j,temp;
    while (h < n/3) h = 3*h+1;
    //do insertionSort for every step length h
    while (h>=1){
        //do insertionSort for each subarray
        //对于每一个步长h，执行插入排序
        for(i = h; i < n; i = i + h) {
            //inser a[i] into a[i-h],a[i-2h],...,a[h]
            for (j = i;j >= h; j = j-h){ // j>=h so j-h can hit index 0 but can not
                if(a[j] > a[j-h]) {
                    temp  = a[j];
                    a[j] = a[j-h];
                    a[j-h] = temp;
                }
            }
        }
        h = h/3;
    }
}
