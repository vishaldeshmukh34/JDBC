package com.servise;

import com.dao.Studentdao;
import com.entities.Studententities;

public class Studentservise {

    public void insertStudent(Studententities s) throws Exception {
        Studentdao dao = new Studentdao();
        dao.insertStudent(s);
    }
}
