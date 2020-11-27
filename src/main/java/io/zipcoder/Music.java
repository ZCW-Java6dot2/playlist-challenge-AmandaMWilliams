package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int forwardCount = 0;
        int backwardCount = 0;

        for (int i = 0; i < playList.length; i++) {
            if (playList[startIndex].equals(selection)) {
                return 0;
            } else {
                forwardCount++;
                backwardCount--;
            }
        }

        if (forwardCount > Math.abs(backwardCount)) {
            return Math.abs(backwardCount);
        }
        return forwardCount;
    }
}
