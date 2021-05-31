package com.example.prac_11;
import lombok.ToString;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.Size;
@RestController
@ToString
public class Student {
    @Size(min=2, max=50)
    private String name="Artyuh Eugene";

    @RequestMapping("/Student")
    public String Get(){
        return name;
    }
}
