import javax.swing.*;

public class JListExample {
    public static void main(String[] args) {
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};

        JList<String> myList = new JList<>(items);

        JPanel panel = new JPanel();
        panel.add(myList);

        JFrame frame = new JFrame("My JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

