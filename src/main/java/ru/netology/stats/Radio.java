package ru.netology.stats;

public class Radio {
    private int currentStation = 0;
    private int currentVolume = 100;

    private int radioStationsCount = 0;
    private int minStationIndex = 0, maxStationIndex = 0;
    private int minVolume = 0, maxVolume = 100;

    public Radio() {
        this(10);
    }

    public Radio(int radioStationsCount) {
        this.radioStationsCount = radioStationsCount;
        maxStationIndex = radioStationsCount - 1;
    }


    public void next() {
        if (currentStation < maxStationIndex) {
            currentStation++;
        } else {
            currentStation = minStationIndex;
        }
    }

    public void prev() {
        if (currentStation > minStationIndex) {
            currentStation--;
        } else {
            currentStation = maxStationIndex;
        }
    }

    public int getRadioStationsCount() {
        return radioStationsCount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStationIndex) {
            return;
        }
        if (currentStation >= radioStationsCount) {
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