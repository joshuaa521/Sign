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
        if (message.length() == 0)
            return null;

        String display = "";
        for (int i = 0; i < numberOfLines() - 1; i++){
            display += message.substring(i * width, (i + 1) * width) + ";";
        }
        if (message.length() % width == 0)
            display += message.substring(message.length() - width);
        else
            display += message.substring(message.length() - message.length() % width);
        return display;
    }

}
