package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Miguel";
        String endereco = "Rua sem nome, 123";
        double salario = 3000.00;
        String dataRecebimentoSalario = "01/03/2026";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+ ", confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario+".";
        System.out.println(relatorio);
    }
}
