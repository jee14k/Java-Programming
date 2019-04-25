interface Player
{
	void Play();
	void Stop();
	void Pause();
	void Reverse();	
}
interface Record extends Player
{
	void record();
}
class DvdPlayer implements Player
{
	public void Play()
	{
		System.out.println("Play function in DVDPlayer class");
	}
	public void Stop()
	{
		System.out.println("Stop function in DVDPlayer class");
	}
	public void Pause()
	{
		System.out.println("Pause function in DVDPlayer class");
	}
	public void Reverse()
	{
		System.out.println("Reverse function in DVDPlayer class");
	}
}
class CDPlayer implements Player
{
	public void Play()
	{
		System.out.println("Play function in CDPlayer class");
	}
	public void Stop()
	{
		System.out.println("Stop function in CDPlayer class");
	}
	public void Pause()
	{
		System.out.println("Pause function in CDPlayer class");
	}
	public void Reverse()
	{
		System.out.println("Reverse function in CDPlayer class");
	}
}
class TapeRecorder implements Record
{
	public void Play()
	{
		System.out.println("Play function in TapeRecorder class");
	}
	public void Stop()
	{
		System.out.println("Stop function in TapeRecorder class");
	}
	public void Pause()
	{
		System.out.println("Pause function in TapeRecorder class");
	}
	public void Reverse()
	{
		System.out.println("Reverse function in TapeRecorder class");
	}
	public void record()
	{
		System.out.println("Record Function Inside Tape recorder class");
	}
}
class Playtest
{
	public static void main(String[] args) 
	{
		CDPlayer c = new CDPlayer();
		DvdPlayer d = new DvdPlayer();
		c.Play();
		c.Stop();
		c.Pause();
		c.Reverse();
		d.Play();
		d.Stop();
		d.Pause();
		d.Reverse();
	}
}