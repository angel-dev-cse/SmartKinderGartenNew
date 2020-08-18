package com.smartkindergarten.smartkindergarten.Model;

import android.support.annotation.Keep;

public class Content {
    private String title, author, content;

    @Keep
    public Content(String author, String content, String title) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Content() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
