package main;

public class FirstRun extends Thread {

    public void run() {
        try {
            Env.sleep();

            Starting.runFade();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
