package maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;

        System.out.println(" Valor " + resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezDiferenteQueVinte = 10 != 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezDiferenteQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezMaiorQueVinte);

        // && (and) || (or) !
        int idade = 21;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario < 4612;
        System.out.println("Está dentro da lei? " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Está dentro da lei? " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystatioCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("Posso comprar um PlayStation 5 ? " + isPlaystatioCincoCompravel);

    }
}
