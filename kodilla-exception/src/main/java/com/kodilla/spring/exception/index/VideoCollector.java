package com.kodilla.spring.exception.index;

import java.util.ArrayList;
import java.util.List;

public class VideoCollector {
    public List<String> getCollection() {
        ArrayList<String> videos = new ArrayList<>();
        videos.add("Extra movie");
        return videos;
    }

}
