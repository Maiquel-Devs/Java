package Java_Iniciante.G_Arrays_Vetores_Matrizes;

public class Array {
    public static void main(String[] args) {
        
        // Declarando o array com 5 posições
        int[] numeros = new int[5];

        // Atribuindo valores manualmente
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Imprimindo os valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        System.out.println("-------------");

        // Criando e inicializando direto
        String[] frutas = {"Maçã", "Banana", "Morango"}; // Tamanho já e definido automaticamente

        // Imprimindo os valores com for-each

        for (String comida : frutas) {
            System.out.println(comida);
        }

    }
}
