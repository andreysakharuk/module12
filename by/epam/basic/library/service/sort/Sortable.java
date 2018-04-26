package by.epam.basic.library.service.sort;

import by.epam.basic.library.entity.PrintedEdition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sortable {

    public ArrayList<PrintedEdition> sort(ArrayList<PrintedEdition> list, Comparator<PrintedEdition> comp) {
        Collections.sort(list, comp);
        return list;
    }
}
