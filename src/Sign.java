public class Sign {
    private String message
    private int width
    public Sign (String mess, int wth) {
        message = mess;
        width = wth;
    }
    public int numberOfLines(String mess, int wth) {
        int length = mess.length();
        int count;
        count = 0;
        if (length % wth == 0) {
            count++;
        }
        (int) (length / wth) = length;
        count = count + length;
        return count;

    public String getLines (String mess, int wth) {

        }

    }
}
