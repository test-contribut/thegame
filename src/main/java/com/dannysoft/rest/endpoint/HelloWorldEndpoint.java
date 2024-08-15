package com.dannysoft.rest.endpoint;

import com.dannysoft.json.entity.TicTacToeMove;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldEndpoint {


    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping(value = "/hello/{var}")
    public String hello(@PathVariable String var) {
        return "Hello World " + var;
    }

    @PostMapping(value = "/move")
    public void makeMove(@RequestBody TicTacToeMove ticTacToeMove) {
        System.out.println(ticTacToeMove);
    }
}
