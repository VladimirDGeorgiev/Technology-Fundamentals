package Objectandclass.Articles_2_0;

public class Articles2 {
    private String title;
    private String content;
    private String author;

    public Articles2(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String toString() {
        return String.format("%s - %s: %s", this.getTitle(), this.getContent(), this.getAuthor());
    }

    public void rename(String title) {
        this.title = title;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public void edit(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
