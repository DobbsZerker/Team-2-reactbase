//package org.team2.domain;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//
//@Controller
//public class UserController {
//
//
//    @Autowired
//    private UserRepo userRepo;
//
//    @GetMapping("/user")
//    public Iterable<User> index(){return userRepo.findAll();}
//
//    @PostMapping("user/search")
//    public List<User> search(@RequestBody Map<String, String> body){
//    String searchTerm = body.get("username");
//    return userRepo.FindUsername(searchTerm);
//    }
//
//    @PostMapping("user/register")
//    public List<User> adduser(@RequestBody Map<String, String> body, Map <Integer, Integer> body2, Map<Boolean, Boolean> body3){
//        String username = body.get("username");
//        String password = body.get("password");
//        Integer id = body2.get("id");
//        Boolean authorized = body3.get("authorized");
//
//        return userRepo.addUser(username, password, id, authorized);
//    }
//}
