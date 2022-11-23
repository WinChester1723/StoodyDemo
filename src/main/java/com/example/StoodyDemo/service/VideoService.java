package com.example.StoodyDemo.service;

import com.example.StoodyDemo.model.entity.Video;
import com.example.StoodyDemo.model.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VideoService {

    @Autowired
    private final VideoRepository videoRepository;

    public List<Video> findAll(){
        return videoRepository.findAll();
    }

    public List<Video> findAllById(Iterable<Long> longs){
        return videoRepository.findAllById(longs);
    }

    public Optional<Video> findById(Long l){
        return videoRepository.findById(l);
    }

    @Transactional
    public Video create(Video video){
        return videoRepository.save(video);
    }

    public void deleteById(Long l){
        videoRepository.deleteById(l);
    }

    public void delete(Video video){
        videoRepository.delete(video);
    }

}
