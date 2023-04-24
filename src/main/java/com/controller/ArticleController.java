package com.controller;


import com.model.Article;
import com.service.articleSarviceLmpl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticleController {

    articleSarviceLmpl ArticleSarviceLmpl = new articleSarviceLmpl();


    public void createArticle(Article article){ArticleSarviceLmpl.save(article);};


    public void Remove(long id) {  ArticleSarviceLmpl.Remove(id);}


    @GetMapping("article/{id}")
    public Article findbyid ( @PathVariable long id){  return ArticleSarviceLmpl.findbyid(id);}


    @GetMapping("article")
    public List<Article> finALl1() {return ArticleSarviceLmpl.finALl();}



}
