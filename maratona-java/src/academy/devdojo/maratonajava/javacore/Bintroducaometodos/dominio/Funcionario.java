package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario01;
    public double salario02;
    public double salario03;

    public void imprime() {
        System.out.println("-----------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario01);
        System.out.println(this.salario02);
        System.out.println(this.salario03);
    }

    public void mediaSalario() {
        
    }
}
