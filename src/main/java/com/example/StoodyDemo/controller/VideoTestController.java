package com.example.StoodyDemo.controller;

import com.example.StoodyDemo.model.entity.Video;
import com.example.StoodyDemo.model.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/video")
@RequiredArgsConstructor
public class VideoTestController {

    private final VideoRepository videoRepository;

    @PostMapping("/create")
    public Video createVideo(@RequestBody Video video){
        return videoRepository.save(video);
    }

    @GetMapping("/show-all")
    public List<Video> findAll(){
        return videoRepository.findAll();
    }

    @GetMapping("show-all/id/{id}")
    public Optional<Video> findById(@PathVariable Long id){
        return videoRepository.findById(id);
    }

    @DeleteMapping("/delete-video")
    public void deleteVideo(@RequestBody Video video){
        videoRepository.delete(video);
    }

    @DeleteMapping("/delete-video/id/{id}")
    public void deleteById(@PathVariable Long id){
        videoRepository.deleteById(id);
    }
}
