/**
 * Created by user on 19.06.2017.
 */
public class StatisticObserver extends AbstractObserver
{
    private int countPlayedRounds;
    protected Game subject;

    public StatisticObserver(Game game)
    {
        this.subject = game;
        subject.register(this);

        countPlayedRounds = 0;
    }

    @Override
    public void update()
    {
        //We assume that a update is called after each round
        countPlayedRounds++;
        printStats();
    }

    @Override
    void remove()
    {
        //here you could insert some code to destruct this observer
    }

    private void printStats()
    {
        System.out.println("***** Statistics *****");
        System.out.println("Rounds played: " + countPlayedRounds);
        System.out.println("Player1-#Wins: " + subject.getPlayer(1).getWins());
        System.out.println("Player2-#Wins: " + subject.getPlayer(2).getWins());
        System.out.println("#Draws: " + subject.getDraws());
        System.out.println("**********************");
    }
}
