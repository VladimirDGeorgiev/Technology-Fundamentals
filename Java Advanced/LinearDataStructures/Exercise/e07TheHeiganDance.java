package LinearDataStructures.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class e07TheHeiganDance {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double damage = Double.parseDouble(reader.readLine());
        double playerHitPoints = 18500;
        double heiganHitPoints = 3000000;

        boolean[][] chamber = new boolean[15][];
        for (int i = 0; i < chamber.length; i++) {
            chamber[i] = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,};
        }
        int[] playerPlace = new int[]{7, 7};
        boolean plagueCloudActive = false;
        boolean heiganDead = false;
        String playerKilledBySpell = "";

        while (true) {
            //player does damage to Heigan
            heiganHitPoints -= damage;
            if (heiganHitPoints <= 0) {
                heiganDead = true;
                break;
            }

            if (plagueCloudActive) {
                playerHitPoints -= 3500;
                plagueCloudActive = false;
                if (playerHitPoints <= 0) {
                    playerKilledBySpell= "Plague Cloud";
                    break;
                }
            }

            //Heigan uses a spell
            String[] data = reader.readLine().split("\\s+");
            String spell = data[0];
            int row = Integer.parseInt(data[1]);
            int col = Integer.parseInt(data[2]);

            if ((playerPlace[0] >= row - 1 && playerPlace[0] <= row + 1) || (playerPlace[1] >= col - 1 && playerPlace[1] <= col + 1)) {
                if (!isPlayerMove(playerPlace, row, col)) {
                    if (spell.equals("Cloud")) {
                        playerHitPoints -= 3500;
                        plagueCloudActive = true;
                        if (playerHitPoints <= 0) {
                            playerKilledBySpell= "Plague Cloud";
                            break;
                        }

                    } else if (spell.equals("Eruption")) {
                        playerHitPoints -= 6000;
                        if (playerHitPoints <= 0) {
                            playerKilledBySpell= "Eruption";
                            break;
                        }
                    }
                }
            }
        }
        if (heiganDead){
            System.out.println("Heigan: Defeated!");
            System.out.println(String.format("Player: %.0f",playerHitPoints));
        }else{
            System.out.println(String.format("Heigan: %.2f",heiganHitPoints));
            System.out.println(String.format("Player: Killed by %s",playerKilledBySpell));
        }
        System.out.println("Final position: "+playerPlace[0]+", "+playerPlace[1]);


    }

    private static boolean isPlayerMove(int[] position, int rowDmg, int colDmg) {
        if (position[0] - 1 >= 0 && position[0] < rowDmg) {
            position[0]--;
            return true;
        } else if (position[1] + 1 < 15 && position[1] > colDmg) {
            position[1]++;
            return true;
        } else if (position[0] + 1 < 15 && position[0] > rowDmg) {
            position[0]++;
            return true;
        } else if (position[1] - 1 >= 0 && position[1] < colDmg) {
            position[1]--;
            return true;
        } else {
            return false;
        }
    }
}
