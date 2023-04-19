package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String title;
    private Date moment;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();



    public Post(String title, Date moment, String content, Integer likes) {
        this.title = title;
        this.moment = moment;
        this.content = content;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComments(Comment comment){
        comments.add(comment);
    }
    public void removeComments(Comment comment){
        comments.remove(comment);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + " - ");
        sb.append(moment + "\n");
        sb.append(content + "\n");
        System.out.println("Comments: " );
        for (Comment c : comments
                ) {
            sb.append(c.getText());
        }
        return sb.toString();
    }
}
