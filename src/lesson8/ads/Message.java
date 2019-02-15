package lesson8.ads;

import java.util.Date;

public class Message extends BaseEntity{

    public User userFrom;
    public String message;
    public User userTo;
    public Date dateSent;
    public Date dateRead;


    public Message(long id, User userFrom, String message, User userTo) {

        super(id);
        this.userFrom = userFrom;
        this.message = message;
        this.userTo = userTo;
        this.dateSent = new Date();
    }

    public void setDateRead() {
        dateRead = new Date();
    }

    public boolean isRead() {

        return dateRead == null;
    }
}

