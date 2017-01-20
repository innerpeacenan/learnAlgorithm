
#include <stdio.h>
void mergeSort ( int [],int );
void sort ( int [], int, int);
void merge( int a[], int, int, int);
int main ( void ){
    int a[] = {45,38,26,90,87,3,2,1};
    int i,j,n=8;
    mergeSort(a,n);
    for (i = 0; i < n; i++){
        printf("%d ",a[i]);
    }
    printf("\n");
}

int aux[8];
void mergeSort ( int a[] ,int n){
    sort(a,0,n-1);
}

void sort ( int a[], int lo,int hi){
    if(lo >= hi) return ;
    int mid = lo + ( hi - lo )/2; // make a mistick to caculate mid
    sort(a,lo,mid);//sort left part
    sort(a,mid+1,hi);//sort right part
    merge(a,lo,mid,hi);// merge two sorted subarray
}
/**
 * merge sorted subarray a[lo,...,mid] with a[mid+1,hi]
 */
void merge( int a[], int lo, int mid, int hi){
    int i = lo,j = mid +1, k;// made a mistick here
    for (k = lo; k <= hi; k++){
       aux[k] = a[k];
  }
    for(k = lo; k <= hi; k++){
        if(i > mid){
            a[k] = aux[j++];
        }else if(j > hi ){
            a[k] = aux[i++];
        }else if(aux[i] < aux[j]){
            a[k] = aux[i++] ;
        }else{
            a[k] = aux[j++];
        }
    }
}
