import java.util.ArrayList;
import java.util.List;

public class Book {
    String Title;
    List<String> Paragraphs;
    List<String> Images;
    List<String> Tables;

    public Book(String Title){
        this.Title = Title;
        this.Paragraphs = new ArrayList<>();
        this.Images = new ArrayList<>();
        this.Tables = new ArrayList<>();
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public List<String> getParagraphs() {
        return Paragraphs;
    }

    public void setParagraphs(List<String> paragraphs) {
        Paragraphs = paragraphs;
    }

    public List<String> getImages() {
        return Images;
    }

    public void setImages(List<String> images) {
        Images = images;
    }

    public List<String> getTables() {
        return Tables;
    }

    public void setTables(List<String> tables) {
        Tables = tables;
    }

    public void createNewParagraph(String newParagraph){
        Paragraphs.add(newParagraph);
    }

    public void createNewImage(String newImage){
        Images.add(newImage);
    }

    public void createNewTable(String newTable){
        Tables.add(newTable);
    }

    @Override
    public String toString() {
        return "Book {\n" +
                "  Title='" + Title + '\'' +
                "\n  Paragraphs=" + String.join("\n", Paragraphs) +
                "\n  Images=" + String.join("\n", Images) +
                "\n  Tables=" + String.join("\n", Tables) +
                "\n}";
    }

    public void print(){
        System.out.print(this.toString());
    }
}
