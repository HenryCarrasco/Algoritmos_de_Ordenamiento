/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamientos_análisis_algoritmos;

/**
 *
 * @author usuario
 */
public class Selectionsort {
     public void selectionSort(int[] arr) {
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }
}
