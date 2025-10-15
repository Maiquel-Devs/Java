package Java_Intermediario.D_Herenças;

public class Animal {
    
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {

        System.out.println(nome + " está fazendo um som genérico. ");
    }
    
}
