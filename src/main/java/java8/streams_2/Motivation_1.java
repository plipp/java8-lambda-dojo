package java8.streams_2;

import java8.testdata_0.Artist;
import java8.testdata_0.SampleData;

import java.util.Iterator;
import java.util.List;

public class Motivation_1 {

    // external iteration
    //      appl -hasNext-> collection
    //      appl -next----> collection
    //      appl -hasNext-> collection
    // ..
    public int filterAndThenCountWithExternalIteration(List<Artist> artists) {
        int count = 0;
        Iterator<Artist> iterator = artists.iterator();
        while (iterator.hasNext()) {
            Artist artist = iterator.next();
            if (artist.isFrom("London")) {
                count++;
            }
        }
        return count;
    }

    // internal iteration
    //      appl --> collection
    public long filterAndThenCountWithInternalIteration(List<Artist> artists) {
        long count = artists.stream()
                .filter(artist -> artist.isFrom("London"))
                .count();
        return count;
    }

    public static void main(String[] args) {
        Motivation_1 motivationForStreams = new Motivation_1();

        motivationForStreams.filterAndThenCountWithExternalIteration(SampleData.membersOfTheBeatles);
        motivationForStreams.filterAndThenCountWithInternalIteration(SampleData.membersOfTheBeatles);
    }
}
