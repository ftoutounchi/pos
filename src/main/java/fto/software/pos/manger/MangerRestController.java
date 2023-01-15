package fto.software.pos.manger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MangerRestController {
    @GetMapping("/Bye")
    public String test(){
        return "Hello";
    }
}
