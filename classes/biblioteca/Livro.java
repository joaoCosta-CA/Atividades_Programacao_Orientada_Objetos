public class Livro{
    private String titulo;
    private String autor;
    private String qntPaginas;
    private String ano;


    public Livro(String titulo, String autor, String ano, String qntPaginas){
        this.titulo = titulo;
        this.autor= autor;
        this.ano = ano;
        this.qntPaginas = qntPaginas;
    }

    public void print(){
        System.out.println("Titulo:" + this.titulo);
        System.out.println("Autor:" + this.autor);
        System.out.println("Ano:" + this.ano);
        System.out.println("Quantidade de Paginas:" + this.qntPaginas);
        System.out.println("--------------------------------------------------\n");
    }
}