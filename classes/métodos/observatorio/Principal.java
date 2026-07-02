package classes.métodos.observatorio;

public class Principal {
    public static void main(String args[]){
        Estrelas e1 = new Estrelas("Sol", "Anã Branca", 0);
        e1.print();

        Estrelas e2 = new Estrelas("Sirius", "Anã Branca", 8.6);
        e2.print();

        Estrelas  e3 = new Estrelas("Betelgeuse", "Supergigante Vermelha", 642.5);
        e3.print();
        
        Estrelas e4 = new Estrelas("Rigel", "Supergigante Azul", 860);
        e4.print();

    }
}
