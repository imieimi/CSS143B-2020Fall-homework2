package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super(anotherMovie.rating, anotherMovie.title);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        int fee = 0;
        if(numOfDaysPastDue < 5){
            fee = numOfDaysPastDue * lateFeePerDayInDollar;
        }else if(numOfDaysPastDue > 5){
            fee = 2 * numOfDaysPastDue * lateFeePerDayInDollar;
        }
        return fee;
    }
}
