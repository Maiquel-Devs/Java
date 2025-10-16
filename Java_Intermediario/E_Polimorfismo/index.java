package Java_Intermediario.E_Polimorfismo;

public class index {
    
    public static void main(String[] args) {

        Animal a1 = new Gato("Garfield");
        Animal a2 = new Cachorro("Rex");

        a1.emitirSom();  // Garfield está fazendo: miau!
        a2.emitirSom();  // Rex está fazendo: au au!

        // Apesar de ambos serem 'Animal',
        // cada um executa o método correspondente à sua classe real.
    }
    
}
