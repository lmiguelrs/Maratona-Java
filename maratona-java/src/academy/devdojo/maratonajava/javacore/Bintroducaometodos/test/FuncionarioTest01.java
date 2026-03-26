package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario01.setNome("Miguel");
        funcionario01.setIdade(23);
        funcionario01.setSalarios(new double[]{1500, 1000, 1500});

        funcionario02.setNome("Luiz");
        funcionario02.setIdade(30);
        funcionario02.setSalarios(new double[]{1000, 1000, 1000});

        funcionario03.setNome("Jorge");
        funcionario03.setIdade(28);
        funcionario03.setSalarios(new double[]{2000, 1500, 1500});

        funcionario01.imprime();
        funcionario02.imprime();
        funcionario03.imprime();
    }
}
