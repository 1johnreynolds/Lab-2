package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;


public class pub_info {
    private Long pid;
    private String Title;
    public String mdate;
    public String author;
    public String author_list;
    public String article_key;
    public String editors;
    public String pages;
    public String ee;
    public String pub_url;
    public int pub_year;
    public String journal;
    public String book_title;
    public int volume;
    public int pub_number;
    public String publisher;
    public String isbn;
    public String series;
    public String cross_ref;

    //private String Metadata;

    //private Long Id;

    //public String getId() { return Long.toString(Id);}

    public Long getID() {
        return pid;
    }

    public void setID(Long pid) {
        this.pid = pid;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor_list() {
        return author_list;
    }

    public void setAuthor_list(String author_list) {
        this.author_list = author_list;
    }

    public String getArticle_key() {
        return article_key;
    }

    public void setArticle_key(String article_key) {
        this.article_key = article_key;
    }

    public String getEditors() {
        return editors;
    }

    public void setEditors(String editors) {
        this.editors = editors;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getEe() {
        return ee;
    }

    public void setEe(String ee) {
        this.ee = ee;
    }

    public String getPub_url() {
        return pub_url;
    }

    public void setPub_url(String pub_url) {
        this.pub_url = pub_url;
    }

    public int getPub_year() {
        return pub_year;
    }

    public void setPub_year(int pub_year) {
        this.pub_year = pub_year;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPub_number() {
        return pub_number;
    }

    public void setPub_number(int pub_number) {
        this.pub_number = pub_number;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getCross_ref() {
        return cross_ref;
    }

    public void setCross_ref(String cross_ref) {
        this.cross_ref = cross_ref;
    }


    //public void setId(String id) {
    //    this.Id = Long.parseLong(id);
    //}

    public CompletionStage<WSResponse> checkAuthorized() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add Title
        WSRequest request = ws.url("http://localhost:9005/query1Response");
        ObjectNode res = Json.newObject();
        res.put("Title", this.Title);
        //res.put("Id", this.Id);

        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }


}
