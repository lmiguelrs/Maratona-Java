package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se o salario > 5000
        double salario = 2000;

        // (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500 reais para o DevDojo" : "Ainda não tenho condições, mas vou ter !";

        System.out.println(resultado);
    }
}
