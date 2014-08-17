package java8.advanced_collections_4;

import java8.testdata_0.Album;
import java8.testdata_0.Artist;
import java8.testdata_0.SampleData;
import java8.testdata_0.Track;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class AdvancedCollectors_1 {
  public static void main(String[] args) {
    toCollections();
    minBy();
    average();
    partition();
    grouping();
    stringConcatenation();
  }

  private static void toCollections() {
    List<Track> shortTracks = SampleData.aLoveSupreme.getTracks().filter(t -> t.getLength() < 450).collect(toList());
//    System.out.println(shortTracks);

    Set<Track> trackSet =  SampleData.manyTrackAlbum.getTracks().collect(toCollection(HashSet::new));
//    System.out.println(trackSet);
  }

  private static void minBy() {
    Optional<Track> shortestTrack1 = SampleData.aLoveSupreme.getTracks().min(Comparator.comparing(t -> t.getLength()));
//    System.out.println("shortestTrack1 = " + shortestTrack1);

    Optional<Track> shortestTrack2 = SampleData.aLoveSupreme.getTracks().collect(Collectors.minBy(Comparator.comparing(t -> t.getLength())));
//    System.out.println("shortestTrack2 = " + shortestTrack2);
  }

  private static void average() {
    Stream<Album> albums = Stream.of(SampleData.aLoveSupreme);
    OptionalDouble average1 = albums.mapToInt(album -> album.getTrackList().size()).average();
//    System.out.println(average1);

    albums = Stream.of(SampleData.aLoveSupreme);
    Double average2 = SampleData.albums.collect(Collectors.averagingInt(album -> album.getTrackList().size()));
//    System.out.println(average2);
  }

  private static void partition() {
    Stream<Album> albums = Stream.of(SampleData.aLoveSupreme, SampleData.manyTrackAlbum);

    Map<Boolean, List<Album>> moreThan2Tracks = albums.collect(Collectors.partitioningBy(album -> album.getTrackList().size() > 2));
//    System.out.println(moreThan2Tracks);
  }

  private static void grouping() {
    Stream<Album> albums = Stream.of(SampleData.aLoveSupreme, SampleData.beatlesAlbum, SampleData.sampleShortAlbum);

    Map<Artist, List<Album>> albumsByMainMusician = albums.collect(groupingBy(album -> album.getMainMusician()));
//    System.out.println("albumsByMainMusician = " + albumsByMainMusician);
  }

  private static void stringConcatenation() {
    String artistNamesAsString = SampleData.getThreeArtists().stream().map(artist -> artist.getName()).collect(Collectors.joining(", ", "{", "}"));
//    System.out.println("artistNamesAsString = " + artistNamesAsString);
  }
}
