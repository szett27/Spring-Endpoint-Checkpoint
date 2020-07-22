package com.example.SpringEndpointCheckpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PagesController {

    @GetMapping("/movies/movie")
    public Movie getMovie(){
        List<String> genre = Arrays.asList("Crime", "Drama");
            Movie movie = new Movie();
            movie.setTitle("The Godfather");
            movie.setMinutes(175);
            movie.setGenre(genre);
            movie.setRating(9.2);
            movie.setMetascore(100);
            movie.setDescription("The aging patriarch of an organized crime dynasty " +
                    "transfers control of his clandestine empire to his reluctant son.");
            movie.setVotes(1561591);
            movie.setGross(134.97);
            movie.setYear("1972");
            Movie.Credit[] credits = new Movie.Credit[5];
            Movie.Credit.Person person1 = new Movie.Credit.Person();
            Movie.Credit.Person person2 = new Movie.Credit.Person();
            Movie.Credit.Person person3 = new Movie.Credit.Person();
            Movie.Credit.Person person4 = new Movie.Credit.Person();
            Movie.Credit.Person person5 = new Movie.Credit.Person();

            //person1
            person1.setRole("Director");
            person1.setFirstname("Francis Ford");
            person1.setLastname("Copolla");
            credits[0] = new Movie.Credit();
            credits[0].setCredit(person1);

            //person2
            person2.setRole("Star");
            person2.setFirstname("Marlon");
            person2.setLastname("Brando");
            credits[1] = new Movie.Credit();
            credits[1].setCredit(person1);

            //person3
            person3.setRole("Star");
            person3.setFirstname("Al");
            person3.setLastname("Pacino");
            credits[2] = new Movie.Credit();
            credits[2].setCredit(person1);

            //person4
            person4.setRole("Star");
            person4.setFirstname("James");
            person4.setLastname("Caan");
            credits[3] = new Movie.Credit();
            credits[3].setCredit(person1);

            //person5
            person5.setRole("Star");
            person5.setFirstname("Diane");
            person5.setLastname("Keaton");
            credits[4] = new Movie.Credit();
            credits[4].setCredit(person1);
            movie.setCredits(credits);

            return movie;
        }


        @PostMapping("")

    }

