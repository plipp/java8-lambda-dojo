package java8.streams_2;

import java8.testdata_0.Artist;
import java8.testdata_0.SampleData;

import java.util.List;


// -> Stream->... Stream ...-> Long/anything else but Stream
//    lazy        lazy         eager
public class LazyEager_2 {

    // lazy 'filter' without eager 'count', which would collect final value
    public void filterOnly(List<Artist> artists) {
        artists.stream()
                .filter(artist -> {
                    System.out.println("filter" + artist.getName());
                    return artist.isFrom("London");
                });
    }

    public long filterWithFinalCollector(List<Artist> artists) {
        return artists.stream()
                .filter(artist -> {System.out.println("filter"+artist.getName()); return artist.isFrom("London");}).count();
    }


    public static void main(String[] args) {
        LazyEager_2 lazyEagerSample = new LazyEager_2();

        lazyEagerSample.filterOnly(SampleData.membersOfTheBeatles);
        // TODO: lazyEagerSample.filterWithFinalCollector(SampleData.membersOfTheBeatles);
    }
}
