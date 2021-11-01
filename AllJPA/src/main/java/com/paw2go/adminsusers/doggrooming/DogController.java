package com.paw2go.adminsusers.doggrooming;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("doggrooming")
public class DogController {


    private final DogDAO dogDAO;

    public DogController(DogDAO dogDAO) {

        this.dogDAO = dogDAO;
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.POST})
    @PostMapping("/guardar")//localhost:8080/doggrooming/guardar
    public ResponseEntity<Object> guardar(@RequestBody Doggrooming doggrooming) {

        dogDAO.save(doggrooming);
        return new ResponseEntity<>( "Dog appointmet with id " + doggrooming.getId_dog() + " and name " + doggrooming.getDog_name() + " was successfully created",HttpStatus.CREATED);
    }
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping("/listar")//localhost:8080/doggrooming/listar
    public List<Doggrooming> listar() {

        return dogDAO.findAll();
    }
    @CrossOrigin(origins = "*", methods = {RequestMethod.DELETE})
    @DeleteMapping("/eliminar/{id}")//localhost:8080/doggrooming/eliminar/1
    public void eliminar(@PathVariable("id") Integer dog_id) {

        dogDAO.deleteById(dog_id);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.PUT})
    @PutMapping("/actualizar")//localhost:8080/doggrooming/actualizar
    public void actualizar(@RequestBody Doggrooming doggrooming) {

        dogDAO.save(doggrooming);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping("/display/{id}")//localhost:8080/doggrooming/display/id
    public Optional<Doggrooming> selectiveDisplay(@PathVariable("id") Integer id_dog) {
        return dogDAO.findById(id_dog);
    }
}