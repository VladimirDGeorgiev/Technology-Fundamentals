package JavaAdvance.DefiningClasses.Lab.p03BankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<BankAccount> accounts = new ArrayList<>();
        int index = 0;
        String command ;
        while (!(command= reader.readLine()).equals("End")){
            String[] data = command.split("\\s+");

            switch (data[0]){
                case "Create":
                    accounts.add(new BankAccount());
                    System.out.printf("Account ID%d created%n",index+1);
                    index++;
                    break;
                case "Deposit":if (Integer.parseInt(data[1])-1>=accounts.size()){
                    System.out.println("Account does not exist");
                }else {
                    accounts.get(Integer.parseInt(data[1]) - 1).deposit(Integer.parseInt(data[2]));
                    System.out.printf("Deposited %s to ID%s%n",data[2],data[1]);
                }
                    break;
                case "GetInterest": if (Integer.parseInt(data[1])-1>=accounts.size()){
                    System.out.println("Account does not exist");
                }else {
                    System.out.println(String.format("%.2f",accounts.get(Integer.parseInt(data[1]) - 1).getInterest(Integer.parseInt(data[2]))));
                }
                    break;
                case "SetInterest":BankAccount.setInterestRate(Double.parseDouble(data[1]));
                    break;
                    default:
                        break;
            }
        }
    }
}
