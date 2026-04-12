package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;



public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } // Poderia usar também o Else e nesse caso tem um "oculto"
        //System.out.println("Não existe divisão por zero");
        return 0;
    }

    public void divideDoisNumeros03(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        } // Poderia usar um else também para não ler a condição de divisão
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero01, int numero02) {
        numero01 = 99;
        numero02 = 33;
        System.out.println("Dentro do AlteraDoisNumeros");
        System.out.println("numero01: " + numero01 + " numero02: " + numero02);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void numeroPrimo(int num1) {
        if (num1 <= 1) {
            System.out.println("Não é primo");
            return;
        }

        for (int i = 2; i * i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.println("Não é primo");
                return;
            }
        }
        System.out.println("É primo");
    }

   // public void listaDobrada (int[] numeros) {
    //    for (int num * 2)
   // }
}
