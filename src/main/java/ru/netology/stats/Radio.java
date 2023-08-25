package ru.netology.stats;

public class Radio {
    private int currentStation;
    private int currentVolume;

    private int numberOfRadioStations = 10;
    private int minStation = 0, maxStation;
    private int minVolume = 0, maxVolume = 100;

    public Radio() {

    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }


    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentNumberOfStations() {
        return numberOfRadioStations;
    }

    public int setMaxStation(int numberOfRadioStations) {
        maxStation = numberOfRadioStations - 1;
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void decreaseVolume() {
        setCurrentVolume(getCurrentVolume() - 1);
    }

    public void increaseVolume() {
        setCurrentVolume(getCurrentVolume() + 1);
    }
}