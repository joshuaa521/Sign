public class Sign {

    private String message;
    private int width;

    public Sign(String mess, int wth) {
        message = mess;
        width = wth;
    }

    public int numberOfLines() {
        int length = message.length();
        int count;
        count = 0;
        int number = 0;
        length / width = number;
        length % width = count;
        if (count != 0) {
            number = count + number;
        }
        return number;
    }

    public String getLines(String mess, int wth) {
        int length = mess.length();
        String final ;
        final =mess;
        if (length == 0) {
            final =null;
            return final ;
        }
        int divided = 0;
        if (length / number == 0) {
            divided = (length) / (number - 1)
        } else {
            divided = length / number;
        }
        String new;
        for (int i = 0; i <= divided; i++) {
            new = mess.substring(0, i) + ";";
        }
    }

}
}
