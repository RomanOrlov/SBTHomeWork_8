package ru.sbt.orlov.domain;

public class Video extends Resource {

    private long videoLenght;
    private int width;
    private int height;

    public long getVideoLenght() {
        return videoLenght;
    }

    public void setVideoLenght(long videoLenght) {
        this.videoLenght = videoLenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
