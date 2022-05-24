package aptecht2008m.jwt.controller;

import aptecht2008m.jwt.entity.Articles;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    public static List<Articles> articles;

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public String helloUser () {
        return "hello account with role user";
    }
}
