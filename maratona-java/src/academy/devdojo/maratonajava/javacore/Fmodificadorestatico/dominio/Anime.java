package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carrega a classe
    // 1 - O espaço na memória é alocado para o objeto
    // 2 - Cada atributo de classe é inicializado com valores defalut ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static{
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for (int i = 0 ; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }

    static{
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static{
        System.out.println("Dentro do bloco de inicialização estátco 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estátco 4 ");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
