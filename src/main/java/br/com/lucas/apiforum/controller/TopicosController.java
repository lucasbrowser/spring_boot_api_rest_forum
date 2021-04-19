/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.apiforum.controller;

import br.com.lucas.apiforum.controller.dto.TopicoDto;
import br.com.lucas.apiforum.model.Curso;
import br.com.lucas.apiforum.model.Topico;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lucas
 */

@RestController
public class TopicosController {
    
    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){
        Topico topico = new Topico("Dúvida", "Dúvidas com Spring", new Curso("Spring", "Programação"));
        
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
    
    
}
