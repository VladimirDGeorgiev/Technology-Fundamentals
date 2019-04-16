import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String reverse = new StringBuffer(userName).reverse().toString();

        int counter = 0;

      while (true){
          String password = scanner.nextLine();
          if (password.equals(reverse)){
              System.out.println(String.format("User %s logged in.",userName));
              return;
          }
          else if (!password.equals(reverse)){
              counter++;
              if (counter==4){
                  System.out.println(String.format("User %s blocked!",userName));
                  return;
              }

              System.out.println("Incorrect password. Try again.");

          }

      }
    }
}
