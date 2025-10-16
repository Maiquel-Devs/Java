package Java_Intermediario.E_Polimorfismo;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está fazendo: au au!");
    }

}