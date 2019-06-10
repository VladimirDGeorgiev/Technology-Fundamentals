package JavaAdvance.DefiningClasses.Exercises.p07Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Pokemon> pokemon;
    private List<Parents> parents;
    private List<Children> children;


    public Person(String name) {
        this.name = name;
        this.pokemon = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();

    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }

    public void setParents(Parents parents) {
        this.parents.add(parents);
    }

    public void setChildren(Children children) {
        this.children.add(children);
    }


    public void print(){
        System.out.println(this.name);
        System.out.println("Company:");
        if (this.company!=null){System.out.println(this.company.getCompanyName()+" "+ this.company.getDepartment()+" "+String.format("%.2f",this.company.getSalary()));}
        System.out.println("Car:");
        if(this.car!=null){System.out.println(this.car.getCarModel()+" "+this.car.getCarSpeed());}
        System.out.println("Pokemon:");
        for (Pokemon pok : pokemon) {
            System.out.println(pok.getPokemonName()+" "+pok.getPokemonType());
        }
        System.out.println("Parents:");
        for (Parents parent : parents) {
            System.out.println(parent.getParentName()+" "+parent.getParentBirthday());
        }
        System.out.println("Children:");
        for (Children child : children) {
            System.out.println(child.getChildName()+" "+child.getChildBirthday());
        }
    }
}
