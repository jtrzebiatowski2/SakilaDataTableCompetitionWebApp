/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wctc.sakiladatatablecompetitionwebapp.managed.beans;

import edu.wctc.sakiladatatablecompetitionwebapp.ejb.FilmFacade;
import edu.wctc.sakiladatatablecompetitionwebapp.jsf.*;
import edu.wctc.sakiladatatablecompetitionwebapp.entity.Film;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author J-Tron
 */
@Named
@SessionScoped
public class FilmBean implements Serializable {
    @Inject
    private FilmFacade filmFacade;
    private List<Film> filmList;
    
    public FilmBean(){
    }
    
    @PostConstruct
    private void init(){
        getFilms();
    }
    private void getFilms(){
        filmList= filmFacade.findAll();
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }
 
}
