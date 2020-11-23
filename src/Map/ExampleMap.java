package Map;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {

    public static void main(String[] args) {
        Map<String, Integer> campeonado = new HashMap<>();


        campeonado.put("Brasil",5);
        campeonado.put("Argentina",4);
        campeonado.put("Italia",3);
        campeonado.put("Alemanha",2);


        System.out.println(campeonado);

    campeonado.remove("Alemanha");
        System.out.println(campeonado);

        System.out.println(campeonado.get("Brasil   "));

        System.out.println(campeonado);
    }
}
