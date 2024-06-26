package daniel.jones.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import daniel.jones.springmvc.models.Livro;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LivroController {
    
    @GetMapping("/livros")
    public String listarLivros(Model model) {

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Dom Quixote", "Miguel de Cervantes", 1605));
        livros.add(new Livro("Cem Anos de Solidao", "Gabriel Garcia Marquez", 1967));
        livros.add(new Livro("1984", "George Orwell", 1949));
    
        model.addAttribute("livros", livros);
    
        return "livros";
    }
}
