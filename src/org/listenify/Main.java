package org.listenify;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static List<Album> albums=new ArrayList<>();
    public static void main(String[] args) {

        Album album=new Album("Chitra Hits","K.S Chitra");

       String result= album.addSongToAlbum("Telusuna",4.3);
        album.addSongToAlbum("Manmadha",4.2);
        album.addSongToAlbum("Cheppamma",4.4);
        album.addSongToAlbum("Nuvvastanante",5.3);
        album.addSongToAlbum("Aha allari",4.14);

        albums.add(album);

        album=new Album("S.P Balasubramanyam Hits","S.P Balasubramanyam");

        album.addSongToAlbum("Paara Thusar",5.5);
        album.addSongToAlbum("Jaamurathiri",5.0);
        album.addSongToAlbum("Oura Ammaka Chella",5.4);
        album.addSongToAlbum("Bangaru Kodi Petta",6.1);
        album.addSongToAlbum("Love Me My Hero",5.1);

        albums.add(album);

        LinkedList<Song> playList_1=new LinkedList<>();

        albums.get(0).addSongToPlayList("Telusana",playList_1);

        albums.get(0).addSongToPlayList("Manmadha",playList_1);

        albums.get(1).addSongToPlayList("Oura Ammaka Chella",playList_1);

        albums.get(1).addSongToPlayList("No song",playList_1);

        System.out.println(result);

    }
}