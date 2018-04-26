package by.epam.basic.library.service.data;

import by.epam.basic.library.entity.Dictionary;
import by.epam.basic.library.entity.Library;
import by.epam.basic.library.entity.Poster;
import by.epam.basic.library.entity.NewsPaper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class LibraryReader {

    private Library library;

    public LibraryReader() {
        library = new Library();
    }

    public Library readLibraryFromFile(String pathToFile) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(pathToFile));
        ArrayList<String> params = new ArrayList<String>();
        while (sc.hasNextLine()) {
            params.add(sc.nextLine());
        }
        for (String pa : params) {
            String[] par = pa.split(", ");
            if (par[0].equals("Poster")) {
                library.addPrintEdition(new Poster(par[1], par[2], Integer.parseInt(par[3]), par[4]));
            } else if (par[0].equals("NewsPaper")) {
                library.addPrintEdition(new Dictionary(par[1], par[2], Integer.parseInt(par[3]), par[4], par[4]));
            } else if (par[0].equals("Dictionary")) {
                library.addPrintEdition(new NewsPaper(par[1], par[2], Integer.parseInt(par[3]), par[4]));
            }
        }
        sc.close();
        return library;
    }
}
