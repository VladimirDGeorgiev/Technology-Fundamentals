package Exercise.Snowwhite;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Programming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        LinkedHashMap<String, Integer> dwarfs = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> counter = new LinkedHashMap<>();
        while (!input.equals("Once upon a time")) {
            String[] tokens = input.split(" <:> ");
            String dwarfName = tokens[0];
            String hatColor = tokens[1];
            String key = dwarfName + " " + hatColor;
            int physics = Integer.parseInt(tokens[2]);
            if (!dwarfs.containsKey(key)) {         //ДжуджкитеМап ако не садържа ключа (име и цвят)
                dwarfs.put(key, physics);           //ДжуджкитеМап путваме ключа и силата
                if(!counter.containsKey(hatColor)){ //КаунтараМап несадъжа ЦВЕТА
                    counter.put(hatColor,0);        //КаунтараМап създава ключа
                }
                counter.put(hatColor,counter.get(hatColor)+1); //КаунтараМап добавя към бряча на цветове


            } else {                                //ДжуджкитеМап ако СЪДЪРЖА ключа (име и цвят)
                if(dwarfs.get(key)<physics){        //Обновяване на стойноста при същото джудже
                    dwarfs.put(key,physics);
                }
            }


            input = reader.readLine();
        }                                           //Край на цикала
        dwarfs=dwarfs.entrySet().stream().sorted((kv2,kv1) -> {
            if(kv1.getValue().equals(kv2.getValue())){
                Integer firstValue=counter.get(kv1.getKey().split(" ")[1]);
                Integer secondValue=counter.get(kv2.getKey().split(" ")[1]);
                return firstValue.compareTo(secondValue);
            }
            return kv1.getValue().compareTo(kv2.getValue());
        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                (oldValue,newValue)-> oldValue,LinkedHashMap::new));

        for (Map.Entry<String, Integer> entry : dwarfs.entrySet()) {
            String dwarfName = entry.getKey().split(" ")[0];
            String hatColor = entry.getKey().split(" ")[1];
            System.out.printf("(%s) %s <-> %d%n",hatColor,dwarfName,entry.getValue());
        }

    }
}

