package io.zipcoder;

import java.util.Arrays;
import java.util.List;

public class Music {
    private final String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        String currentSong = playList[startIndex];
        int currentIndex = 0;
        int forwardSteps = 0;
        int backwardSteps = 0;
        while (!currentSong.equals(selection)) {
            currentIndex++;
            forwardSteps++;

            currentSong = playList[currentIndex];
        }

        currentIndex = startIndex;
        currentSong = playList[currentIndex];
        while (!currentSong.equals(selection)) {
            if (currentIndex < 0) {
                currentIndex = playList.length - 1;
            }
            currentSong = playList[currentIndex];
            backwardSteps--;
            currentIndex--;
        }
        backwardSteps = Math.abs(backwardSteps);

        if(forwardSteps > backwardSteps) {
            return backwardSteps-1;
        } else {
            return forwardSteps-1;
        }
    }
}
