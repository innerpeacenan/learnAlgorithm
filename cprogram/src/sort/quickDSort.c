
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
/**
 *@param int []  the array to be sorted
 *@param n the array length
 */
void quickSort(int a[], int n){
    sort(a,0,n-1);
}

/**
 *@param int [] the array to be sorted
 *@param int the lowest index of an array to be  partitioned
 *
 */
void sort (int a[], int lo, int hi){
    // the high index go down and finally hit low index, the array with just one element was naturally sorted
    if(hi <= lo) return ;
    //get to know how and by where to  partition the array into two sbuarrays
    int j = partition(a,lo,hi); // partition, this is key part to quickSort
    sort(a,lo,j-1);// sort left part a[lo .. j-1]
    sort(a,j+1,hi);// sort right part
}

/**
 *@param int [] the array to be partitioned into two subarrays
 *@param int the lowest index of the array
 *@param int the highest index of the array
 */
int partition (int a[],int lo, int hi){
    //partition into a[lo...i-1],a[i+1,...,hi]
    // left and right scan indices,assume the index of the max element is hi
    int i =lo,j = hi - 1,v = a[hi],temp;
    //Scan right, scan left, check for scan complete, and exchange.
    while (1){
        while( a[i] > v){// made a mistic here, mind not clear
            if(i==hi) break;
            i = i + 1;
        }
        while(a[j] < v){
            if(j==lo)  break;
            j = j - 1;
      }
        //在i和j碰头之前，如发现左右两边均需要替换的元素，则直接替换这两个元素
        //如果i>=j，则跳出循环，则将分割元素与第一个违反期望顺序的元素交换
        //goes up and j goes down ,if i hits j finally
        if(i >= j) break;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    // put v=a[i] into position
    temp = a[i];
    a[i] = a[hi];
    a[hi] = temp;
    return i;// return where is the two subarrays bundary
}
