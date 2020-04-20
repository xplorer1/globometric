package com.globomatics.bike.controllers;

import com.globomatics.bike.models.Bike;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bike")
public class BikesController {
    @GetMapping
    public List<Bike> list() {
        return new ArrayList<>();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike) { }

    @GetMapping("/{id}")
    public Bike getOne(@PathVariable("id") long id) {
        return new Bike();
    }
}
