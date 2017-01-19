#include <stdio.h>
void quickSort ( int[],int );
void sort (int [],int ,int );
int partition (int[],int ,int );
int main (){
    int a[] = {22,37,86,54,32,1,7,99,34} ;
    int n = 9;
    quickSort(a,n);
    for (int i = 0; i < n ; i++){
        printf("%d  ",a[i]);
    }
    printf("\n");
    return 0;
}

void quickSort(int a[], int n){
    sort(a,0,n-1);
}

void sort (int a[], int lo, int hi){
    if(hi <= lo) return ;
    int j = partition(a,lo,hi); // partition, this is key to quickSort
    sort(a,lo,j-1);// sort left part a[lo .. j-1]
    sort(a,j+1,hi);// sort right part
}

int partition (int a[],int lo, int hi){
    //partition into a[lo...i-1],a[i+1,...,hi]
    // left and right scan indices
    int i = lo,j = hi + 1,v = a[lo],temp;// why j start from hi + 1 ?
    //Scan right, scan left, check for scan complete, and exchange.
    while (1){
        while(a[++i] < v){// made a mistic here, mind not clear
            if(i == hi) break;
        }
        while(a[--j] > v){
            if(j==lo) break;
        }
        //i goes up and j goes down ,if i hits j finally
        if(i >= j) break;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    // put v=a[j] into position
    temp = a[j];
    a[j] = a[lo];
    a[lo] = temp;
    return j;// return where is the two subarrays bundary
}
