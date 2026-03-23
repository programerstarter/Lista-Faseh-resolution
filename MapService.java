package br.edu.faseh.lista.service;

import br.edu.faseh.lista.structure.FasehHashMap;

public class MapService {

    private FasehHashMap<String, Integer> map = new FasehHashMap<>();

    public void run() {
        map.put("A", 10);
        map.put("B", 20);
        map.put("A", 99);

        System.out.println("A: " + map.get("A"));
        map.remove("B");
        System.out.println("Size: " + map.size());
    }
}
