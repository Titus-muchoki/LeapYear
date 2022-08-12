
public class LeepYear {

    public boolean runLeepYear;

    public boolean runLeapYear(int i) {
        int year = 0;
        if (i % 4 == 1) {
            return false;
        } else if (i % 4 == 0) {
            return true;
        } else if (i % 400 == 0) {
            return true;

        } else if (i % 100 == 0 ) {
            return false;

        }else {
            return false;
        }

    }
}
