package com.example.projetojavafx.service;

import com.example.projetojavafx.model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {
    public List<Department> findAll(){
        List<Department> list = new ArrayList<Department>();
        list.add(new Department(1, "Livros"));
        list.add(new Department(2, "Computadores"));
        list.add(new Department(3, "Celulares"));
        list.add(new Department(4, "Ecritório"));
        list.add(new Department(5, "Papelaria"));
        list.add(new Department(6, "TV e Vídeo"));

        return list;
    }
}
