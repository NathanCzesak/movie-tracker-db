package com.practice.movietrackerdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepos extends JpaRepository<Movie, Long> {
}
