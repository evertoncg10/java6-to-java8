package org.j6toj8.streams.usingstreams.collect;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorMapping {

  public static void main(String[] args) {
    // tag::code[]
    // Armazena o resultado do Stream em um Mapa
    // A Chave é o tamanho do nome
    // O Valor são os nomes que tem aquele tamanho, convertidos para maiúscula, separados por vírgula
    Map<Integer, String> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.groupingBy(s -> s.length(), Collectors.mapping(s -> s.toUpperCase(), Collectors.joining(","))));
    
    System.out.println(collect);
    // end::code[]
  }
}
