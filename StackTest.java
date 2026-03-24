package JavaCoding;

interface Stack {
    int size = 5;

    void push(String data);
    String pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// Integer Stack
class IntegerStack implements Stack {
    private int[] arr = new int[size];
    private int top = -1;

    public void push(String data) {
        if (overflow()) {
            System.out.println("Integer Stack Overflow");
        } else {
            try {
                int value = Integer.parseInt(data);
                arr[++top] = value;
                System.out.println("Pushed: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer input");
            }
        }
    }

    public String pop() {
        if (underflow()) {
            System.out.println("Integer Stack Underflow");
            return null;
        } else {
            return String.valueOf(arr[top--]);
        }
    }

    public void display() {
        if (underflow()) {
            System.out.println("Integer Stack is empty");
        } else {
            System.out.print("Integer Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// String Stack
class StringStack implements Stack {
    private String[] arr = new String[size];
    private int top = -1;

    public void push(String data) {
        if (overflow()) {
            System.out.println("String Stack Overflow");
        } else {
            arr[++top] = data;
            System.out.println("Pushed: " + data);
        }
    }

    public String pop() {
        if (underflow()) {
            System.out.println("String Stack Underflow");
            return null;
        } else {
            return arr[top--];
        }
    }

    public void display() {
        if (underflow()) {
            System.out.println("String Stack is empty");
        } else {
            System.out.print("String Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// Double Stack
class DoubleStack implements Stack {
    private double[] arr = new double[size];
    private int top = -1;

    public void push(String data) {
        if (overflow()) {
            System.out.println("Double Stack Overflow");
        } else {
            try {
                double value = Double.parseDouble(data);
                arr[++top] = value;
                System.out.println("Pushed: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid double input");
            }
        }
    }

    public String pop() {
        if (underflow()) {
            System.out.println("Double Stack Underflow");
            return null;
        } else {
            return String.valueOf(arr[top--]);
        }
    }

    public void display() {
        if (underflow()) {
            System.out.println("Double Stack is empty");
        } else {
            System.out.print("Double Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// Main Class
public class StackTest {
    public static void main(String[] args) {

        // Integer Stack
        System.out.println("=== Integer Stack ===");
        IntegerStack intStack = new IntegerStack();
        intStack.push("10");
        intStack.push("20");
        intStack.display();
        System.out.println("Popped: " + intStack.pop());
        intStack.display();

        // String Stack
        System.out.println("\n=== String Stack ===");
        StringStack strStack = new StringStack();
        strStack.push("Hello");
        strStack.push("World");
        strStack.display();
        System.out.println("Popped: " + strStack.pop());
        strStack.display();

        // Double Stack
        System.out.println("\n=== Double Stack ===");
        DoubleStack dblStack = new DoubleStack();
        dblStack.push("1.5");
        dblStack.push("2.7");
        dblStack.display();
        System.out.println("Popped: " + dblStack.pop());
        dblStack.display();
    }
}