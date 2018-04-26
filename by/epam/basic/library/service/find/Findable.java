package by.epam.basic.library.service.find;

import by.epam.basic.library.entity.PrintedEdition;

import java.util.ArrayList;

public interface Findable {

    public ArrayList<PrintedEdition> find(ArrayList<PrintedEdition> list);

}
