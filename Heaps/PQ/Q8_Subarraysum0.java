package Heaps.PQ;

import java.util.Scanner;

class Main{
    public static int maxzero(int []arr,int n){
        int l=0;    
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=arr[j];
                if(s==0){
                    l=Math.max(l,j-i+1);
                }
            }
        }
        return l;
    }
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(maxzero(arr, n));

    }
}
