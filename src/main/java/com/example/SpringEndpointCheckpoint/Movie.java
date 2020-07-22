package com.example.SpringEndpointCheckpoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public class Movie {

        private String Title;
        private int Minutes;
        private List<String> Genre;
        private double Rating;
        private int Metascore;
        private String Description;

    public Credit[] getCredits() {
        return credits;
    }

    public void setCredits(Credit[] credits) {
        this.credits = credits;
    }

    private Credit[] credits;

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public int getMinutes() {
            return Minutes;
        }

        public void setMinutes(int minutes) {
            Minutes = minutes;
        }

        public List<String> getGenre() {
            return Genre;
        }

        public void setGenre(List<String> genre) {
            Genre = genre;
        }

        public double getRating() {
            return Rating;
        }

        public void setRating(double rating) {
            Rating = rating;
        }

        public int getMetascore() {
            return Metascore;
        }

        public void setMetascore(int metascore) {
            Metascore = metascore;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public int getVotes() {
            return Votes;
        }

        public void setVotes(int votes) {
            Votes = votes;
        }

        public double getGross() {
            return Gross;
        }

        public void setGross(double gross) {
            Gross = gross;
        }

        public String getYear() {
            return Year;
        }

        public void setYear(String year) {
            Year = year;
        }

        private int Votes;
        private double Gross;
        private String Year;


        static class Credit {
            public Person getCredit() {
                return credit;
            }

            @JsonProperty("Person")
            public void setCredit(Person credit) {
                this.credit = credit;
            }

            private Person credit;


            static class Person {
                private String Role;

                public String getRole() {
                    return Role;
                }

                public void setRole(String role) {
                    Role = role;
                }

                public String getFirstname() {
                    return firstname;
                }

                public void setFirstname(String firstname) {
                    this.firstname = firstname;
                }

                public String getLastname() {
                    return lastname;
                }

                public void setLastname(String lastname) {
                    this.lastname = lastname;
                }

                private String firstname;
                private String lastname;
            }
        }






    }

