import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class TesteStack {
    public static void main(String[] args) {
     Stack<Number> stack = new Stack<>(); //cria uma stack

        //utiliza o push()
        stack.push(12L); //valor long 12L inserido
        System.out.println("pushed 12L");
        printStack(stack);
        stack.push(34567); //valor int
        System.out.println("pushed 34567");
        printStack(stack);
        stack.push(1.0F); //valor float
        System.out.println("pushed 1.0F");
        printStack(stack);
        stack.push(123.5678); //valor double
        System.out.println("pushed 123.5678");
        printStack(stack);

        //remove itens da pilha
        try{
            Number removedObject = null;

            //remove elementos da pilha
            while(true){
                removedObject = stack.pop(); //método pop para remover
                System.out.printf("removed %s%n ", removedObject);
                System.out.print(stack);
            }
        }catch(EmptyStackException emptyStackException){
            emptyStackException.printStackTrace();
        }

    }

    //exibe o conteudo da Stack
    private static void printStack(Stack<Number> stack){
        if(stack.isEmpty())
            System.out.println("Stack is empty %n%n"); //a pilha está vazia
        else
            System.out.printf("Stack content: %s (top)%n", stack);
    }
}
