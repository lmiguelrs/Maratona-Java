package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //  €0 – €34,712: 9.70%
        //  €34,713 – €68,507: 37.35%
        //  €68,508 and up: 49.50%
        double salario = 25000;
        double imposto;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;

        if (salario <= 34712) {
            imposto = salario * primeiraFaixa;
        } else if (salario >= 34713 && salario <= 68507) {
            imposto = salario * segundaFaixa;
        } else {
            imposto = salario * terceiraFaixa;
        }
        salario -= imposto;
        System.out.println("O salário é de: " + salario);
        System.out.println("O imposto é de: " + imposto);
    }
}
