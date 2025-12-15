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
        int number = 0;
        length / wth = number;
        length % wth = count;
        if (count != 0) {
            number = count + number;
        }
        return number;
    public String getLines (String mess, int wth) {
        int length = mess.length();
        String final;
        final = mess;
        if (length == 0) {
            final = null;
            return final;
        }
        int divided = 0;
        if (length / number == 0) {
            divided = (length) / (number - 1)
        }
        else {
            divided = length / number;
        }
        String new;
        new = mess.substring(0,divided) + ";" + mess.substring(0,divided * 2)
        }

    }
}
