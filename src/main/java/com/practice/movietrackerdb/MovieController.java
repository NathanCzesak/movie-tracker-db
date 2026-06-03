package com.practice.movietrackerdb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepos repos;

    public MovieController(MovieRepos repos) {
        this.repos = repos;
    }

    @GetMapping
    public List<Movie> getMovies() {
        return repos.findAll();
    }

    @PostMapping
    public void addMovie(@RequestBody Movie movie) {
        repos.save(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id ) {
        repos.deleteById(id);
    }


}
