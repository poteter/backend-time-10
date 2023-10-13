package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class PartsController {

    @Autowired
    private PartsService partsService;

    @GetMapping("/parts")
    public ResponseEntity<List<Part>> getParts(){
        //var bigPart = new BigPart.builder()
        return ResponseEntity.ok(partsService.getParts());
    }

    @GetMapping("/part")
    public Part getPart(@RequestParam int id){
        return partsService.getPart(id);
    }

    @PutMapping("/part")
    public void updatePart(@RequestParam int id, String name){
        partsService.updatePart(id, name);
    }

    @PostMapping("/part")
    public void addPart(@RequestBody Part part){
        partsService.addPart(part);
    }

    @DeleteMapping("/part")
    public void deletePart(@RequestParam int id){
        partsService.deletePart(id);
    }

}
