package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsService {

    private final PartsRepository partsRepository;

    @Autowired
    public PartsService(PartsRepository partsRepository){
        this.partsRepository = partsRepository;
    }

    public List<Part> getParts(){
        return partsRepository.getParts();
    }

    public void addPart(Part part){
        partsRepository.addParts(part);
    }

    public Part getPart(int id){return partsRepository.getPart(id);}

    public void updatePart(int id, String name){partsRepository.updatePart(id, name);}

    public void deletePart(int id){
        partsRepository.deletePart(id);
    }
}
