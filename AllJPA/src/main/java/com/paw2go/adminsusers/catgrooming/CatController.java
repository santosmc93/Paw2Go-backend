package com.paw2go.adminsusers.catgrooming;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("catgrooming")
public class CatController {


    private final CatDAO catDAO;

    public CatController(CatDAO catDAO) {

        this.catDAO = catDAO;
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.POST})
    @PostMapping("/guardar")//localhost:8080/catgrooming/guardar
    public void guardar(@RequestBody Catgrooming catGrooming) {

        catDAO.save(catGrooming);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping("/listar")//localhost:8080/catgrooming/listar
    public List<Catgrooming> listar() {

        return catDAO.findAll();
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.DELETE})
    @DeleteMapping("/eliminar/{id}")//localhost:8080/catgrooming/eliminar/1
    public void eliminar(@PathVariable("id") Integer cat_name) {

        catDAO.deleteById(cat_name);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.PUT})
    @PutMapping("/actualizar")//localhost:8080/catgrooming/actualizar
    public void actualizar(@RequestBody Catgrooming catgrooming) {

        catDAO.save(catgrooming);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping("/display/{id}")//localhost:8080/catgrooming/display/id
    public Optional<Catgrooming> selectiveDisplay(@PathVariable("id") Integer id_cat) {
        return catDAO.findById(id_cat);
    }
}
