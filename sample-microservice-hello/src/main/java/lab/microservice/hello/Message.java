package lab.microservice.hello;

import java.time.LocalDate;


public class Message {
    public String text ;
    public String anthor;
    public LocalDate date;

    public Message(){

    }

    public Message(String text, String anthor, LocalDate date) {
        this.text = text;
        this.anthor = anthor;
        this.date = date;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getAnthor() {
        return anthor;
    }
    public void setAnthor(String anthor) {
        this.anthor = anthor;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
}
