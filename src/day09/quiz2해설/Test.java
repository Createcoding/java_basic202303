package day09.quiz2해설;

import day04.array.StringList;

public class Test {

    public static void main(String[] args) {

        // 가수 객체 생성
        Artist artist = new Artist("동방신기", new StringList("hug","risng sun"));

        // 객체 생성 이후에 노래를 추가하고 싶어
        StringList songList = artist.getSongList();
        songList.push("mirotic");

        artist.info();

        ArtistRepository ar = new ArtistRepository();
        ar.addNewArtist("아이유","분홍신");

        ar.addNewSong("아이유","RainDrop");
        ar.addNewSong("자자자","호호");

        for (Artist artist1 : ArtistRepository.artistList) {
            artist1.info();
        }

        Artist foundArtist = ar.findArtistByName("아이유");
//        System.out.println(foundArtist);


    }
}
