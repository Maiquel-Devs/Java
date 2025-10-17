package Java_Intermediario.E_Polimorfismo;

public class index {
    
    public static void main(String[] args) {
        
        Animal a1 = new Gato();

        a1.emitirSom();     // ✅ "Miau"
  //    a1.arranhar();      // ❌ Erro! Animal não tem método arranhar()


        Gato g = new Gato();

        g.emitirSom();      // ✅ "Miau"
        g.arranhar();       // ✅ "O gato está arranhando"
    }

}



// a1 só pode usar métdos que foram herdados da classe Pai.

// g pode utilizar tanto os métodos herdados da classe pai quanto os métodos exclusivos da subclasse.