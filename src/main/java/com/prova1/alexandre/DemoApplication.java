package com.prova1.alexandre;

import com.prova1.alexandre.model.Cinema;
import com.prova1.alexandre.model.Filmes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {

    Cinema cine[] = new Cinema[3];
    cine[0] = new Cinema(1L, "Cataratas",
            "Avenida Paraná", 5000L, "Vila Maracanã", "Foz do Iguaçu", "Paraná");

    cine[1] = new Cinema(2L, "Cinemark",
            "Avenida das Cataratas", 325L, "Porto Meira", "Foz do Iguaçu", "Paraná");

    cine[2] = new Cinema(3L, "Água Verde",
            "República Argentina", 10588L, "Água Verde", "Curitiba", "Paraná");

    for (int i=0; i < 3; i++){
      System.out.println(cine[i]);
    }


    Filmes filme[] = new Filmes[5];

    filme[0] = new Filmes(1L, "Fight Club", "", "David Fincher",
            "", "Drama");
    filme[1] = new Filmes(2L, "Pulp Fiction", "", "Quentin Tarantino",
            "", "Crime, Drama");
    filme[2] = new Filmes(3L, "The Godfather", "", "Francis Ford Coppola",
            "", "Crime, Drama");
    filme[3] = new Filmes(4L, "Seven", "", "David Fincher",
            "", "Crime, Drama");
    filme[4] = new Filmes(5L, "Forrest Gump", "", "Robert Zemeckis",
            "", "Drama, Romance");
    for (int i=0; i < 5; i++){
      System.out.println(filme[i]);
    }

  }


}
