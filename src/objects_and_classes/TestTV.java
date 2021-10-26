package objects_and_classes;

public class TestTV {

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(4);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUP();
        tv2.channelUP();
        tv2.volumeUp();
        tv2.volumeDown();

        System.out.println("tv1 channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv1 channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
