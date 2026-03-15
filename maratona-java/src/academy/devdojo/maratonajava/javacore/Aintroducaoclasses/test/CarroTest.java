package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();
        carro01.nome = "Uno";
        carro02.nome = "Siena";
        carro01.modelo = "Hatch";

        carro02.modelo = "Sedan";
        carro01.ano = 2007;
        carro02.ano = 2010;

        carro01 = carro02;

        System.out.println("Carro 01");
        System.out.print(carro01.nome + " " + carro01.modelo + " " + carro01.ano);
        System.out.println("\nCarro 02");
        System.out.print(carro02.nome + " " + carro02.modelo + " " + carro02.ano);

    }
}
