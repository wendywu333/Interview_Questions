import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * 
 */

/**
 * @author Wenzhe
 *
 */
public class MusicTest1 {

	/**
	 * @param args
	 */
	
	public void play(){
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("We got a sequencer!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}

}
