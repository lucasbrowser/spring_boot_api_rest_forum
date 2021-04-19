/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.apiforum.controller.dto;

import br.com.lucas.apiforum.model.Topico;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Lucas
 */
public class TopicoDto {
    
    private long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    
    public TopicoDto(Topico topico){
//        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    
    public static List<TopicoDto> converter(List<Topico> topicos) {
	return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
    }
    
    
}
