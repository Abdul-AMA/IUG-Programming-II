package Lab01;
// The purpose of this class is to model a television

public class Television {

    //for the manufacturing company
    private final String MANUFACTURER;
    //for the screen size in inch
    private final int SCREEN_SIZE;
    //for the status of tv on or off
    private boolean powerON;
    //for channel number
    private int channel;
    //for volume number
    private int volume;

    // this constructor is for initialize the powerOn field to false (power is off), the volume to 20, and the channel to 2
    Television(String brand ,int size){
        this.MANUFACTURER = brand;
        this.SCREEN_SIZE = size;
        powerON = false;
        volume = 20;
        channel = 2;
    }
    // method for getting MANUFACTURER
    public String getMANUFACTURER() {
        return MANUFACTURER;


    }
    // method for getting screen size
    public int getSCREEN_SIZE() {
        return SCREEN_SIZE;

    }
    // method for getting channel number
    public int getChannel() {
        return channel;

    }
    // method for getting volume number
    public int getVolume() {
        return volume;
    }
    // method for changing channel number
    public void setChannel(int channel){
        this.channel = channel;
    }
    // method for changing the power status from on to off and vice verse
    public void power(){
        this.powerON = !powerON;
    }
    // method for increasing the volume by 1%
    public void increaseVolume(){
        this.volume++;
    }
    // method for decreasing the volume by 1%
    public void decreaseVolume(){
        this.volume--;
    }


}
