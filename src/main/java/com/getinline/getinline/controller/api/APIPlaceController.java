package com.getinline.getinline.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api")
@RestController
public class APIPlaceController {
    @GetMapping("/places")
    public List<String> getPlaces() {
        return List.of("place1", "place2");
    }

    @PostMapping("/places")
    public boolean createPlace(){
        return true;
    }

    @GetMapping("/places/{placeId}")
    public String getPlace(@PathVariable String placeId){
        return "place" + placeId;
    }

    @PutMapping("/places/{placeId}")
    public boolean modifyPlace(@PathVariable Integer placeId){
        return true;
    }

    @DeleteMapping("/places/{placeId}")
    public boolean removePlace(@PathVariable Integer placeId){
        return true;
    }

}

