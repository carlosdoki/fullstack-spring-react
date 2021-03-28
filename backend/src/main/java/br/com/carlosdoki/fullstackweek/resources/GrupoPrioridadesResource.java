package br.com.carlosdoki.fullstackweek.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlosdoki.fullstackweek.domain.GrupoPrioridades;
import br.com.carlosdoki.fullstackweek.repository.GrupoPrioridadesRepository;

@RestController
@RequestMapping("/grupoprioridade")
public class GrupoPrioridadesResource {

    @Autowired
    private GrupoPrioridadesRepository grupoPrioridadeRepository;

    @GetMapping
    public List<GrupoPrioridades> listarTodos() {
        return grupoPrioridadeRepository.findAll();
    }

    @PostMapping
    public GrupoPrioridades cadastrarGrupoPrioridades(@RequestBody GrupoPrioridades grupoPrioridade) {
        return grupoPrioridadeRepository.save(grupoPrioridade);
    }

    @PutMapping("{codigo}")
    public GrupoPrioridades atualizar(@PathVariable("codigo") Long codigo,
            @RequestBody GrupoPrioridades grupoPrioridade) {
        return grupoPrioridadeRepository.findById(codigo).map(record -> {
            record.setDescricao(grupoPrioridade.getDescricao());
            record.setNome(grupoPrioridade.getNome());
            return grupoPrioridadeRepository.save(record);
        }).orElse(null);
    }

    @GetMapping("{codigo}")
    public GrupoPrioridades buscaPeloCodigo(@PathVariable long codigo) {
        return grupoPrioridadeRepository.findById(codigo).orElse(null);
    }
}
