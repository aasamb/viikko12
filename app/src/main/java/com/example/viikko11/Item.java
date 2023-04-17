package com.example.viikko11;

import java.util.Date;

public class Item {
    private String details;
    private Date date;

    public Item(String item)    {
        this.details = item;
        this.date = new Date();
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
}
