import java.util.*;

public class HashMatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("Overdose", "Lyrics1");
        trackList.put("指望", "Lyrics2");
        trackList.put("不該", "Lyrics3");
        trackList.put("BANG BANG BANG", "Lyrics4");


        String track = trackList.get("Overdose");
        System.out.println(track);

        for(String key : trackList.keySet()) {
            System.out.println(key + ":" + trackList.get(key));
        }

    }
}
