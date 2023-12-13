package com.demo.spring_testing_mockito.service;

import com.demo.spring_testing_mockito.model.Auto;
import com.demo.spring_testing_mockito.repository.IAutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService implements IAutoService{
    @Autowired
    private IAutoRepository repoAuto;


    @Override
    public List<Auto> getAutos() {
        List<Auto> listaAutos = repoAuto.findAll();
        return listaAutos;
    }

    @Override
    public void saveAuto(Auto auto) {
        repoAuto.save(auto);
    }

    @Override
    public void deleteAuto(Long id) {
        repoAuto.deleteById(id);
    }

    @Override
    public Auto findAuto(Long id) {
        Auto auto = repoAuto.findById(id).orElse(null);
        return auto;
    }

    @Override
    public void editAuto(Auto auto) {
        this.saveAuto(auto);
    }

}
