import javax.sound.midi.*;

public class MiniMiniMusicApp{
	public static void main(String[] args){
		MiniMiniMusicApp mini=new MiniMiniMusicApp();
		mini.play();
	}

	public void play()
	{
		try{
			Sequencer player=MidiSystem.getSequencer();// get the sequencer 
			player.open();// open the sequencer

			Sequence seq=new Sequence(Sequence.PPQ, 4);// make a new sequence

			Track track=seq.createTrack();//getting a track from a squence.

			ShortMessage a=new ShortMessage();
			a.setMessage(144, 1, 20, 100);
			MidiEvent noteon=new MidiEvent(a,1);
			track.add(noteon);//putting midi events into the tracks

			ShortMessage b=new ShortMessage();
			b.setMessage(128, 1, 20, 100);
			MidiEvent noteoff=new MidiEvent(b, 16);
			track.add(noteoff);

			player.setSequence(seq);//give sequence to sequencer
			player.start();	//start the player
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}