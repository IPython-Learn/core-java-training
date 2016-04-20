package com.innominds.functional;

import java.util.Date;

public class Training {

    private String title;

    private Date date;

    public Training() {
    }

    public Training(String title, Date date) {

        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Training [");
        if (title != null) {
            builder.append("title=");
            builder.append(title);
            builder.append(", ");
        }
        if (date != null) {
            builder.append("date=");
            builder.append(date);
        }
        builder.append("]");
        return builder.toString();
    }

}
