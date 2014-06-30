package java8.streams_2.exercises;

import java8.exercises_0.Exercises;
import java8.testdata_0.Artist;

import java.util.List;
import java.util.stream.Stream;

public class Iteration_2 {

    // Convert this code sample from using external iteration to internal iteration:
    public static int countBandMembersExternal(List<Artist> artists) {
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMembers();
            totalMembers += members.count();
        }
        return totalMembers;
    }


    public static int countBandMembersInternal(List<Artist> artists) {
        return Exercises.replaceThisWithSolution();
    }
}
