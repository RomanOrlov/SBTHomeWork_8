package ru.sbt.orlov.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author r.orlov
 */
class Message {
    private Date sended;
    private User sendedBy;
    private String text;
    private List<Resource> contents;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public Date getSended() {
        return sended;
    }

    public void setSended(Date sended) {
        this.sended = sended;
    }

    public User getSendedBy() {
        return sendedBy;
    }

    public void setSendedBy(User sendedBy) {
        this.sendedBy = sendedBy;
    }

    public List<Resource> getContents() {
        return contents;
    }

    public void setContents(List<Resource> contents) {
        this.contents = contents;
    }
}
