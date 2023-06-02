package wecare.care.Controller;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import wecare.care.DTO.Dados;

import wecare.care.Modal.Pessoa;
import wecare.care.Repository.extendRepository;




import java.util.List;


@RestController
@RequestMapping("/Teste")
@CrossOrigin(origins = "http://localhost:8080")
public class testeController {



    @Autowired
    
    private extendRepository repository;



    @Autowired
    private extendRepository LoginRepository;



    @PostMapping(value = "buscaDados")
    @Transactional
    public void Buscar(@RequestBody Dados dados){

        repository.save(new Pessoa(dados));
    }

    @GetMapping(value = "buscaget")
    public List<Pessoa> teste(){
       return repository.findAll();

    };
}

