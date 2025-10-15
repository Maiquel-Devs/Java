package Java_Iniciante.G_Arrays_Vetores_Matrizes;

public class X_Matrizes {
    
    public static void main(String[] args) {
        
        // Criando uma matriz 2x3 (2 linhas e 3 colunas)
        int[][] matriz = new int[2][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        for (int i = 0; i < 2; i++) {          // percorre as linhas
            for (int j = 0; j < 3; j++) {      // percorre as colunas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // quebra de linha a cada linha
        }

        System.out.println("-----");

        // Criando já preenchida
        int[][] Matriz = {
                        {10, 20, 30},
                        {40, 50, 60}
        };
        
        // Impressão
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
