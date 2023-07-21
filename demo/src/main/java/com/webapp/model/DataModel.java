/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.model;

/**
 *
 * @author Bijesh
 */
public class DataModel {

    private int id;
    private String title;
    private String Content;
    private String Author;
    private String Created_on;
    private String Image;

    public DataModel(String title, String Content, String Author) {
        this.title = title;
        this.Content = Content;
        this.Author = Author;
    }

    public DataModel(String title, String Content, String Author, String Image) {
        this.title = title;
        this.Content = Content;
        this.Author = Author;
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

    public DataModel() {
    }

}
