package com.example.StoodyDemo.controller;

import com.example.StoodyDemo.model.entity.Video;
import com.example.StoodyDemo.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/video")
@RequiredArgsConstructor
public class VideoTestController {
    @Autowired
    private final VideoService videoService;

    @PostMapping("/create")
    public Video createVideo(@RequestBody Video video) {
        return videoService.create(video);
    }

    @GetMapping("/show-all")
    public List<Video> findAll() {
        return videoService.findAll();
    }

    @GetMapping("show-all/id/{id}")
    public Optional<Video> findById(@PathVariable Long id) {
        return videoService.findById(id);
    }

    @PostMapping("/delete-video")
    public void deleteVideo(@RequestBody Video video) {
        videoService.delete(video);
    }

    @PostMapping("/delete-video/id/{id}")
    public void deleteById(@PathVariable Long id) {
        videoService.deleteById(id);
    }
}
