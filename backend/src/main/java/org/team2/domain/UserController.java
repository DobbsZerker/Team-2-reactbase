//package org.team2.domain;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//
//@RestController
//public class UserController {
//
//
//    @Autowired
//    UserRepo userRepo;
//
//    @GetMapping("/user")
//    public List<User> index(){return userRepo.findAll();}
//
//    @PostMapping("user/search")
//    public List<User> search(@RequestBody Map<String, String> body){
//    String searchTerm = body.get("username");
//    return userRepo.FindUsername(searchTerm);
//    }
//}
