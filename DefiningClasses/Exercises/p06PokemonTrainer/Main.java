package JavaAdvance.DefiningClasses.Exercises.p06PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Trainer> trainerList = new ArrayList<>();
        String command = "";
        while (!"Tournament".equals(command = reader.readLine())) {
            String[] data = command.split("\\s+");
            int indexOfTrainer = isItHaveTheSameTrainer(data[0], trainerList);
            if (indexOfTrainer == -1) {
                //no trainer
                trainerList.add(new Trainer(data[0]));
                Pokemon pokemon = new Pokemon(data[1], data[2], Integer.parseInt(data[3]));
                trainerList.get(trainerList.size() - 1).setCollection(pokemon);
            } else {
                //there is a trainer
                Pokemon pokemon = new Pokemon(data[1], data[2], Integer.parseInt(data[3]));
                trainerList.get(indexOfTrainer).setCollection(pokemon);
            }
        }
        String type = "";
        while (!"End".equals(type = reader.readLine())) {
            for (int i = 0; i < trainerList.size(); i++) {
                boolean isItHavePocemonFromThisType = true;
                for (int p = 0; p < trainerList.get(i).getCollection().size(); p++) {
                    if (trainerList.get(i).getCollection().get(p).getElement().equals(type)) {
                        trainerList.get(i).setBadges();
                        isItHavePocemonFromThisType = false;
                    }
                }
                if (isItHavePocemonFromThisType) {
                    for (int p = 0; p < trainerList.get(i).getCollection().size(); p++) {
                        trainerList.get(i).getCollection().get(p).setHealth();
                      // if (trainerList.get(i).getCollection().get(p).getHealth() <= 0) {
                      //     trainerList.get(i).getCollection().remove(p);
                      //     p--;
                      // }
                    }
                    trainerList.get(i).getCollection().removeIf(e->e.getHealth()<=0);

                }
            }
        }
        trainerList.sort((a, b) -> Integer.compare(b.getBadges(), a.getBadges()));
        for (Trainer trainer : trainerList) {
            System.out.println(trainer.toString());
        }
    }

    private static int isItHaveTheSameTrainer(String name, List<Trainer> trainerList) {

        for (int i = 0; i < trainerList.size(); i++) {
            if (trainerList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
