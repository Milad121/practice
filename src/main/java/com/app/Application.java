package com.app;

import com.controller.ArticleController;
import com.model.Article;

public class Application {

    public static void main(String[] args) {
        ArticleController articleController = new ArticleController();

        Article article1 = new Article(10 , "ali"  );
        Article article2 = new Article(22 , "morad");
        Article article3 = new Article(11 , "mm");

        articleController.createArticle(article1);
        articleController.createArticle(article2);
        articleController.createArticle(article3);


        for (Article article : articleController.finALl1()){
            System.out.println(article);

        }
        System.out.println("----------------------------------------------------");

    }


}
