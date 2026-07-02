package Ex1;
public class Pessoa{
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Pessoa(){
        this.nome = "";
        this.sobrenome = "";
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;  
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }
}