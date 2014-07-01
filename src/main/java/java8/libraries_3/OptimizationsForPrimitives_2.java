package java8.libraries_3;

import java8.testdata_0.Album;
import java8.testdata_0.SampleData;

import java.util.IntSummaryStatistics;

public class OptimizationsForPrimitives_2 {

  public static void main(String[] args) {
    Album album = SampleData.manyTrackAlbum;
   
    IntSummaryStatistics trackLengthStats
      = album.getTracks()
      .mapToInt(track -> track.getLength()) // calculates with int (not Integer)
      .summaryStatistics(); // convenience methods for ints

    System.out.printf("Max: %d, Min: %d, Ave: %f, Sum: %d",
      trackLengthStats.getMax(),
      trackLengthStats.getMin(),
      trackLengthStats.getAverage(),
      trackLengthStats.getSum());
  }
}
