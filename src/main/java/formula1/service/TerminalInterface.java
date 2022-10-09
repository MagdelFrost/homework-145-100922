package formula1.service;

import formula1.domain.Car;
import formula1.domain.Track;
import formula1.repo.CarStore;
import formula1.repo.TrackStore;

import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.QUESTION_MESSAGE;

public class TerminalInterface {

    Scanner console = new Scanner(System.in);

    private final CarStore carStore;
    private final TrackStore trackStore;

    public TerminalInterface(CarStore carStore, TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }

    public Car chooseCarInCon() {
        System.out.println("Cars: ");
        String desiredCar = console.nextLine();
        return carStore.lookup(desiredCar);
    }

    public Track chooseTrackInCon() {
        System.out.println("Tracks: ");
        String desiredTrack = console.nextLine();
        return trackStore.lookup(desiredTrack);
    }

    public void showResult(Car car, Track track) {
        if (car.isPitstopNeeded(track)) {
            System.out.println("Pit-stop needed in " + car.maxLapsForTrack());
        } else {
            System.out.println("Pit-stop not needed");
        }
    }
}
