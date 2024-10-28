import java.util.ArrayList;
import java.util.Scanner;

class Stack {
    ArrayList<Integer> stackList;

    // Constructor to initialize the stack
    public Stack() {
        stackList = new ArrayList<>();
    }

    // Push operation: Adds an element to the top of the stack
    public void push(int value) {
        stackList.add(value);
        System.out.println(value + " pushed to stack.");
    }

    // Pop operation: Removes and returns the top element of the stack
    public int pop() {
        if (!empty()) {
            int value = stackList.remove(stackList.size() - 1);
            System.out.println(value + " popped from stack.");
            return value;
        } else {
            System.out.println("Stack is empty.");
            return -1; // or throw an exception
        }
    }

    // Peek operation: Returns the top element without removing it
    public int peek() {
        if (!empty()) {
            return stackList.get(stackList.size() - 1);
        } else {
            System.out.println("Stack is empty.");
            return -1; // or throw an exception
        }
    }

    // Empty operation: Checks if the stack is empty
    public boolean empty() {
        return stackList.isEmpty();
    }

    // Main method to test the stack operations with user input
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Check if empty");
            System.out.println("5: Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a number to push:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Top element is: " + stack.peek());
                    break;
                case 4:
                    System.out.println("Is stack empty? " + stack.empty());
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
