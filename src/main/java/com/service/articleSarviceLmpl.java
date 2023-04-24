package com.service;

import com.model.Article;
import com.repository.repositorylmpl;

import java.util.List;

public class articleSarviceLmpl {

    repositorylmpl Repositorylmpl = new repositorylmpl();

    public List<Article> finALl() {return Repositorylmpl.finALl();}

    public void Remove(long id) {  Repositorylmpl.Remove(id);}

    public Article findbyid (long id){ return Repositorylmpl.findbyid(id);}

    public void save(Article article){ Repositorylmpl.save(article);}


};

