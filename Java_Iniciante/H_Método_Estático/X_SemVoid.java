package Java_Iniciante.H_Método_Estático;

public class X_SemVoid {

    public static int somar(int a, int b){
        return a + b; // Obrigado a colocar return nesse caso.
    }

    public static void main(String[] args) {
     
        int resultado = somar(2, 2); // Chamando ele e guardando dentro de uma variável.
        System.out.println(resultado);  // Imprimindo ele.

    }
}

// O método stático sem o void nos colocamos a tipagem no lugar no void.

// Obrigatoriamente colocamos o return.

// O resultado retornado pelo método pode ser guardado em uma variável ou usado diretamente em uma expressão.