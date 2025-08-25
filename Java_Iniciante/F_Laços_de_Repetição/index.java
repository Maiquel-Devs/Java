package Java_Iniciante.F_Laços_de_Repetição;

public class index {

    public static void main(String[] args) {
        
        int A = 0;

        while (A < 5) {         // Executa o bloco enquanto a condição for verdadeira.
            System.out.println("A = " + A);
            A ++;
        }

        System.out.println("-----");

        int B = 0;

        do {                    // Executa pelo menos uma vez, e depois verifica a condição.
            System.out.println("B = " + B);
            B ++;
        } while (B < 5);

        System.out.println("-----");

        for (int C = 0; C < 5; C++) {       // Laço com inicialização, condição e incremento
            System.out.println("C = " + C);
        }

        System.out.println("-----");

        String[] frutas = {"Maçã", "Banana", "Laranja"};

        for (String fruta : frutas) {       // Muito usado para arrays ou listas:
            System.out.println(fruta);
        }

    }
    
}

// break → interrompe o laço imediatamente.
// continue → pula a iteração atual e vai para a próxima.