package java8.streams_2;

import java8.testdata_0.Track;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class MinAsSpecialCaseOfReducePatternAndOptional_3_3 {
    public static void main(String[] args) {

        List<Track> tracks = asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));

        // eager min
        // Stream<T>:n -minBy(T->U)-->Optional<T>:1
        Optional<Track> shortestTrack = tracks.stream()
                .min(Comparator.comparing(track -> track.getLength()));
        System.out.println(shortestTrack.get().getName()); // a) if you're sure...
        shortestTrack.map(Track::getName).ifPresent(System.out::println); // b) same as a), if you're sure

        // eager min
        // Stream<T>:n -minBy(T->U)-->Optional<T>:0 ==> Optional
        List<Track> emptyTrackList = Collections.emptyList();
        Optional<Track> min = emptyTrackList.stream().min(Comparator.comparing(track -> track.getLength()));
        System.out.println(min.orElse(new Track("Dummy",0)).getName());
        min.map(Track::getName).ifPresent(System.out::println); // b) doesn't print out here
    }
}
