package org.example.programowanieFunkcyjne;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("G0T1", "got1.com",
                VideoType.CLIP);
        Video video1 = new Video("G0T2", "got2.com",
                VideoType.EPISODE);
        Video video2 = new Video("G0T3", "got3.com",
                VideoType.PREVIEW);
        Video video3 = new Video("G0T4", "got4.com",
                VideoType.PREVIEW);
        Video video4 = new Video("G0T5", "got5.com",
                VideoType.CLIP);
        Video video5 = new Video("G0Tб", "gotб.com",
                VideoType.EPISODE);
        Episode episode = new Episode("got1", 1,
                Arrays.asList(video, video1));
        Episode episode1 = new Episode("got2", 2,
                Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1,
                Arrays.asList(video4, video5));
        Season season = new Season("G0T51", 1,
                Arrays.asList(episode, episode1));
        Season season1 = new Season("G0T51", 2,
                Arrays.asList(episode2));
        List<Season> seasons = Arrays.asList(season, season1);
//        list of episodes
        List<Episode> episodes = seasons
                .stream()
                .flatMap(s -> season.episodes.stream())
                .toList();
//        list of videos
        List<Video> videos = seasons
                .stream()
                .flatMap(s -> season.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .toList();
//        list of seasons' names
        List<String> seasonNames = seasons
                .stream()
                .map(s -> s.seasonName)
                .toList();
//        list of seasons' numbers
        List<Integer> seasonNumbers = seasons
                .stream()
                .map(s -> s.seasonNumber)
                .toList();
//        list of episodes' names
        List<String> episodesNames = seasons
                .stream()
                .flatMap(s -> season.episodes.stream())
                .map(e -> e.episodeName)
                .toList();
//        list of episodes' numbers
        List<Integer> episodesNumbers = seasons
                .stream()
                .flatMap(s -> season.episodes.stream())
                .map(e -> e.episodeNumber)
                .toList();
//        list of videos' names
        List<String> videosNames = seasons
                .stream()
                .flatMap(s -> season.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.title)
                .toList();
//        list of videos' urls
        List<String> videosUrls = seasons
                .stream()
                .flatMap(s -> season.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.url)
                .toList();
//        list of even episodes
        List<Episode> evenEpisodes = seasons
                .stream()
                .flatMap(s -> season.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .toList();
//        list of even seasons
        List<Season> evenSeasons = seasons
                .stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .toList();
//        list of even episodes and seasons
        List<Episode> evenEpisodesFromEvenSeasons = seasons
                .stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> season.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .toList();
//        list of clips videos form even episodes and odd seasons
        List<Video> clipVideosFromEvenEpisodesAndOddSeasons = seasons
                .stream()
                .filter(s -> s.seasonNumber % 2 != 0)
                .flatMap(s -> season.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .flatMap(e -> e.videos.stream())
                .filter(v -> v.videoType == VideoType.CLIP)
                .toList();
//        list of preview videos from odd episodes and even seasons
        List<Video> previewVideosFromOddEpisodesFromEvenSeasons = seasons
                .stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> season.episodes.stream())
                .filter(e -> e.episodeNumber % 2 != 0)
                .flatMap(e -> e.videos.stream())
                .filter(v -> v.videoType == VideoType.PREVIEW)
                .toList();


    }
}
