package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1")
public class St {
    @GetMapping()
    Map<Object, Object> m1() {
        Map<Object, Object> res = new HashMap<>();
        res.put("msg", "welcome to get api");
        res.put("status", 200);
        return res;
    }
    @PostMapping()
    Map<Object, Object> m2() {
        Map<Object, Object> res = new HashMap<>();
        res.put("msg", "welcome to Post api");
        res.put("status", 201);
        return res;
    }
}
