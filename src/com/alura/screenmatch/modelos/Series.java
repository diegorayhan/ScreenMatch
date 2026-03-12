package com.alura.screenmatch.modelos;

public class Series extends Title{
    private int season;
    private int episodesPerSeason;
    private boolean planActive;
    private int minutePerEpisode;

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isPlanActive() {
        return planActive;
    }

    public void setPlanActive(boolean planActive) {
        this.planActive = planActive;
    }

    public int getMinutePerEpisode() {
        return minutePerEpisode;
    }

    public void setMinutePerEpisode(int minutePerEpisode) {
        this.minutePerEpisode = minutePerEpisode;
    }

    @Override
    public int getFilmLength() {
        return season * episodesPerSeason * minutePerEpisode;
    }

}
