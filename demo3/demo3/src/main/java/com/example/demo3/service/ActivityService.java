package com.example.demo3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo3.model.Plans;
import com.example.demo3.repository.ActivityRepository;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository repo;
    public Plans postActivity(Plans activity)
    {
        return repo.save(activity);
    }
    public List<Plans> getActivity()
    {
        return repo.findAll();
    }
    public void deleteActivity(int id)
    {
        repo.deleteById(id);
    }
    public Plans updateActivity(Plans activity)
    {
        return repo.saveAndFlush(activity);
    }
}
