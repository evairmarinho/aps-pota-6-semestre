/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Random;

/**
 *
 * @author Evair Marinho
 */
public class main {

    public static void main(String[] args) {
        // Criamos uma matriz de vetores para cada requisito do trabalho
        int vetoresTam5[][] = geraVetores(5, 50);
        int vetoresTam10[][] = geraVetores(10, 50);
        int vetoresTam100[][] = geraVetores(100, 50);
        int vetoresTam1000[][] = geraVetores(1000, 50);
        int vetoresTam10000[][] = geraVetores(10000, 50);
        // mostraVetor(bubbleSort(vetoresTam5[0].clone()));
        /// imprimeVetores(vetoresTam5);
        // mostraVetor(insertionSort(vetoresTam5[0].clone(), false));
        // imprimeVetores(vetoresTam5);
        imprimeVetores(vetoresTam5);
        imprimeVetores(ordenaVetores("insertionSort",vetoresTam5));
        
        // mostraVetor(comparacaoVetores("insertionSort",vetoresTam5));
        
    }
// Método que gera matriz de 'quantidadeVetores' linhas e 'tamVetor' colunas.

    public static int[][] geraVetores(int tamVetor, int quantidadeVetores) {
        Random random = new Random();
        int vetores[][] = new int[quantidadeVetores][tamVetor];
        for (int i = 0; i < quantidadeVetores; i++) {
            for (int j = 0; j < tamVetor; j++) {
                vetores[i][j] = random.nextInt(1000);
            }
        }
        return vetores;
    }
// Método que imprime matriz

    public static void imprimeVetores(int[][] vetores) {
        for (int i = 0; i < vetores.length; i++) {
            System.out.print("[");
            for (int j = 0; j < vetores[0].length; j++) {
                if (j != vetores[0].length - 1) {
                    System.out.print(vetores[i][j] + ",");
                } else {
                    System.out.print(vetores[i][j]);
                }
            }
            System.out.print("]");
            System.out.println("");
        }
    }

    
    
    
    // SUBSTITUIR IMPLEMENTAÇÃO - PORÉM MANTER IDEIA DE ARMAZENAMENTO DE COMPARAÇÕES
    public static int[] insertionSort(int vetor[], boolean retornaComparacoes, int posVetor) {
        int chave, aux;
        int[] comparacoes = new int[1];
        for (int i = 0; i < vetor.length; i++) {
            chave = vetor[i];
            aux = i - 1;
            // comparacoes += 1;
            while (aux >= 0 && vetor[aux] > chave) {
                vetor[aux + 1] = vetor[aux];
                aux -= 1;
                comparacoes[0]++;
            }
            vetor[aux + 1] = chave;
        }
        if (retornaComparacoes) {
            System.out.println("Comparacoes do vetor "+posVetor+" : " + comparacoes[0]);
            return comparacoes;
        }
        return vetor;
    }
// TODO - ALTERAR CODE - IMPLEMENTAR MÉTODO COM MESMO NOME DO MEU JEITO

    
    
    // SUBSTITUIR IMPLEMENTAÇÃO
    public static void mostraVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("");
    }
// SUBSTITUIR IMPLEMENTAÇÃO
    public static int[] bubbleSort(int vetor[]) {
        int comparacoes = 0;
        for (int i = 1; i < vetor.length; i++) {
            int tam = vetor.length;
            for (int j = 0; j < tam - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    comparacoes++;
                }
            }
        }
        System.out.println("comparacoes: " + comparacoes);
        return vetor;
    }
    
    public static int[][] ordenaVetores(String algOrdenacao, int[][] vetores){
        String algsOrdenacao[] = {"bubbleSort", "insertionSort", "heapSort", "selectionSort"};

        for (int i = 0; i < vetores.length; i++) {

            if (algOrdenacao.equals(algsOrdenacao[1])) {
                vetores[i] = insertionSort(vetores[i].clone(), false,i+1);
            }
        }
        return vetores;
    }
    
    
  // NÃO FUNCIONA AINDA - OBJETIVO ERA RETORNAR VETOR DE TAMANHO 50 COM A QUNATIDADE DE COMPARAÇÕES PARA A ORDENAÇÃO DE CADA VETOR
     public static int [] comparacaoVetores(String algOrdenacao, int[][] vetores) {
        String algsOrdenacao[] = {"bubbleSort", "insertionSort", "heapSort", "selectionSort"};
        int aux [] = new int [80];
        for (int i = 0; i < vetores.length; i++) {

            if (algOrdenacao.equals(algsOrdenacao[1])) {
                aux = insertionSort(vetores[i].clone(), true,i+1);
                
             }
        }
        return aux;
    }
}
