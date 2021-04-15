package com.desafio.spring.resource;

import java.util.List;

import javax.validation.Valid;

import com.desafio.spring.model.Acao;
import com.desafio.spring.repository.Acoes;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/acao")
public class AcoesResource {

    @Autowired
    private Acoes acoes;

    @PostMapping
    public Acao adicionar(@Valid @RequestBody Acao acao) {
        return acoes.save(acao);
    }

    @GetMapping
    public List<Acao> listar() {
        return acoes.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Acao> buscar(@PathVariable Long id) {
        Acao acao = acoes.getOne(id);

        if (acao == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(acao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Acao> atualizar(@PathVariable Long id,
                                          @Valid @RequestBody Acao acao) {
        Acao existente = acoes.getOne(id);

        if (existente == null) {
            return ResponseEntity.notFound().build();
        }

        BeanUtils.copyProperties(acao, existente, "id");

        existente = acoes.save(existente);

        return ResponseEntity.ok(existente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        Acao acao = acoes.getOne(id);

        if (acao == null) {
            return ResponseEntity.notFound().build();
        }

        acoes.delete(acao);

        return ResponseEntity.noContent().build();
    }
}