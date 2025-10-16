package Java_Intermediario.D_Herenças;

// Subclasse Gato herda todos os atributos e métodos da classe Animal
public class Gato extends Animal {

    // Construtor da subclasse
    public Gato(String nome) {
        
        super(nome);    // Chama o construtor da classe pai para inicializar o atributo 'nome'
    }

    @Override   // Sobrescreve o método emitirSom() da classe Animal
    public void emitirSom() {
        System.out.println(nome + " está fazendo: miau!");
    }

    // Método exclusivo da subclasse Gato
    public void ronronar() {
        System.out.println(nome + " está ronronando!");
    }

    // Método adicional que demonstra o uso de 'super' para acessar o método da superclasse
    public void EmitirSomAnimal() {
        super.emitirSom(); // Chama o método original da classe Animal
    }

}