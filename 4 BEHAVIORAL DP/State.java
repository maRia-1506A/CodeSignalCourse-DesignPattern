// STATE DP

// TODO: Define the State interface with methods for play, pause, stop, and getName
// TODO: Implement the PlayingState class that handles all state transitions and appropriate messages
// TODO: Implement the PausedState class that handles all state transitions and appropriate messages// TODO: Implement the StoppedState class that handles all state transitions and appropriate messages// TODO: Implement the TVContext class which holds the current state
// TODO: Initialize with StoppedState
// TODO: Implement setState() and getCurrentState() methods
// TODO: Implement play(), pause(), and stop() methodspublic class Main {

// TODO: Demonstrate all possible state transitions
// TODO: Show invalid state transitions
// TODO: Print current state and transition messages

public interface State {
    void play(TVContext context);

    void pause(TVContext context);

    void stop(TVContext context);

    String getName();

    public static void main(String[] args) {

        TVContext tv = new TVContext();

        // Initial state
        System.out.println("Initial State: " + tv.getCurrentState().getName());

        // Valid transitions
        tv.play(); // Stopped → Playing
        tv.pause(); // Playing → Paused
        tv.play(); // Paused → Playing
        tv.stop(); // Playing → Stopped

        System.out.println();

        // Invalid transitions
        tv.pause(); // Cannot pause (Stopped)
        tv.stop(); // Already stopped
        tv.play(); // Stopped → Playing
        tv.play(); // Already playing
    }

}

class PlayingState implements State {

    @Override
    public void play(TVContext context) {
        System.out.println("TV is already playing.");
    }

    @Override
    public void pause(TVContext context) {
        System.out.println("Pausing TV.");
        context.setState(new PausedState());
    }

    @Override
    public void stop(TVContext context) {
        System.out.println("Stopping TV.");
        context.setState(new StoppedState());
    }

    @Override
    public String getName() {
        return "Playing State";
    }
}

class PausedState implements State {

    @Override
    public void play(TVContext context) {
        System.out.println("Resuming TV.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(TVContext context) {
        System.out.println("TV is already paused.");
    }

    @Override
    public void stop(TVContext context) {
        System.out.println("Stopping TV from pause.");
        context.setState(new StoppedState());
    }

    @Override
    public String getName() {
        return "Paused State";
    }
}

class StoppedState implements State {

    @Override
    public void play(TVContext context) {
        System.out.println("Starting TV.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(TVContext context) {
        System.out.println("Cannot pause. TV is stopped.");
    }

    @Override
    public void stop(TVContext context) {
        System.out.println("TV is already stopped.");
    }

    @Override
    public String getName() {
        return "Stopped State";
    }
}

class TVContext {
    private State state;

    public TVContext() {
        // Initial state
        this.state = new StoppedState();
    }

    public void setState(State state) {
        System.out.println("Transitioning from "
                + this.state.getName() + " to "
                + state.getName());
        this.state = state;
    }

    public State getCurrentState() {
        return state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
