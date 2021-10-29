package com.paw2go.adminsusers.users;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UsersRestController {

    private final UsersRepository usersRepository;

    public UsersRestController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @PostMapping(value = "/addnew") //localhost:8080/users/addnew
    public void add(@RequestBody Users users){
        usersRepository.save(users);
    }

    @GetMapping ("/display") //localhost:8080/users/display
    public  List<Users>display(){
        return usersRepository.findAll();
    }

    @GetMapping( "/display/{id}" ) //localhost:8080/users/display/id
    public Optional<Users> selectiveDisplay(@PathVariable("id") Integer id_users)
    {
        return usersRepository.findById(id_users);
    }

    @DeleteMapping("/delete/{id}") //localhost:8080/users/delete/id
    public void remove(@PathVariable("id") Integer id_users){
        usersRepository.deleteById(id_users);
    }

    @PutMapping ("/update") //localhost:8080/users/update
    public void update(@RequestBody Users users) {
        usersRepository.save(users);
    }
}
