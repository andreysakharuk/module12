package by.epam.basic.library.service.sort;

import by.epam.basic.library.entity.PrintedEdition;

import java.util.Comparator;

public class PrintedEditionNameComparator implements Comparator<PrintedEdition> {

    public int compare(PrintedEdition obj1, PrintedEdition obj2) {
        if (obj1.getName() == null) {
            return -1;
        }
        if (obj2.getName() == null) {
            return 1;
        }
        if (obj1.getName().equals(obj2.getName())) {
            return 0;
        }
        return obj1.getName().compareTo(obj2.getName());
    }
}
