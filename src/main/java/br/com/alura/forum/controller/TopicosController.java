package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@Controller
@ResponseBody
public class TopicosController {

    @RequestMapping("/topicos")
    public List<Topico> lista() {
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));

        return Arrays.asList(topico, topico, topico);
    }
}