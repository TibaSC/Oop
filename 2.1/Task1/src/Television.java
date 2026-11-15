public class Television {
    private boolean on= false;
    private int channel = 1;
    public boolean isOn(){
        return on;
    }
    public void setChannel(int newChannel){
        if (on) {
            if (newChannel > 10) {
                channel = 1;
            } else {
                channel = newChannel;
            }
        }
    }
    public void pressOnOff(){
        on= !on;
    }
    public int getChannel(){
        return channel;
    }
}
