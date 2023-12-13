package com.demo.spring_testing_mockito.service;

import com.demo.spring_testing_mockito.model.Auto;

import java.util.List;

public interface IAutoService {

    /*Metodos CRUD*/

    /*Listado de Autos*/
    public List<Auto> getAutos();

    /*Crear Auto*/
    public void saveAuto(Auto auto);

    /*Borrar Auto*/
    public void deleteAuto(Long id);

    /*Buscar un Auto*/
    public Auto findAuto(Long id);

    /*Editar un Auto*/
    public void editAuto(Auto auto);

}
