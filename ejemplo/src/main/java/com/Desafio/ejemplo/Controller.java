package com.Desafio.ejemplo;

import com.Desafio.Controller.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Desafio.Controller.welcome;

import java.util.ArrayList;
import java.util.LinkedList;

@RestController
@Service
public class Controller {
	@Autowired
    private welcome Welcome;
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return Welcome.getWelcomeMessage();
    }

    @GetMapping("/")
    public String getList(){
        return "list.html";
    }

}
