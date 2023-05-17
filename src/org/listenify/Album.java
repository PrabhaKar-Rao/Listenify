package org.listenify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    public String albumName;
    public String artistName;
    public List<Song> songList;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = new ArrayList<>();
    }


    public boolean findSong(String title)
    {
        for(Song song:songList)
        {
            if((song.title).equals(title)) {
                return true;
            }
        }
        return false;
    }

    public String addSongToAlbum(String title,double duration)
    {
        if(findSong(title))
        {
            return "Song is already present the album";
        }
        else {

            Song song = new Song(title, duration);

            songList.add(song);

            return "Song added to album Successfully..!!";
        }
    }

    public String addSongToPlayList(int trackNo, LinkedList<Song> playList)
    {
        int index=trackNo-1;

        if(index>=0 && index<this.songList.size())
        {
            Song song=this.songList.get(index);

            playList.add(song);

            return "Song added to playList";

        }
        else{

            return "Invalid trackNo";
        }
    }

    public String addSongToPlayList(String title,LinkedList<Song> playList)
    {
        for(Song song:songList)
        {
            if((song.title).equals(title))
            {
                playList.add(song);
                return "Song added to PlayList";
            }
        }
        return "Song is not present in the Album";
    }
}
