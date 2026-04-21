import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase13TrainConsistMgmt {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("=====================================\n");

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("Cargo", i));
        }

        long loopStartTime = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.capacity > 50000) {
                loopFiltered.add(bogie);
            }
        }

        long loopEndTime = System.nanoTime();
        long loopDuration = loopEndTime - loopStartTime;

        long streamStartTime = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 50000)
                .collect(Collectors.toList());

        long streamEndTime = System.nanoTime();
        long streamDuration = streamEndTime - streamStartTime;

        System.out.println("Loop Filtering Time   : " + loopDuration + " ns");
        System.out.println("Stream Filtering Time : " + streamDuration + " ns");

        System.out.println("\nPerformance comparison completed.");
    }
}