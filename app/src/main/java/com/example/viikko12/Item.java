package com.example.viikko12;

import java.util.Date;

public class Item {
    private String details;
    private Date date;
    private boolean starred = false;

    public Item(String item, boolean starred)    {
        this.details = item;
        this.date = new Date();
        this.starred = starred;
    }

    public String getDetails() {
        return details;
    }

    public Date getDate() {
        return date;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isStarred() {
        return starred;
    }
}
