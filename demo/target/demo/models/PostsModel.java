/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.electron7.internsathimvc.models;

/**
 *
 * @author bijes
 */
public class PostsModel {
        private int id;
    private String title;
    private String Content;
    private String Author;
    private String Created_on;
    private String Image;

    public PostsModel(int id, String title, String Content, String Author, String Created_on, String Image) {
        this.id = id;
        this.title = title;
        this.Content = Content;
        this.Author = Author;
        this.Created_on = Created_on;
        this.Image = Image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getCreated_on() {
        return Created_on;
    }

    public void setCreated_on(String Created_on) {
        this.Created_on = Created_on;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

}
