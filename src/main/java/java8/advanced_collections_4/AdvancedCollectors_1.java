package java8.advanced_collections_4;

import java8.testdata_0.Album;
import java8.testdata_0.Artist;
import java8.testdata_0.SampleData;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvancedCollectors_1 {
  public static void main(String[] args) {
    average();
    partition();
  }

  private static void average() {
    Stream<Album> albums = Stream.of(SampleData.aLoveSupreme);
    OptionalDouble average1 = albums.mapToInt(album -> album.getTrackList().size()).average();
    System.out.println(average1);

    albums = Stream.of(SampleData.aLoveSupreme);
    Double average2 = SampleData.albums.collect(Collectors.averagingInt(album -> album.getTrackList().size()));
    System.out.println(average2);

    // Stream of empty
    albums = Stream.empty();
    OptionalDouble average3 = albums.mapToInt(album -> album.getTrackList().size()).average();
    System.out.println(average3);

    albums = Stream.empty();
    Double average4 = albums.collect(Collectors.averagingInt(album -> album.getTrackList().size()));
    System.out.println(average4);
  }

  private static void partition() {
    Stream<Album> albums = Stream.of(SampleData.aLoveSupreme, SampleData.manyTrackAlbum);

    Map<Boolean, List<Album>> moreThan2Tracks = albums.collect(Collectors.partitioningBy(album -> album.getTrackList().size() > 2));
    System.out.println(moreThan2Tracks);
  }
}
