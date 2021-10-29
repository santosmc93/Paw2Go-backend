package com.paw2go.adminsusers.products;



import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductsRestController {

    private final ProductsRepository productsRepository;

    public ProductsRestController ( ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @PostMapping("/newProduct") //localhost:8080/products/newProduct
    public void add(@RequestBody Products products){
        productsRepository.save(products);
    }

    @GetMapping ("/display") //localhost:8080/products/display
    public  List<Products>display(){
        return productsRepository.findAll();
    }

    @GetMapping( "/display/{id}" ) //localhost:8080/products/display/id
    public Optional<Products> selectiveDisplay(@PathVariable("id") Integer id_product)
    {
        return productsRepository.findById(id_product);
    }

    @DeleteMapping("/delete/{id}") //localhost:8080/products/delete/id
    public void remove(@PathVariable("id") Integer id_product){
        productsRepository.deleteById(id_product);
    }

    @PutMapping ("/update") //localhost:8080/products/update
    public void update(@RequestBody Products products) {
        productsRepository.save(products);
    }
}