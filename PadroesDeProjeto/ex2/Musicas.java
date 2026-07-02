package PadroesDeProjeto.ex2;

public  class Musicas{
    private String nome;
    private String autor;
    private String album;
    private String tipo;

    public Musicas(String nome, String autor, String album, String tipo){
        this.nome = nome;
        this.autor = autor;
        this.album = album;
        this.tipo = tipo;
    }


    public String toString(){
        return this.nome + " - " + this.autor;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getAutor(){
        return this.autor;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getAlbum(){
        return this.album;
    }
}