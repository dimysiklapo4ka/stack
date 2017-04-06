package Stack;

/**
 * Created by d1mys1klapo4ka on 06.04.2017.
 */
public class Stack {
        private int maxSize;
        private int[] stackArray;
        private int top;

        public Stack(int max) {
            this.maxSize = max;
            stackArray = new int[maxSize];
            top = -1;
        }

        public void addElementToStack(int element) {
            stackArray[++top] = element;
        }

        public int deleteElementFromStack() {
            return stackArray[top--];
        }

        public int readTop() {
            return stackArray[top];

        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public boolean isFull() {
            return (top == maxSize - 1);
        }
    }

    class ClassicStack {

        public static void main(String[] args) {
            Stack theStack = new Stack(10);

            theStack.addElementToStack(89);
            theStack.addElementToStack(69);
            theStack.addElementToStack(45);
            theStack.addElementToStack(34);

            //theStack.deleteElementFromStack();

            System.out.print("Наш стек: ");
            while (!theStack.isEmpty()) {
                int value = theStack.deleteElementFromStack();
                System.out.print(value);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

