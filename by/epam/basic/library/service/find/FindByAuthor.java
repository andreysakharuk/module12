package by.epam.basic.library.service.find;

import by.epam.basic.library.entity.PrintedEdition;

import java.util.ArrayList;

public class FindByAuthor implements Findable {

    private String author;

    public FindByAuthor(String author) {
        this.author = author;
    }

    public ArrayList<PrintedEdition> find(ArrayList<PrintedEdition> list) {
        ArrayList<PrintedEdition> print = new ArrayList<PrintedEdition>();
        for (PrintedEdition pr : list) {
            if (pr.getAuthor().equals(this.author)) {
                print.add(pr);
            }
        }
        return print;
    }
}
