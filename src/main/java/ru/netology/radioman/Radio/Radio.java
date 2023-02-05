package ru.netology.radioman.Radio;

public class Radio {

    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int nevCurrentStation) {
        if (nevCurrentStation > 9) {
            return;
        }
        if (nevCurrentStation < 0) {
            return;
        }
        currentStation = nevCurrentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int next() {
        currentStation = currentStation + 1;
        if (currentStation > 9) {
            currentStation = 0;
        }
        return currentStation;
    }
    public int prev() {
        currentStation = currentStation - 1;
        if (currentStation < 0) {
            currentStation = 9;
        }
        return currentStation;
    }
    public int volumeUp() {
       if (volume < 10) {
           volume = volume + 1;
       }
       return volume;
    }
    public int volumeDown() {
        if (volume > 0) {
            volume = volume - 1;
        }
        return volume;
    }



}
