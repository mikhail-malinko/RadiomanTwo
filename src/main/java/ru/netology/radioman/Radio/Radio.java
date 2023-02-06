package ru.netology.radioman.Radio;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;


    public Radio(int maxStation) {
        this.maxStation = maxStation - 1;
    }
    public Radio(){

    }


    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int nevCurrentStation) {
        if (nevCurrentStation > maxStation) {
            return;
        }
        if (nevCurrentStation < minStation) {
            return;
        }
        currentStation = nevCurrentStation;
    }

//    public int getCurrentVolume() {
//        return currentVolume;
//    }

    public void setCurrentVolume(int newCurrentVolume) {
        this.currentVolume = newCurrentVolume;
    }

    public int next() {
        currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        return currentStation;
    }
    public int prev() {
        currentStation = currentStation - 1;
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        return currentStation;
    }
    public int volumeUp() {
       if (currentVolume < maxVolume) {
           currentVolume = currentVolume + 1;
       }
       return currentVolume;
    }
    public int volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }



}
