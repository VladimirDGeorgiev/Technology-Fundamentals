package ExamPreparation_JavaAdvanced.Archive_AdvancedJava_Exams.JavaAdvancedRetakeExam_27August2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02BombField {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        char[][] bombField = new char[n][n];
        int rowSapper = 0;
        int colSapper = 0;
        String[] command = reader.readLine().split(",+");
        //read matrix
        for (int r = 0; r < n; r++) {
            char[] data = reader.readLine().replaceAll(" ", "").toCharArray();
            for (int c = 0; c < n; c++) {
                bombField[r][c] = data[c];
                if (data[c] == 's') {
                    rowSapper = r;
                    colSapper = c;
                }
            }
        }

        for (int turn = 0; turn < command.length; turn++) {
            String direction = command[turn];
            boolean endGame = false;
            boolean hitBomb = false;
            switch (direction) {

                case "up":
                    if (isInBound(bombField, rowSapper - 1)) {
                        char symbol = bombField[rowSapper - 1][colSapper];
                        if (symbol == 'B') {
                            System.out.println("You found a bomb!");
                            hitBomb = true;
                        } else if (symbol == 'e') {
                            endGame = true;
                        }
                        //change the matrix
                        bombField[rowSapper][colSapper] = '+';
                        bombField[--rowSapper][colSapper] = 's';
                    }
                    break;
                case "down":
                    if (isInBound(bombField, rowSapper + 1)) {
                        char symbol = bombField[rowSapper + 1][colSapper];
                        if (symbol == 'B') {
                            System.out.println("You found a bomb!");
                            hitBomb = true;
                        } else if (symbol == 'e') {
                            endGame = true;
                        }
                        //change the matrix
                        bombField[rowSapper][colSapper] = '+';
                        bombField[++rowSapper][colSapper] = 's';
                    }
                    break;
                case "left":
                    if (isInBound(bombField, colSapper - 1)) {
                        char symbol = bombField[rowSapper][colSapper - 1];
                        if (symbol == 'B') {
                            System.out.println("You found a bomb!");
                            hitBomb = true;
                        } else if (symbol == 'e') {
                            endGame = true;
                        }
                        //change the matrix
                        bombField[rowSapper][colSapper] = '+';
                        bombField[rowSapper][--colSapper] = 's';
                    }
                    break;
                case "right":
                    if (isInBound(bombField, colSapper + 1)) {
                        char symbol = bombField[rowSapper][colSapper + 1];
                        if (symbol == 'B') {
                            System.out.println("You found a bomb!");
                            hitBomb = true;
                        } else if (symbol == 'e') {
                            endGame = true;
                        }
                        //change the matrix
                        bombField[rowSapper][colSapper] = '+';
                        bombField[rowSapper][++colSapper] = 's';
                    }
                    break;
            }
            //check is the game end
            if (hitBomb || endGame) {
                int bombCount = 0;
                for (char[] row : bombField) {
                    for (char element : row) {
                        if (element == 'B') {
                            bombCount++;
                        }
                    }
                }
                if (endGame && bombCount > 0) {
                    System.out.printf("END! %d bombs left on the field%n", bombCount);
                    return;
                } else if (endGame && bombCount == 0) {
                    System.out.println("Congratulations! You found all bombs!");
                    return;
                }
                if (hitBomb && bombCount == 0) {
                    System.out.println("Congratulations! You found all bombs!");
                    return;
                }
            }
        }

        int bombCount = 0;
        for (char[] row : bombField) {
            for (char element : row) {
                if (element == 'B') {
                    bombCount++;
                }
            }
        }
        System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)%n",bombCount,rowSapper,colSapper);

    }

    private static boolean isInBound(char[][] bombField, int direction) {
        return direction >= 0 && direction < bombField.length;
    }

}
