package com.example.SpringEndpointCheckpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PagesController {
    List<String> genre = Arrays.asList("Crime", "Drama");

    @GetMapping("/movies/movie")
    public Movie getMovie(){
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
            credits[1].setCredit(person2);

            //person3
            person3.setRole("Star");
            person3.setFirstname("Al");
            person3.setLastname("Pacino");
            credits[2] = new Movie.Credit();
            credits[2].setCredit(person3);

            //person4
            person4.setRole("Star");
            person4.setFirstname("James");
            person4.setLastname("Caan");
            credits[3] = new Movie.Credit();
            credits[3].setCredit(person4);

            //person5
            person5.setRole("Star");
            person5.setFirstname("Diane");
            person5.setLastname("Keaton");
            credits[4] = new Movie.Credit();
            credits[4].setCredit(person5);
            movie.setCredits(credits);

            return movie;
        }

        @GetMapping("/movies")
        public Movie[] getMovies(){

            Movie[] movies = new Movie[2];
            Movie movie1 = new Movie();
            movie1.setTitle("The Godfather");
            movie1.setMinutes(175);
            movie1.setGenre(genre);
            movie1.setRating(9.2);
            movie1.setMetascore(100);
            movie1.setDescription("The aging patriarch of an organized crime dynasty " +
                    "transfers control of his clandestine empire to his reluctant son.");
            movie1.setVotes(1561591);
            movie1.setGross(134.97);
            movie1.setYear("1972");
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
            movie1.setCredits(credits);

            movies[0] = movie1;

            Movie movie2 = new Movie();
            movie2.setTitle("The Godfather Part II");
            movie2.setMinutes(202);
            movie2.setGenre(genre);
            movie2.setRating(9);
            movie2.setMetascore(90);
            movie2.setDescription("The early life and career of Vito Corleone in 1920s " +
                    "New York City is portrayed, while his son, Michael, expands and tightens " +
                    "his grip on the family crime syndicate.");
            movie2.setVotes(1091420);
            movie2.setGross(57.30);
            movie2.setYear("1972");
            Movie.Credit[] credits2 = new Movie.Credit[5];
            Movie.Credit.Person person1a = new Movie.Credit.Person();
            Movie.Credit.Person person2a = new Movie.Credit.Person();
            Movie.Credit.Person person3a = new Movie.Credit.Person();
            Movie.Credit.Person person4a = new Movie.Credit.Person();
            Movie.Credit.Person person5a = new Movie.Credit.Person();

            //person1
            person1a.setRole("Director");
            person1a.setFirstname("Francis Ford");
            person1a.setLastname("Copolla");
            credits2[0] = new Movie.Credit();
            credits2[0].setCredit(person1a);

            //person2
            person2a.setRole("Star");
            person2a.setFirstname("Al");
            person2a.setLastname("Pacino");
            credits2[1] = new Movie.Credit();
            credits2[1].setCredit(person2a);

            //person3
            person3a.setRole("Star");
            person3a.setFirstname("Robert");
            person3a.setLastname("De Niro");
            credits[2] = new Movie.Credit();
            credits[2].setCredit(person3a);

            //person4
            person4a.setRole("Star");
            person4a.setFirstname("Robert");
            person4a.setLastname("Duvall");
            credits[3] = new Movie.Credit();
            credits[3].setCredit(person4a);

            //person5
            person5a.setRole("Star");
            person5a.setFirstname("Diane");
            person5a.setLastname("Keaton");
            credits[4] = new Movie.Credit();
            credits[4].setCredit(person5a);
            movie2.setCredits(credits);

            movies[1] = movie2;

            return movies;
        }


        @PostMapping("/movies/gross/total")
        public Map<String, Integer> sumMoviesTotal(@RequestBody() Movie[] movie) {
            int total = 0;
            for (Movie m  : movie) {
                total += m.getGross();
            }
            Map<String, Integer> result = new HashMap<>();
            result.put("result", total);
            return result;
        }

    }

