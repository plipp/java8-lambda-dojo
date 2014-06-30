package java8.streams_2.exercises;

import java8.testdata_0.Album;
import java8.testdata_0.SampleData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java8.testdata_0.SampleData.*;
import static org.junit.Assert.assertEquals;

public class BasicStreamOperations_1Test {
    @Test
    public void addsEmptyList() {
        int result = BasicStreamOperations_1.addUp(Stream.empty());
        assertEquals(0, result);
    }

    @Test
    public void addsListWithValues() {
        int result = BasicStreamOperations_1.addUp(Stream.of(1, 3, -2));
        assertEquals(2, result);
    }

    @Test
    public void extractsNamesAndOriginsOfArtists() {
        List<String> namesAndOrigins = BasicStreamOperations_1.getNamesAndOrigins(SampleData.getThreeArtists());
        assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"), namesAndOrigins);
    }

    @Test
    public void findsShortAlbums() {
        List<Album> input = asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme);
        List<Album> result = BasicStreamOperations_1.getAlbumsWithAtMostThreeTracks(input);
        assertEquals(asList(sampleShortAlbum, aLoveSupreme), result);
    }

}