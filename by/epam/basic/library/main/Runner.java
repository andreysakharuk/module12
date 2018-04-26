package by.epam.basic.library.main;

import by.epam.basic.library.entity.Library;
import by.epam.basic.library.entity.PrintedEdition;
import by.epam.basic.library.service.find.FindAction;
import by.epam.basic.library.service.find.FindByAuthor;
import by.epam.basic.library.service.find.FindByPrice;
import by.epam.basic.library.service.sort.PrintedEditionPriceComparator;
import by.epam.basic.library.service.sort.Sortable;
import by.epam.basic.library.view.print.PrintAsTable;
import by.epam.basic.library.service.data.LibraryReader;
import by.epam.basic.library.entity.Dictionary;
import by.epam.basic.library.entity.NewsPaper;
import by.epam.basic.library.service.sort.PrintedEditionNameComparator;
import by.epam.basic.library.view.ViewAction;
import by.epam.basic.library.view.print.PrintAsList;

import java.util.ArrayList;

public class Runner {

    public static void main(String args[]) throws Exception {

        Library library = new Library();
        library.addPrintEdition(new NewsPaper("Редактор 1", "РБК", 120, "новость 1"));
        library.addPrintEdition(new NewsPaper("Редактор 2", "РБК", 120, "новость 2"));
        library.addPrintEdition(new Dictionary("Даль", "Толковый словарь 1", 140, "термин1", "термин2"));
        library.addPrintEdition(new Dictionary("Даль", "Толковый словарь 2", 110, "термин1", "термин2"));
        library.addPrintEdition(new Dictionary("Даль", "Толковый словарь 3", 130, "термин1", "термин2"));
        ArrayList<PrintedEdition> listOfEditionsDefault = library.getLibrary();

        FindAction findAction = new FindAction();
        ArrayList<PrintedEdition> listOfEditionsFoundByAuthor = findAction.find(listOfEditionsDefault, new FindByAuthor("Даль"));
        ArrayList<PrintedEdition> listOfEditionsFoundByPrice = findAction.find(listOfEditionsDefault, new FindByPrice(120));

        ViewAction viewAction = new ViewAction();
        System.out.println("--------- Список всех книг в виде таблицы -----------------------------------------------");
        viewAction.print(listOfEditionsDefault, new PrintAsTable());

        System.out.println("--------- Список книг с ценой '120' в виде списка ---------------------------------------");
        viewAction.print(listOfEditionsFoundByPrice, new PrintAsList());

        System.out.println("--------- Список книг с автором 'Даль' в виде таблицы -----------------------------------");
        viewAction.print(listOfEditionsFoundByAuthor, new PrintAsTable());

        PrintedEditionNameComparator comparatorName = new PrintedEditionNameComparator();
        Sortable sortable = new Sortable();
        ArrayList<PrintedEdition> ListOfEditionsFoundByAuthorSorted = sortable.sort(listOfEditionsFoundByAuthor, comparatorName);
        System.out.println("--------- Список книг с автором 'Даль' отсортированных по 'Названию' в виде таблицы -----");
        viewAction.print(ListOfEditionsFoundByAuthorSorted, new PrintAsTable());

        PrintedEditionPriceComparator comparatorPrice = new PrintedEditionPriceComparator();
        System.out.println("--------- Список книг с автором 'Даль' отсортированных по 'Цене' в виде таблицы ---------");
        ArrayList<PrintedEdition> ListOfEditionsFoundByPriceSorted = sortable.sort(listOfEditionsFoundByAuthor, comparatorPrice);
        viewAction.print(ListOfEditionsFoundByPriceSorted, new PrintAsTable());

        LibraryReader libraryReader = new LibraryReader();
        Library library1 = libraryReader.readLibraryFromFile("C:\\Users\\Andrei_Sakharuk\\Desktop\\LibraryData.txt");
        ArrayList<PrintedEdition> listOfEditions1 = library1.getLibrary();
        System.out.println("--------- Список всех книг считанных с файла в виде таблицы -----------------------------");
        viewAction.print(listOfEditions1, new PrintAsTable());
    }
}







