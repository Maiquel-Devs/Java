package Java_Intermediario.C_Getters_e_Setters;

public class Retangulo {
    
    // Atributos privados (não acessíveis diretamente de fora da classe)
    private double largura;
    private double altura;


    // Construtor
    public Retangulo(double largura, double altura) {

        setLargura(largura);  // Usando a função Setter no construtor.
        setAltura(altura);

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


    // Getter da Altura 
    public double getAltura() {

        return altura;
    }


    // Setter da Altura
    public void setAltura(double altura) {
        
        if (altura > 0) {
            this.altura = altura;
        }
    }


    // Método is -> retorna true/false
    public boolean isQuadrado() {

        return largura == altura;
    }

}


// Getter → método usado para pegar (obter) o valor de um atributo privado.
// Setter → método usado para definir (alterar) o valor de um atributo privado.

// is     → método usado para verificar (retornar) o valor de um atributo boolean.


// Usando a Função Setter no Construtor Eu Posso Fazer uma Verificação (isso é bom).
// Nesse caso a verificação é ver se Altura ou Largura é maior que 0 "não é negativo". 