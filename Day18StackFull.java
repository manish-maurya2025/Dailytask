import java.util.Scanner;
import java.util.Stack;

class StackArray {

    int arr[];
    int top;
    int size;

    StackArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push Operation
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop Operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top] + " popped from stack");
            top--;
        }
    }

    // Display Stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
class ReverseStringUsingStack {

    static String reverse(String str) {

        Stack<Character> stack = new Stack<>();

        // Push characters
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";

        // Pop characters
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return reversed;
    }
}
public class Day18StackFull {

    public static void main(String[] args) {

        // Stack using array
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.pop();
        stack.display();

        // Reverse String using stack
        String original = "hello";
        String reversed = ReverseStringUsingStack.reverse(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}

