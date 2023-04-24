package com.repository;

import com.model.Article;
import com.model.sequnse;

import java.util.ArrayList;
import java.util.List;

public class repositorylmpl {

    private List<Article> articles = new ArrayList<>();


    public repositorylmpl() {
        this.articles = articles;
    }

    public List<Article> finALl() {

        return articles;
    }

    public void Remove(long id) {

        List<Article> newArticle = new ArrayList<>();

        for (Article article : articles) {

            if (article.getId() != id) {
                newArticle.add(article);

            }
        }
        newArticle = articles;
    }

    public Article findbyid (long id){
        for(Article article : articles){
        if(article.getId() == id){
            return article;
        }}
        return null;
    }

    public void save(Article article){
        long id=sequnse.getSequnse1();
        article.setId(id);
        articles.add(article);
    }


}
