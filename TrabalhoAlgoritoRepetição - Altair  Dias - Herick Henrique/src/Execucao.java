import java.util.Arrays;
import java.util.Random;

public class Execucao {

    public static void main(String[] args) {


        int tamanho = 1500000;

        int[] vetorDesordenado = new int[tamanho];
        Random rand = new Random();

        for (int i = 0; i < vetorDesordenado.length; i++) {
            vetorDesordenado[i] = rand.nextInt(tamanho);
        }

        System.out.println("Tamanho do Vetor: " + tamanho);

        //Bolha

        int[] vetorBolha = Arrays.stream(vetorDesordenado).toArray();
        long tempoInicialBolha = System.currentTimeMillis();
        System.out.println();
        SimplesOrd.bubbleSort(vetorBolha);
        long tempoFinalBolha = System.currentTimeMillis();
        long tempoExecucaoBolha = tempoFinalBolha - tempoInicialBolha;
        System.out.printf("Tempo de execução do algoritmo Bolha: %.3f ms%n\n",tempoExecucaoBolha/1000d);

        //SelectionSort

        int[] vetorSelection = Arrays.stream(vetorDesordenado).toArray();
        long tempoInicialSelection = System.currentTimeMillis();
        System.out.println();
        SimplesOrd.selectionSort(vetorSelection);
        long tempoFinalSelection = System.currentTimeMillis();
        long tempoExecucaoSelection = tempoFinalSelection - tempoInicialSelection;
        System.out.printf("Tempo de execução do algoritmo Seletion: %.3f ms%n\n",tempoExecucaoSelection/1000d);

        //InsertionSort

        int[] vetorInsertion = Arrays.stream(vetorDesordenado).toArray();
        long tempoInicialInsertion = System.currentTimeMillis();
        System.out.println();
        SimplesOrd.insertionSort(vetorInsertion);
        long tempoFinalInsertion = System.currentTimeMillis();
        long tempoExecucaoInsertion = tempoFinalInsertion - tempoInicialInsertion;
        System.out.printf("Tempo de execução do algoritmo Inserção: %.3f ms%n\n",tempoExecucaoInsertion/1000d);


        //QuickSort
        
        int[] vetorQuickSort = Arrays.stream(vetorDesordenado).toArray();
        System.out.println();
        long tempoInicialQuickSort = System.currentTimeMillis();
        SofisticadosOrd.quicksort(vetorQuickSort);
        long tempoFinalQuickSort = System.currentTimeMillis();
        long tempoExecucaoQuickSort = tempoFinalQuickSort - tempoInicialQuickSort;
        System.out.printf("Tempo de execução do algoritmo quickSort: %.3f ms%n\n",tempoExecucaoQuickSort/1000d);

        //MergeSort
        
        int[] vetorMergeSort = Arrays.stream(vetorDesordenado).toArray();
        System.out.println();
        long tempoInicialMergeSort = System.currentTimeMillis();
        SofisticadosOrd.mergesort(vetorMergeSort);
        long tempoFinalMergeSort = System.currentTimeMillis();
        long tempoExecucaoMergeSort = tempoFinalMergeSort - tempoInicialMergeSort;
        System.out.printf("Tempo de execução do algoritmo MergeSort: %.3f ms%n\n",tempoExecucaoMergeSort/1000d);


    }
}
