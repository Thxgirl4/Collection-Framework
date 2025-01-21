import java.util.*;
//o programa conta o numero de ocorrencias de cada letra em uma String

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        createMap(map); //cria map com base na entrada do usuário
        displayMap(map); //exibe o conteudo do map

    }
    private static void createMap(Map<String, Integer> map){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String input = sc.nextLine();

        //transforma em token a entrada
        String[] tokens = input.split("");
        for(String token : tokens){
            String word = token.toLowerCase(); //tranforma a palavra em letras minusculas

            //se o mapa tiver a palavra
            if(map.containsKey(word)) //a palavra está no map
            {
                int count = map.get(word); //obtem a contagem atual
                map.put(word, count + 1); //incrementa a contagem
            }
            else
                map.put(word, 1); //add nova palavra com uma contagem de 1 para map
        }
    }
    private static void displayMap(Map<String, Integer> map){
        Set<String> keys = map.keySet(); //obtem chaves

        //classifica as chaves
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contém: %nKey \t\tValue%n");

        //gera saída de cada chave no map
        for(String key: sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));

        System.out.printf("%nsize:  %d%nisEmpty: %b%n", map.size(), map.isEmpty());

    }
}
