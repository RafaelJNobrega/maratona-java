package maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
Confirmo que recebi o salário de <salário>, na data <data>.
*/

public class Aula03TIposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Rafael";
        String endereço = "rua itachi nº15";
        double salario = 8000;
        String data = "30/09/2026";
        String relatorio ="Eu "+ nome + ", morando no endereço: "+endereço+", Confirmo que recebi o salário de R$"+salario + " na data "+data;

        System.out.println("Eu " + nome + ", morando no endereço: " + endereço + ", Confirmo que recebi o salário de R$" + salario + " na data " + data);
        System.out.printf(relatorio);
    }
}

