import javax.sound.midi.*;

public class MiniMiniCmdline{
	public static void main(String[] args)
	{
		MiniMiniCmdline mini=new MiniMiniCmdline();
		if(args.length<2){
			System.out.println("don't forgte about the arguments");
		}else
		{
			int instrument=Integer.parseInt(args[0]);
			int note=Integer.parseInt(args[1]);
			mini.play(102,30);
		}

	}

	public void play(int instrument, int note){
		try{
			Sequencer player=MidiSystem.getSequencer();
			player.open();
			Sequence seq=new Sequence(Sequence.PPQ, 4);
			Track track=seq.createTrack();

			MidiEvent=null;

			ShortMessage first=new ShortMessage();
			a.setmessage(192,1,instrument, 0);
			MidiEvent changeinstrument=new MidiEvent(first,1);
			track.add(changeinstrument);

			ShortMessage a=new ShortMessage();
			a.setmessage(144,1,note,100);
			MidiEvent noteOn=new MidiEvent(a,1);
			track.add(noteon);

			ShortMessage b=new ShortMessage();
			b.setmessage(128,1,note,100);
			MidiEvent noteoff=new MidiEvent(b,16);
			track.add(noteoff);
			player.setSequence(seq);
			player.start();
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}
}