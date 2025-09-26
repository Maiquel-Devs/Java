package Java_Intermediario.C_Getters_e_Setters;

public class index {
    
    public static void main(String[] args) {
        
        Retangulo r = new Retangulo(15, 2);

        // Pegando o Valor da Largura e Altura.
        System.out.println(r.getLargura());
        System.out.println(r.getAltura());

        // Modificando o Valor da Largura e Altura.
        r.setLargura(10);
        r.setAltura(10);

        System.out.println("----");

        // Pegando Denovo o Valor da Largura e Altura (Atualizado).
        System.out.println(r.getLargura());
        System.out.println(r.getAltura());

        System.out.println("----");

        // Analizando se é Quadrado.
        System.out.println(r.isQuadrado());

    }
}
