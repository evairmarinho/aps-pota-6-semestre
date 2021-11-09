package Model;

import java.util.Random;

public class VetoresAleatorios {

    public VetoresAleatorios() {

    }
    
    // Método que gera matriz de 'quantidadeVetores' linhas e 'tamVetor' colunas.
    public int[][] geraVetores(int tamVetor, int quantidadeVetores) {
        Random random = new Random(10);
        int vetores[][] = new int[quantidadeVetores][tamVetor];
        for (int i = 0; i < quantidadeVetores; i++) {
            for (int j = 0; j < tamVetor; j++) {
                vetores[i][j] = random.nextInt(1000);
            }
        }
        return vetores;
    }
    
    
   
// Método que imprime matriz
    public void imprimeVetoresAleatorios(int[][] vetores) {
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
}
