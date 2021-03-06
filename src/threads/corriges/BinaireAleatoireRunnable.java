package threads.corriges;

public class BinaireAleatoireRunnable implements Runnable
{
	private int value;
	private int nbIterations;

	public BinaireAleatoireRunnable(int value, int nbIterations)
	{
		this.value = value;
		this.nbIterations = nbIterations;
	}

	@Override
	public void run()
	{
		for (int i = 1; i <= nbIterations; i++)
			System.out.print(value);
	}

	public static void main(String[] args)
	{
		Runnable runnableUn = new BinaireAleatoireRunnable(1, 30);
		Runnable runnableZero = new BinaireAleatoireRunnable(0, 30);
		Thread threadUn = new Thread(runnableUn);
		Thread threadZero = new Thread(runnableZero);
		threadUn.start();
		threadZero.start();
	}
}
