package com.demo.spring_testing_mockito.controller;

import com.demo.spring_testing_mockito.model.Auto;
import com.demo.spring_testing_mockito.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AutoController {

    @Autowired
    private AutoService autoServ;


    /* End Points */
    @GetMapping("/autos/traerautos")
    public List<Auto> getAutos(){
        return autoServ.getAutos();
    }

    @PostMapping("/autos/crear")
    public String saveAuto(@RequestBody Auto auto){
        autoServ.saveAuto(auto);
        return "Auto cargado Exitosamente!";
    }

    @DeleteMapping("/autos/borrar/{id}")
    public String deleteAuto(@PathVariable Long id){
        autoServ.deleteAuto(id);
        return "Auto |Eliminado| Correctamente!";
    }

    @GetMapping("/autos/traeruno/{id}")
    public Auto findAuto(@PathVariable Long id){
        return autoServ.findAuto(id);
    }

    @PutMapping("/autos/editar")
    public String editAuto(@RequestBody Auto auto){
        autoServ.editAuto(auto);
        return "Auto Editado Correctamente!";
    }
}
