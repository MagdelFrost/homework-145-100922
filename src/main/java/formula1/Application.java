package formula1;

import formula1.domain.Car;
import formula1.domain.Track;
import formula1.service.GuiInterface;
import formula1.service.TerminalInterface;

public class Application {

    private final GuiInterface userInterface;

    private final TerminalInterface terminalInterface;

    public Application(GuiInterface userInterface, TerminalInterface terminalInterface) {
        this.terminalInterface = terminalInterface;
        this.userInterface = userInterface;
    }

    void run() {
        Car car1 = terminalInterface.chooseCarInCon();
        Track track1 = terminalInterface.chooseTrackInCon();
        terminalInterface.showResult(car1, track1);

        Car car2 = userInterface.chooseCarInGui();
        Track track2 = userInterface.chooseTrackInGui();
        userInterface.showResult(car2, track2);
    }
}
