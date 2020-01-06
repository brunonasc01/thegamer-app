package br.com.method.thegamer.api;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dificuldade")
public class DifficultyApi {

    @GetMapping()
    public String getDifficulty(
        @RequestParam(value = "age", required = true) Integer age,
        @RequestParam(value = "time", required = true) LocalTime time
    ){
       return "Age: "+age+ "Time: "+time.toString();
    }
}