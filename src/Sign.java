public class Sign {

    private String message;
    private int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        if (message.length() % width != 0)
            return (int)(message.length() / width) + 1;
        return message.length() / width;
    }

    public String getLines() {
        String linedMessage = "";
        if (message == null ||  linedMessage.equals(message))
            return null;
        for (int i = 1; i < numberOfLines(); i++) {
            if () linedMessage += message.substring((i-1)*width);
            else linedMessage += message.substring((i-1) * width, width * i) + ";";

        }
        return linedMessage;
    }

}
