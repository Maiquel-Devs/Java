package Java_Intermediario.E_Polimorfismo;

public class Animal {
    
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(nome + " está fazendo um som genérico.");
    }

}
