package com.question4;

import java.util.ArrayList;
import java.util.List;

public class Netflix {
    public List<Genre> myList;

    public Netflix(){
        myList = new ArrayList<>();
    }

    public boolean addGenre(Genre genre){
        myList.add(genre);
        return true;
    }
}
