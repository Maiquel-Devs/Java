package Java_Intermediario.E_Polimorfismo;

public class Gato extends Animal {
    

    @Override
    public void emitirSom() {   // Método herdado da Classe Pai "Subscrito"
        System.out.println("Miau");
    }

    public void arranhar() {    // Método exclusivo da Subclasse "Gato"
        System.out.println("O gato está arranhando");
    }

}