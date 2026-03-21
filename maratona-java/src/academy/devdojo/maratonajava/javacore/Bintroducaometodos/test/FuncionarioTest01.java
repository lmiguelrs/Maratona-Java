package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario01.nome = "Miguel";
        funcionario01.idade = 23;
        funcionario01.salarios = new double[]{1500, 1000, 1500};

        funcionario02.nome = "Luiz";
        funcionario02.idade = 30;
        funcionario02.salarios = new double[]{1000, 1000, 1000};

        funcionario03.nome = "Jorge";
        funcionario03.idade = 28;
        funcionario03.salarios = new double[]{2000, 1500, 1500};

        funcionario01.imprime();
        funcionario02.imprime();
        funcionario03.imprime();
    }
}
