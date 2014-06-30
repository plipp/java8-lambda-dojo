package java8.streams_2.exercises;

import java8.testdata_0.Artist;
import java8.testdata_0.SampleData;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class WhatsBetterStyle_0 {
    public static void main(String[] args) {
        // A
        List<Artist> musicians = SampleData.manyTrackAlbum.getMusicians()
                .collect(toList());
        List<Artist> bands = musicians.stream()
                .filter(artist -> artist.getName().startsWith("The"))
                .collect(toList());
        Set<String> origins1 = bands.stream()
                .map(artist -> artist.getNationality())
                .collect(toSet());


        // -------------------------------------
        // or B
        Set<String> origins2 = SampleData.manyTrackAlbum.getMusicians()
                .filter(artist -> artist.getName().startsWith("The"))
                .map(artist -> artist.getNationality())
                .collect(toSet());

    }
}
