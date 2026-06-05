package com.example.demo.model;

import java.util.List;

public class ArchitectureModel {

    private List<String> entities;
    private List<String> pages;

    public List<String> getEntities() {
        return entities;
    }

    public void setEntities(List<String> entities) {
        this.entities = entities;
    }

    public List<String> getPages() {
        return pages;
    }

    public void setPages(List<String> pages) {
        this.pages = pages;
    }
}