package learning.semen.seyfullah.com.diceroller.Classes;

/*
 * Created by Seyfullah Semen on 3-9-2018.
 */
public class Dice {

    private int mThrows;

    public Dice(int mThrows) {
        this.mThrows = mThrows;
    }

    public int getmThrows() {
        return mThrows;
    }

    public void setmThrows(int mThrows) {
        this.mThrows = mThrows;
    }

    @Override
    public String toString() {
        return "" + mThrows;
    }


}
