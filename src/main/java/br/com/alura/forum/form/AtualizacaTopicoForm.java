package br.com.alura.forum.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

public class AtualizacaTopicoForm {

    @NotNull @NotEmpty @Length(min = 5)
    private String titulo;
    @NotNull @NotEmpty @Length(min = 10)
    private String mensagem;

    public AtualizacaTopicoForm() {
    }

    public AtualizacaTopicoForm(Topico topico) {
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getById(id);
        topico.setMensagem(mensagem);
        topico.setTitulo(titulo);

        return topico;
    }
}
