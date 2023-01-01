package javastudy;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("ON");
	}

	@Override
	public void turnOff() {
		System.out.println("OFF");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("volume changed");
	}

	@Override
	public void changechannel(int channel) {
		System.out.println("channel changed");
	}

}
