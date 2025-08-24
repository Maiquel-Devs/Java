package Java_Iniciante.B_Variáveis;

public class index {
    
    public static void main(String[] args) {
        
        String nome = "João"; // Texto
        int idade = 20; // Números Inteiros
        float peso = 1.73f; // Números decimal (com vírgula), obrigado a colocar o f no final
        boolean sexo = true; // Valores booleano (True and False)


        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(sexo);

        System.out.println(nome + " tem " + idade + " anos, pesa " + peso + "."); // Concatenação

        System.out.println("---------------------------");

        char letra = 'M';   // Único Caractere  
        byte numeroPequeno = 30;    // Pequeno Inteiro (-128 até 127)   
        short numeroMedio = 32000;  // Inteiro médio
        long numeroGrande = 8000000000L;  // Inteiro longo (obrgado a colocar o L no final)
        double salario = 2500.99;


        System.out.println(letra);
        System.out.println(numeroPequeno);
        System.out.println(numeroMedio);
        System.out.println(numeroGrande);
        System.out.println(salario);
    }
}


// float: menor, ocupa menos memória, mas perde precisão em números muito longos. 32 bits ~7 casas decimais
// double: maior, mais preciso, é o tipo padrão para decimais em Java. 64 bits ~15 casas decimais