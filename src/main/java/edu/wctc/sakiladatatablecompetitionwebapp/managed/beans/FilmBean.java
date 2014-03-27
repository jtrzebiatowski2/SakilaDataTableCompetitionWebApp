package edu.wctc.sakiladatatablecompetitionwebapp.managed.beans;

import edu.wctc.sakiladatatablecompetitionwebapp.ejb.FilmFacade;
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
 * 
 */
@Named("filmBean")
@SessionScoped
public class FilmBean implements Serializable {

    private Film current;
    private List<Film> listOfFilms;
    private int selectedItemIndex;
    private Film selectedFilm;
    private List<Film> filteredFilms;

    @Inject
    FilmFacade filmFacade;

    public FilmBean() {
    }

    @PostConstruct
    public void init() {
        listOfFilms = filmFacade.findAll();
    }

    public Film getCurrent() {
        return current;
    }

    public void setCurrent(Film current) {
        this.current = current;
    }

    public List<Film> getListOfFilms() {
        return listOfFilms;
    }

    public void setListOfFilms(List<Film> listOfFilms) {
        this.listOfFilms = listOfFilms;
    }

    public int getSelectedItemIndex() {
        return selectedItemIndex;
    }

    public void setSelectedItemIndex(int selectedItemIndex) {
        this.selectedItemIndex = selectedItemIndex;
    }

    public FilmFacade getFilmFacade() {
        return filmFacade;
    }

    public void setFilmFacade(FilmFacade filmFacade) {
        this.filmFacade = filmFacade;
    }

    public Film getSelectedFilm() {
        return selectedFilm;
    }

    public void setSelectedFilm(Film selectedFilm) {
        this.selectedFilm = selectedFilm;
    }

    public List<Film> getFilteredFilms() {
        return filteredFilms;
    }

    public void setFilteredFilms(List<Film> filteredFilms) {
        this.filteredFilms = filteredFilms;
    }
    

}