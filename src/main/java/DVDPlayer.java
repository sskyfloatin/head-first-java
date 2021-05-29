
public class DVDPlayer {

	boolean canRecord = false;
	
	void playDVD() {
		System.out.println("Recording of DVD is active.");
	}
	
	void recordDVD() {
		System.out.println("DVD is playing.");
	}
	public static void main(String[] args) {
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.playDVD();
		
		if (d.canRecord == true) {
			d.recordDVD();
		}

	}

}
