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

    @CrossOrigin(origins = "*", methods = {RequestMethod.POST})
    @PostMapping(value = "/addnew") //localhost:8080/users/addnew
    public void add(@RequestBody Users users){
        usersRepository.save(users);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping ("/display") //localhost:8080/users/display
    public  List<Users>display(){
        return usersRepository.findAll();
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping( "/display/{id}" ) //localhost:8080/users/display/id
    public Optional<Users> selectiveDisplay(@PathVariable("id") Integer id_users)
    {
        return usersRepository.findById(id_users);
    }
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET})
    @GetMapping( "/display/{userName}" ) //localhost:8080/users/display/username
    public Users selectiveDisplay(@PathVariable("userName") String userName)
    {
        return usersRepository.findByUserName(userName);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.DELETE})
    @DeleteMapping("/delete/{id}") //localhost:8080/users/delete/id
    public void remove(@PathVariable("id") Integer id_users){
        usersRepository.deleteById(id_users);
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.PUT})
    @PutMapping ("/update") //localhost:8080/users/update
    public void update(@RequestBody Users users) {
        usersRepository.save(users);
    }
}
