package com.example.demo3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo3.model.Activity;
import com.example.demo3.service.Bookingservice;

@RestController
@CrossOrigin
public class Bookingcontroller {

    @Autowired
    private Bookingservice bookservice;

    @GetMapping("/getBooking")
    public List<Activity> getAllBooking()
    {
        return bookservice.getAllBooking();
    }

    @PostMapping("/postBooking")
    public String postBooking(@RequestBody Activity book)
    {
        return bookservice.postBooking(book);
    }
    
     @PutMapping("/updateBooking")
    public Activity updateBook(@RequestBody Activity book)
    {
        return bookservice.updateBook(book);
    }
    @DeleteMapping("/deleteBooking/{id}")
    public void deleteBooking(@PathVariable int id)
    {
        bookservice.deleteBooking(id);
    }

   

}
