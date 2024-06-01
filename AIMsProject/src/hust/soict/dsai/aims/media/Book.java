package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

    private List<String> authors = new ArrayList<String>();

    
    public Book(String title, String category, float cost, List<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public void addAuthor(String authorName){
        if (!authors.contains(authorName)){
            authors.add(authorName);
        }
        else{
            System.out.println("Author is already added");
        }
    }

    public void removeAuthor(String authorName){
        if (authors.contains(authorName)){
            authors.remove(authorName);
        }
        else{
            System.out.println(" The author is not in the list of authors");
        }
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString(){
        return String.format("Book - [%s] - [%s] - [%s]: [%.2f] $ " , this.getTitle(), this.getCategory(), this.getAuthors().toString(), this.getCost()); 
    }

}
