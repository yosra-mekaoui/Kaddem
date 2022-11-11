package com.example.demo.Controller;

import com.example.demo.Entities.DetailEquipe;
import com.example.demo.Service.IDetailEquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/DetailEquipe")
public class DetailEquipeController {

    @Autowired
    IDetailEquipeService iDetailEquipeService ;


    @PostMapping("/add")
    @ResponseBody
    public void addDetailEquipe(@RequestBody DetailEquipe D) {
        iDetailEquipeService.addDetailEquipe(D);
    }



    @GetMapping("/DetailEquipes")
    public List<DetailEquipe> getAllDE() {
        return  iDetailEquipeService.getAllDE();
    }


}
