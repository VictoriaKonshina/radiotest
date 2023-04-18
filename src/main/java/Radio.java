public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int stationCount;


    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;

    }


    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {

        if (currentStation != 0) {

            currentStation--;
        } else {
            currentStation = maxStation;
        }

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume != 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void decrease() {

        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }

    }

}