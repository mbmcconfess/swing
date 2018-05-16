package ProgressBar;

public class SimulatedActivity extends Thread {
    private int current;
    private int target;
    public SimulatedActivity(int t){
        current = 0;
        target = t;
    }

    public  int getTarget(){
        return target;
    }

    public int getCurrent(){
        return current;
    }

    @Override
    public void run() {
        try{
            while(current < target && ! interrupted()){
                sleep(100);
                current++;
            }
        }catch (InterruptedException e){

        }
    }
}
