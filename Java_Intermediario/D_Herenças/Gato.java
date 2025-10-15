package Java_Intermediario.D_Herenças;

public class Gato extends Animal {

    public Gato (String nome) {
        
        super(nome);  // Está mandando lá na classe pai
    }

    @Override   // Colocasse 
    public void emitirSom () {      // Reutilizando método da classe pai (Animal)

        System.out.println(nome + " está fazendo: miau! "); 
    }

    public void ronronar () {       // Métdodo excluisivo da subclasse (Gato) 

        System.out.println(nome + " está ronronando! ");
    }
    
}
