package PadroesDeProjeto.ex5;

public class PizzariaFactory {
    
    public Pizza pedirPizza(int TYPE) {
        switch (TYPE){
            case 1:
                return new PizzaMussarela();
            case 2:
                return new Pizza4queijos();
            default:
                return null;
        }
    }

    public void prepararPizza(int TYPE){
        Pizza pizza = this.pedirPizza(TYPE);

        pizza.abrir();
        pizza.addMolho();
        pizza.addCobertura();
        pizza.assar();
        pizza.cortar(); 
    }
}
