package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.controller.dto.TopicoDTO;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@Controller
@ResponseBody
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDTO> lista() {
        List<Topico> topicos = topicoRepository.findAll();

        return TopicoDTO.converter(topicos);
    }
}