package Java_Intermediario.C_Getters_e_Setters;

public class Retangulo {
    
    // Atributos privados (não acessíveis diretamente de fora da classe)
    private double largura;
    private double altura;


    // Construtor
    public Retangulo(double largura, double altura) {

        this.largura = largura;  // Trocar pela função set
        this.altura = altura;

    }


    // Getter da Largura
    public double getLargura() {

        return largura;    
    }

    // Setter da Largura
    public void setLargura(double largura) {

        if (largura > 0) {
            this.largura = largura;
        }

    }

}

// Colocar os comentarios e organização certinho.