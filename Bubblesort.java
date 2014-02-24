/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamientos_análisis_algoritmos;

/**
 *
 * @author usuario
 */
public class Bubblesort {
     public void bubbleSort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
}
