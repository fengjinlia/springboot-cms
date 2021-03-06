package com.leecp.jpa.model;
// Generated 2018-2-22 20:11:02 by Hibernate Tools 5.2.8.Final

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Topic generated by hbm2java
 */
@Entity
public class Topic implements java.io.Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;
    private String url;
    private Long ctime;

    public Topic() {
    }

    public Topic(String title, String description, String url, Long ctime) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.ctime = ctime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getCtime() {
        return this.ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

}
