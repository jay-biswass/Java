package OOPs;
class Pokemon{
    String type;
    int power;
    Pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }
    Pokemon(){

    }
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}

class LegendaryPokemon extends Pokemon{
    String ability;
}

class GodPokemon extends LegendaryPokemon{
    char tag;
}

public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
        Pokemon pikachu = new Pokemon();

    }
}
