package Java_Intermediario.D_Herenças;

// Classe Pai (Superclasse)
public class Animal {
    
    String nome; // Atributo comum a todos os animais

    // Construtor da superclasse: recebe o nome e armazena no atributo
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método genérico que pode ser sobrescrito pelas subclasses
    public void emitirSom() {
        System.out.println(nome + " está fazendo um som genérico.");
    }
    
}