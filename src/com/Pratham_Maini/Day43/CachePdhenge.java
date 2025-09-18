package com.Pratham_Maini.Day43;

import java.util.*;
public class CachePdhenge {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of cache: ");
        int n = sc.nextInt();
        String[] cache = new String[n];
        System.out.println("Enter the element: ");
        for(int i=0;i<n;i++){
            cache[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.print(cache[i]+ " ");
        }
    }
}
