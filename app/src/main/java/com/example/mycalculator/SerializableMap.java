package com.example.mycalculator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SerializableMap implements Serializable {

    private HashMap<String, ArrayList<String>> map;

    public HashMap<String, ArrayList<String>> getMap() {
        return map;
    }

    public void setMap(HashMap<String, ArrayList<String>> map)
    {
        this.map = map;
    }
}
