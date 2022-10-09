package formula1;

import formula1.repo.CarStore;
import formula1.repo.TrackStore;
import formula1.service.GuiInterface;
import formula1.service.TerminalInterface;

public class Main {
    public static void main(String[] args) {

        new Application(new GuiInterface(
                new CarStore(),
                new TrackStore()
        ), new TerminalInterface(
                new CarStore(),
                new TrackStore()
        )).run();
    }
}