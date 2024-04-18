package org.example.motorvong2_meddatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {
    @Autowired
    private MotorvognRepository repository;

    @GetMapping("/hentbiler")
    public List<Bil> hentbiler(){
        return repository.hentbiler();
    }

    @PostMapping("/add")
    public void add(Motorvogn motorvong){
        repository.add(motorvong);
    }
    @GetMapping("/hentalle")
    public List<Motorvogn> hentAlleMotorvong(){
        return repository.hentMotorvogn();
    }
    @GetMapping("/slett")
    public void sletAlleMotorvong(){
        repository.slettAlle();
    }

}
