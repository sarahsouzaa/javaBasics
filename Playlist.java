// javaBasics: Understanding the concepts of arrays, ArrayList, add, remove, indexOf and set (swap) statements

// Program: Playlist
// Description: Manages a music playlist using arrays and ArrayLists.

import java.util.Arrays;
import java.util.ArrayList;

class Playlist {
  public static void main(String[] args) {
    String[] favoriteSongs = {
      "Metallica - One",
      "Avenged Sevenfold - Nightmare",
      "Linkin Park - With You",
      "Spiritbox - Angel Eyes",
      "Slipknot - Duality",
      "Asking Alexandria - Animals",
      "Gojira - Stranded",
      "Helloween - Power",
      "Imminence - Desolation",
      "Skid Row - In a Darkened Room"
    };
    System.out.println(Arrays.toString(favoriteSongs));

    
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();
    desertIslandPlaylist.add("Whitesnake - Is This Love"); // Fixed typo: Whitenaske
    desertIslandPlaylist.add("Queen - Killer Queen");
    desertIslandPlaylist.add("Lorna Shore - Into the Earth");
    desertIslandPlaylist.add("Dream Theater - As I Am");
    desertIslandPlaylist.add("System of a Down - Aerials");
    System.out.println(desertIslandPlaylist);

    // Adding all songs from the array into the ArrayList and then removing a few songs
    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
    System.out.println("Playlist size: " + desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Helloween - Power");
    desertIslandPlaylist.remove("Dream Theater - As I Am");
    desertIslandPlaylist.remove("Queen - Killer Queen");
    desertIslandPlaylist.remove("Imminence - Desolation");
    desertIslandPlaylist.remove("Slipknot - Duality");

    // Swaping songs
    int songA = desertIslandPlaylist.indexOf("System of a Down - Aerials");
    int songB = desertIslandPlaylist.indexOf("Metallica - One");

    String tempA = desertIslandPlaylist.get(songA);
    desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));
    desertIslandPlaylist.set(songB, tempA); 
    System.out.println(desertIslandPlaylist);
  }
}
