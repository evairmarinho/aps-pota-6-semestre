/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Evair Marinho
 */
public class AlgsOrdenacao {

    private String[] algsOrdenacao = {"bubbleSort", "insertionSort", "selectionSort", "mergeSort", "quickSort"};
    private ArrayList<Integer> comparacoes = new ArrayList<>();

    public AlgsOrdenacao() {
    }

    public ArrayList<Integer> getComparacoes() {
        return comparacoes;
    }
    public void LimpaComparacoes() {
    this.comparacoes.removeAll(comparacoes);
    }

    public void imprimeUmVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("");
    }

    // SUBSTITUIR IMPLEMENTAÇÃO - PORÉM MANTER IDEIA DE ARMAZENAMENTO DE COMPARAÇÕES
    private int[] insertionSort(int vetor[], boolean retornaComparacoes, int posVetor) {
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
            System.out.println("Comparacoes do vetor " + posVetor + " : " + comparacoes[0]);
            return comparacoes;
        }
        return vetor;
    }

// SUBSTITUIR IMPLEMENTAÇÃO
    private int[] bubbleSort(int vetor[], boolean retornaComparacoes, int posVetor) {
        int[] comparacoes = new int[1];
        for (int i = 1; i < vetor.length; i++) {
            int tam = vetor.length;
            for (int j = 0; j < tam - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    comparacoes[0]++;
                }
            }
        }
        if (retornaComparacoes) {
            System.out.println("Comparacoes do vetor " + posVetor + " : " + comparacoes[0]);
            return comparacoes;
        }
        return vetor;
    }

    public int[][] ordenaVetores(String algOrdenacao, int[][] vetores) {
        
        for (int i = 0; i < vetores.length; i++) {

            if (algOrdenacao.equals(this.algsOrdenacao[1])) {
                vetores[i] = this.insertionSort(vetores[i].clone(), false, i + 1);
            }

            if (algOrdenacao.equals(this.algsOrdenacao[0])) {
                vetores[i] = this.bubbleSort(vetores[i].clone(), false, i + 1);
            }
        }
        return vetores;
    }

    
     public double calculaMedia (ArrayList<Integer> array) {
        double media = 0;
        int tam = array.size();
        for (int i = 0; i < tam; i ++) {
           media += array.get(i);
           System.out.print(array.get(i)+", ");        
        }
        System.out.println("");
        return media/tam;
    }
    
   // Retorna ArrayList com quantidade de comparações realizadas por Vetor
    public ArrayList<Integer> comparacaoVetores(String algOrdenacao, int[][] vetores) {
     
        for (int i = 0; i < vetores.length; i++) {
            
            if (algOrdenacao.equals(this.algsOrdenacao[1])) {
                comparacoes.add(this.insertionSort(vetores[i].clone(), true, i + 1)[0]);
            }
            
            if (algOrdenacao.equals(this.algsOrdenacao[0])) {
                comparacoes.add(this.bubbleSort(vetores[i].clone(), true, i + 1)[0]);
            }
        }
        
        return this.comparacoes;
    }
}