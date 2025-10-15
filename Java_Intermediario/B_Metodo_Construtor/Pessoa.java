package Java_Intermediario.B_Metodo_Construtor;

public class Pessoa {

    String nome;    // Atributo de Classe
    int idade;      // Atributo de Classe


    // Método Construtor
    public Pessoa(String nome, int idade) {

        this.nome = nome;   // this.nome refere-se ao atributo da classe
        this.idade = idade;

    }



    // Método para mostrar informações 
    public void mostrarInfo() {
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }
    
}

// O método construtor serve justamente para definir valores iniciais aos atributos assim que você cria (instancia)  um objeto da classe. 

// Nesse caso Pessoa p = new Pessoa("Maiquel", 20); , o construtor já atribui "Maiquel" ao atributo nome e 20 ao atributo idade.

// Antes voçê tinha que fazer manaulmente esse processo, por exemplo  p.nome = "Maiquel"; p.idade = 20;
