package ObjectsAndClasses.P04_Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String[] songAttributes = scanner.nextLine().split("_");
            String typeList = songAttributes[0];
            String name = songAttributes[1];
            String time = songAttributes[2];

            Song currentSong = new Song();

            currentSong.setTypeList(typeList);
            currentSong.setName(name);
            currentSong.setTime(time);

            songList.add(currentSong);
        }
        String type = scanner.nextLine();
        if (type.equals("all")){
            for (Song song : songList){
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songList){
                if (song.getTypeList().equals(type)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
