package LinearDataStructures.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class e11RadioactiveMutantVampireBunnies {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lairData = reader.readLine().split("\\s+");
        int lairRow = Integer.parseInt(lairData[0]);
        int lairCol = Integer.parseInt(lairData[1]);
        int playerRow = 0;
        int playerCol = 0;
        char[][] lair = new char[lairRow][];

        for (int i = 0; i < lair.length; i++) {
            String inputData = reader.readLine();
            lair[i] = new char[inputData.length()];

            for (int j = 0; j < inputData.length(); j++) {
                if (inputData.charAt(j) == 'P') {
                    playerRow = i;
                    playerCol = j;
                }
                lair[i][j] = inputData.charAt(j);
            }
        }
        String playerMoves = reader.readLine();
        boolean playerDead = false;
        boolean playerWin = false;

        for (int i = 0; i < playerMoves.length(); i++) {
            char direction = playerMoves.charAt(i);
            lair[playerRow][playerCol] = '.';

            switch (direction) {
                case 'L':
                    if (isItOutSideTheLair(playerRow, playerCol - 1, lair)) {
                        playerWin=true;
                        break;
                    } else if (lair[playerRow][playerCol - 1] == 'B') {
                        playerCol--;
                        playerDead=true;
                        break;
                    }else {
                        playerCol--;
                        lair[playerRow][playerCol] ='P';
                    }
                    break;
                case 'R':
                    if (isItOutSideTheLair(playerRow, playerCol + 1, lair)) {
                        playerWin=true;
                        break;
                    } else if (lair[playerRow][playerCol + 1] == 'B') {
                        playerCol++;
                        playerDead=true;
                        break;
                    }else {
                        playerCol++;
                        lair[playerRow][playerCol] ='P';
                    }
                    break;
                case 'U':
                    if (isItOutSideTheLair(playerRow-1, playerCol, lair)) {
                        playerWin=true;
                        break;
                    } else if (lair[playerRow-1][playerCol] == 'B') {
                        playerRow--;
                        playerDead=true;
                        break;
                    }else {
                        playerRow--;
                        lair[playerRow][playerCol] ='P';
                    }
                    break;
                case 'D':
                    if (isItOutSideTheLair(playerRow+1, playerCol, lair)) {
                        playerWin=true;
                        break;
                    } else if (lair[playerRow+1][playerCol] == 'B') {
                        playerRow++;
                        playerDead=true;
                        break;
                    }else {
                        playerRow++;
                        lair[playerRow][playerCol] ='P';
                    }
                    break;
                default:
                    break;
            }

            char[][] temp = new char[lairRow][];

            for (int r = 0; r < temp.length; r++) {
                temp[r]= Arrays.copyOf(lair[r],lair[r].length);
            }

            for (int r = 0; r < lair.length; r++) {

                for (int c = 0; c < lair[r].length; c++) {
                    if (temp[r][c]=='B'){
                        if (!isItOutSideTheLair(r+1,c,lair)){
                            if (lair[r+1][c]=='P'){
                                playerDead=true;
                            }
                            lair[r+1][c]='B';
                        }
                        if (!isItOutSideTheLair(r-1,c,lair)){
                            if (lair[r-1][c]=='P'){
                                playerDead=true;
                            }
                            lair[r-1][c]='B';
                        }
                        if (!isItOutSideTheLair(r,c+1,lair)){
                            if (lair[r][c+1]=='P'){
                                playerDead=true;
                            }
                            lair[r][c+1]='B';
                        }
                        if (!isItOutSideTheLair(r,c-1,lair)){
                            if (lair[r][c-1]=='P'){
                                playerDead=true;
                            }
                            lair[r][c-1]='B';
                        }
                    }
                }
            }
            if (playerDead){
                break;
            }
        }
        //Print the result
        for (char[] row : lair) {

            for (char elem : row) {
                System.out.print(elem);
            }
            System.out.println();
        }
        if (playerWin){
            System.out.println("won: "+playerRow+" "+playerCol);
        }
        if (playerDead){
            System.out.println("dead: "+playerRow+" "+playerCol);
        }
    }

    private static boolean isItOutSideTheLair(int row, int col, char[][] arr) {
        return row < 0 || col < 0 || row >= arr.length || col >= arr[0].length;


    }
}
