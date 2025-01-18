import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestArrayList {
    private static Object i;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> ag = new ArrayList<String>();

        ag.add("Marcos Tadeu;11 1111-1111 ");
        ag.add("Teodoro Paqueta;22 2222-2222 ");
        ag.add("Jose Antonio;33 3333-3333 ");
        ag.add("Carlos Alberto;44 4444-4444");

        int i;

        System.out.printf("Percorrendo o ArrayList");
        int n = ag.size();
        for(i = 0; i<n; i++){
            System.out.printf("Posição %d- %s\n", i, ag.get(i));
        }

        System.out.printf("\nInforme a posição a ser excluída:\n");
        i = ler.nextInt();

        try{
            ag.remove(i);

        }catch(IndexOutOfBoundsException e){
            // exceção lançada para indicar que um índice (i)
            // está fora do intervalo válido (de 0 até agenda.size()-1)
            System.out.printf("\nErro: posição inválida (%s).",
                    e.getMessage());

        }

        System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
        i = 0;
        for(String contato: ag){
            System.out.printf("Posição %d- %s\n", i, contato);
            i++;
        }

        System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
        i=0;
        Iterator<String> iterator = ag.iterator();
        while(iterator.hasNext()){
            System.out.printf("Posição %d- %s\n", i, iterator.next());
            i++;
        }

    }
}
