package Java_Iniciante.H_Método_Estático;

public class Void {
    
    // Metódo Stático Criado Fora do Corpo Main
    public static void mostrarMensagem(String nome) {
        System.out.println("Bem Vindo, " + nome + "!");
    }


    public static void main(String[] args) {
        
        mostrarMensagem("Marcos"); // Chamando ele

    }
}

// Void significa "vazio", ele apenas executa ação, ele não guarda o valor.

// Métodos em Java não podem ser declarados dentro de outros métodos (por isso criamos fora do main).

// Um método estático pode ser chamado diretamente pela classe, sem criar um objeto (instanciar).
// Exemplo: Classe.metodoEstatico();