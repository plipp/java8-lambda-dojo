package java8.advanced_collections_4.exercises;

import java8.testdata_0.Artist;
import java8.testdata_0.SampleData;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestName_2_1Test {
  @Test
  public void findsLongestNameByReduce() {
    Artist artist = LongestName_2_1.byReduce(SampleData.getThreeArtists());
    assertEquals(SampleData.johnColtrane, artist);
  }

  @Test
  public void findsLongestNameByCollecting() {
    Artist artist = LongestName_2_1.byCollecting(SampleData.getThreeArtists());
    assertEquals(SampleData.johnColtrane, artist);
  }

}