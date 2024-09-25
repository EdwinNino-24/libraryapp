package edu.uptc.swii.libraryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uptc.swii.libraryapp.domain.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}