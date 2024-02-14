package com.example.demo3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo3.model.Plans;
import com.example.demo3.service.ActivityService;

@RestController
@CrossOrigin
public class ActivityController {

    @Autowired
    private ActivityService service;

    @PostMapping("/postActivity")
    public Plans postActivity(@RequestBody Plans activity)
    {
        return service.postActivity(activity);
    }
    @GetMapping("/getActivity")
    public List<Plans> getActivity()
    {
        return service.getActivity();
    }
    @DeleteMapping("/deleteActivity/{id}")
    public void deleteActivity(int id)
    {
        service.deleteActivity(id);
    }
    @PutMapping("/updateActivity")
    public Plans updateActivity(@RequestBody Plans activity)
    {
        return service.updateActivity(activity);
    }
}
