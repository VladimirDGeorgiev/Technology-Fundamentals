package JavaAdvance.Workshop;

public class Main {
    public static void main(String[] args) {
        CustomStack customStack =new CustomStack();
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.pop();
        customStack.peek();
        customStack.forEach(System.out::println);
    }
}
