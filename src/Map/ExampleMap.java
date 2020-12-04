package Map;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {

    public static void main(String[] args) {
        Map<String, String> estadosBrasileiro = new HashMap<>();
        estadosBrasileiro.put("AC","Acre");
        estadosBrasileiro.put("AL","Alagoas");
        estadosBrasileiro.put("AP","Amapa");
        estadosBrasileiro.put("AM","Amazonas");
        estadosBrasileiro.put("BA","Bahia");
        estadosBrasileiro.put("CE","Ceara");
        estadosBrasileiro.put("DF","Distro Federal");
        estadosBrasileiro.put("ES","Espirito Santo");
        estadosBrasileiro.put("GO","Goias");
        estadosBrasileiro.put("MA","Maranhão");
        estadosBrasileiro.put("MT","Mato Grosso");
        estadosBrasileiro.put("MS","Mato Grosso do sul");
        estadosBrasileiro.put("MG","Minas Gerais");
        estadosBrasileiro.put("PA","Para");
        estadosBrasileiro.put("PB","Paraiba");
        estadosBrasileiro.put("PR","Paraná");
        estadosBrasileiro.put("PE","Pernambuco");
        estadosBrasileiro.put("PI","Piauí");
        estadosBrasileiro.put("RJ","Rio de Janeiro");
        estadosBrasileiro.put("RN","Rio Grande do Norte");
        estadosBrasileiro.put("RS","Rio Grande do Sul");
        estadosBrasileiro.put("RO","Rondônia");
        estadosBrasileiro.put("RR","Roraima");
        estadosBrasileiro.put("SC","Santa Catarina");
        estadosBrasileiro.put("SP","São Paulo");
        estadosBrasileiro.put("SE","Sergipe");
        estadosBrasileiro.put("TO","Tocantins");


        System.out.println(estadosBrasileiro);


        System.out.println("------------------------");

        estadosBrasileiro.remove("MG");
        System.out.println("------------------------");

        estadosBrasileiro.put("DF","Distro Federal");

        System.out.println(estadosBrasileiro);


        int tamanho = estadosBrasileiro.size();

        System.out.println(tamanho);

    }
}
