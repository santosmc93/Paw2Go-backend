package com.paw2go.adminsusers.admin;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin")
public class AdminRestController {

    private final AdminRepository adminRepository;

    public AdminRestController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.POST})
    @PostMapping("/newAdmin") //http://localhost:8080/admin/newAdmin
    public void add(@RequestBody Admin admin){
        adminRepository.save(admin);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping ("/display") //localhost:8080/admin/display
    public  List<Admin>display(){
        return adminRepository.findAll();
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping( "/display/{id}" ) //localhost:8080/admin/display/id
    public Optional<Admin> selectiveDisplay(@PathVariable("id") Integer id_admin)
    {
        return adminRepository.findById(id_admin);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.DELETE})
    @DeleteMapping("/delete/{id}") //localhost:8080/admin/delete/id
    public void remove(@PathVariable("id") Integer id_admin){
        adminRepository.deleteById(id_admin);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.PUT})
    @PutMapping ("/update") //localhost:8080/admin/update
    public void update(@RequestBody Admin admin) {
        adminRepository.save(admin);
    }
}