package Java_Intermediario.D_Herenças;

public class index {

    public static void main(String[] args) {
        
        // Cria um objeto da subclasse Gato
        Gato garfield = new Gato("Garfield");

        // Chama o método sobrescrito (específico do Gato)
        garfield.emitirSom();

        // Chama o método exclusivo da subclasse
        garfield.ronronar();

        // Chama o método da superclasse (Animal) usando 'super'
        garfield.EmitirSomAnimal();
    }

}