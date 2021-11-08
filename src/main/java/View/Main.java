/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;

/**
 *
 * @author Evair Marinho
 */
public class Main {

    public static void main(String[] args) {
        // Criamos uma matriz de vetores para cada requisito do trabalho

        VetoresAleatorios vetoresAleatorios = new VetoresAleatorios();
        AlgsOrdenacao bubbleSort = new AlgsOrdenacao();
        AlgsOrdenacao insertionSort = new AlgsOrdenacao();

        int vetoresTam5[][] = vetoresAleatorios.geraVetores(5, 50);
        int vetoresTam10[][] = vetoresAleatorios.geraVetores(10, 50);
        int vetoresTam100[][] = vetoresAleatorios.geraVetores(100, 50);
        int vetoresTam1000[][] = vetoresAleatorios.geraVetores(1000, 50);
        int vetoresTam10000[][] = vetoresAleatorios.geraVetores(10000, 50);
        System.out.println("INÍCIO - Bubble Sort");
        
        System.out.println("TAMANHO 5");
        vetoresAleatorios.imprimeVetoresAleatorios(vetoresTam5);
        bubbleSort.comparacaoVetores("bubbleSort", vetoresTam5);
        vetoresAleatorios.imprimeVetoresAleatorios(bubbleSort.ordenaVetores("bubbleSort", vetoresTam5));
        System.out.println("Comparações por ordem de vetor: " + bubbleSort.getComparacoes());
        bubbleSort.LimpaComparacoes();
        
        System.out.println("TAMANHO 10");
        vetoresAleatorios.imprimeVetoresAleatorios(vetoresTam10);
        bubbleSort.comparacaoVetores("bubbleSort", vetoresTam10);
        vetoresAleatorios.imprimeVetoresAleatorios(bubbleSort.ordenaVetores("bubbleSort", vetoresTam10));
        System.out.println("Comparações por ordem de vetor: " + bubbleSort.getComparacoes());
        bubbleSort.LimpaComparacoes();
        
        System.out.println("TAMANHO 100");
        vetoresAleatorios.imprimeVetoresAleatorios(vetoresTam100);
        bubbleSort.comparacaoVetores("bubbleSort", vetoresTam100);
        vetoresAleatorios.imprimeVetoresAleatorios(bubbleSort.ordenaVetores("bubbleSort", vetoresTam100));
        System.out.println("Comparações por ordem de vetor: " + bubbleSort.getComparacoes());
        bubbleSort.LimpaComparacoes();
        
        System.out.println("TAMANHO 1000");
        vetoresAleatorios.imprimeVetoresAleatorios(vetoresTam1000);
        bubbleSort.comparacaoVetores("bubbleSort", vetoresTam1000);
        vetoresAleatorios.imprimeVetoresAleatorios(bubbleSort.ordenaVetores("bubbleSort", vetoresTam1000));
        System.out.println("Comparações por ordem de vetor: " + bubbleSort.getComparacoes());
        bubbleSort.LimpaComparacoes();
        
        System.out.println("TAMANHO 10000");
        vetoresAleatorios.imprimeVetoresAleatorios(vetoresTam10000);
        bubbleSort.comparacaoVetores("bubbleSort", vetoresTam10000);
        vetoresAleatorios.imprimeVetoresAleatorios(bubbleSort.ordenaVetores("bubbleSort", vetoresTam10000));
        System.out.println("Comparações por ordem de vetor: " + bubbleSort.getComparacoes());
        bubbleSort.LimpaComparacoes();
        System.out.println("FIM - Bubble Sort");
        
        System.out.println("Insertion Sort");

        // algsOrd.imprimeUmVetor(algsOrd.bubbleSort(vetoresTam5[0].clone()));
        /// imprimeVetoresAleatorios(vetoresTam5);
        // imprimeUmVetor(insertionSort(vetoresTam5[0].clone(), false));
        // vetoresAleatorios.imprimeVetoresAleatorios(vetoresTam5);
//imprimeVetoresAleatorios(ordenaVetores("insertionSort",vetoresTam5));
        // mostraVetor(comparacaoVetores("insertionSort",vetoresTam5));
    }
}
