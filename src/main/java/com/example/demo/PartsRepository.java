package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PartsRepository {

    private ArrayList<Part> parts = new ArrayList<>();

    public PartsRepository(){
        parts.add(new Part("wololo"));
        parts.add(new Part("woah"));
        parts.add(new Part("harkinian"));


    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void updatePart(int id, String name){
        parts.remove(id);
        parts.add(new Part(name));
    }

    public Part getPart(int id) {
        return parts.get(id);
    }

    public void addParts(Part part) {
        parts.add(part);
    }

    public void deletePart(int id){
        parts.remove(id);
    }
}
