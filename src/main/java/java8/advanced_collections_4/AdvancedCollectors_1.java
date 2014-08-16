package java8.advanced_collections_4;

import java8.testdata_0.Album;
import java8.testdata_0.Artist;
import java8.testdata_0.SampleData;

import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AdvancedCollectors_1 {
    public static void main(String[] args) {
      average();
    }

  private static void average() {
    OptionalDouble average1 = SampleData.albums.mapToInt(album -> album.getTrackList().size()).average();
    System.out.println(average1);

    Double average2 = SampleData.albums.collect(Collectors.averagingInt(album -> album.getTrackList().size()));
    System.out.println(average2);
  }
}
