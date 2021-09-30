package com.Lokesh.Sorting;
public class SortingNSquare {
        public static void main(String[] args) {
            int[] a = {66,-1,0,3,10};
//            {2,3,4,1,2}; // [-4,-1,0,3,10]
            int temp ; // used for swapping
            for(int i = 0; i<a.length; i ++){
                for(int j = 0; j<a.length; j++){
                    if(a[j] > a[i]){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            for(int i = 0; i<a.length; i++){
                System.out.print(a[i] + " ");
            }
//            for (int j  : a){
//                System.out.println(j);
//            }
            System.out.println(a.length);
        }
    }
