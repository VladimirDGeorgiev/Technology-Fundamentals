package JavaAdvance.DefiningClasses.Exercises.p06PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges; // = 0
    private List<Pokemon> collection;

    public Trainer(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
        this.badges = 0;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges() {
        this.badges++;
    }

    public List<Pokemon> getCollection() {
        return collection;
    }


    public void setCollection(Pokemon pokemon) {
        this.collection.add(pokemon);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name+" "+badges+" "+collection.size();
    }
}
