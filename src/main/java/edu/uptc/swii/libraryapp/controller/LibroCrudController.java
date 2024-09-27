package edu.uptc.swii.libraryapp.controller;

import edu.uptc.swii.libraryapp.domain.Libro;
import edu.uptc.swii.libraryapp.service.LibroService;
import edu.uptc.swii.libraryapp.service.EditorialService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibroCrudController {

    private final EditorialService editorialService;
    private final LibroService libroService;

    public LibroCrudController(EditorialService editorialService, LibroService libroService) {
        this.editorialService = editorialService;
        this.libroService = libroService;
    }

    @RequestMapping("/libros/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("editoriales", editorialService.buscarTodos());
        model.addAttribute("libro", new Libro());
        return "formLibro";
    }

    @PostMapping("/libros/guardar")
    public String guardar(Libro libro) {
        libroService.guardar(libro);
        return "redirect:/";
    }

}