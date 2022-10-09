package formula1.service;

import formula1.domain.Car;
import formula1.domain.Track;
import formula1.repo.CarStore;
import formula1.repo.TrackStore;

import javax.swing.*;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

public class GuiInterface {

    private final CarStore carStore;
    private final TrackStore trackStore;

    public GuiInterface(CarStore carStore, TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }

    public Car chooseCarInGui() {
        String desiredCar = JOptionPane.showInputDialog(null, "Car:", null,
                QUESTION_MESSAGE, null, carStore.getTitles().toArray(), carStore.getTitles().get(0)).toString();
        return carStore.lookup(desiredCar);
    }

    public Track chooseTrackInGui() {
        String desiredTrack =JOptionPane.showInputDialog(null, "Track:", null,
                QUESTION_MESSAGE, null, trackStore.getTitles().toArray(), trackStore.getTitles().get(0)).toString();
        return trackStore.lookup(desiredTrack);
    }

    public void showResult(Car car, Track track) {
        if (car.isPitstopNeeded(track)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop needed in " + car.maxLapsForTrack(),
                    "Результат:",
                    INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop not needed ",
                    "Результат:",
                    INFORMATION_MESSAGE
            );
        }
    }
}

