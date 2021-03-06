package kr.co.patternbot.controllers;

import kr.co.patternbot.domains.User;
import kr.co.patternbot.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.co.patternbot.controllers
 * fileName     : UserController
 * author       : 전종현
 * date         : 2022-05-03
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03        전종현       최초 생성
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;


    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return service.login(user);
        }
    @GetMapping("/logout")
    public String logout() {
        return "";
        }
    @GetMapping("/findAll")
    public List<User> findAll() {
        return service.findAll();
    }
    @GetMapping("/findAll/sort")
    public List<User> findAll(Sort sort) {
        return service.findAll(sort);
    }
    @GetMapping("/findAll/pageable")
    public Page<User> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
    @GetMapping("/count")
    public long count() {
        return service.count();
    }
    @PutMapping("/put")
    public String put(@RequestBody User user) {
        service.put(user);
        return "";

    }
    @DeleteMapping("/delete")
    public String delete(@RequestBody User user) {
        service.delete(user);
        return "";
    }
    @PostMapping("/join")
    public String save(@RequestBody User user) {  
        service.save(user);
        return "";
    }
    @GetMapping("/findById/{userid}")
    public Optional<User> findById(@PathVariable String userid) {
        return service.findById(userid);
    }
    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String userid) {
        return service.existsById(userid);
    }
    @PostMapping("/getOne/{id}")
    public User getOne(@PathVariable Long id) {
        return service.getOne(id);
    }

}



