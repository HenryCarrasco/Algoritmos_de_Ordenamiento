/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamientos_análisis_algoritmos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kerlyn
 */
public class Ordenamientos_análisis_algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();

        Bubblesort b = new Bubblesort();
        Insertionsort in = new Insertionsort();
        Quicksort q = new Quicksort();
        Selectionsort s = new Selectionsort();
        Heapsort h = new Heapsort();
        Mergesort m = new Mergesort();
        Radixsort r = new Radixsort();
        int A[] = arreglo(1000000);
        //System.out.println("Bubblesort n: "+A.length);
        //b.bubbleSort(A);
        //System.out.println("Insertionsort n: "+A.length);
        //in.insertionSort(A);
        //System.out.println("Quicksort n: "+A.length);
        //q.quickSort(A, 0, A.length-1);
        //System.out.println("Selectionsort n: "+A.length);
        //s.selectionSort(A);
        //System.out.println("Heapsort n: "+A.length);
        //h.heapsort(A);
        //System.out.println("Mergesort n: "+A.length);
        //m.mergeSort(A);
        //System.out.println("Radixsort n: "+A.length);
        //r.radixSort(A);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        time_end = System.currentTimeMillis();
        System.out.println("La prueba ha tomado " + (time_end - time_start) + " milisegundos");
    }

    static int[] arreglo(int n) {
        Random r = new Random();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 1 + r.nextInt(n);
        }
        return a;
    }
}
