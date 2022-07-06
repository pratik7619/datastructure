package google;

import java.util.Stack;

class Message {
    String message;
    int timestamp;

    Message(String message, int timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}

class Pair<T1, T2> {
    T1 first;
    T2 second;

    Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
}

public class MessageCommunication {
    //?Pratik Sherdiwala (Codelytics)

    /*
     * Mars Planet
     * ----------------
     * Robot -> Messages
     *
     * 10 seconds ->
     *
     * 5 Winds are coming
     * 9 Winds are coming
     * 19 Winds are coming
     * 12 I am good
     * 30 I am good
     *
     * -----------------------
     * 9 Winds are coming
     * 8 I am good
     * 19 Winds are coming
     *
     *
     * timestamp -> 5
     * */

    static Stack<Message> stackMessages = new Stack<>();

    static void onMessageReceived(Message message) {

        if (stackMessages.isEmpty()) {
            stackMessages.add(message);
            return;
        }

        if (isMessageAvailable(message.message)) {
            Pair<Message, Integer> lastUpdatedMessageWithIndex = getLastUpdatedMessageWithIndex(message.message);

            if (lastUpdatedMessageWithIndex != null) {

                int timeDifference = message.timestamp - lastUpdatedMessageWithIndex.first.timestamp;

                if (timeDifference >= 10 || timeDifference <= -10) {
                    addMessage(message);
                } else {
                    updateMessage(
                            new Pair<>(
                                    new Message(message.message, message.timestamp),
                                    lastUpdatedMessageWithIndex.second
                            )
                    );
                }
                System.out.println(message.timestamp + " " + message.message);
            }
        } else {
            System.out.println(message.timestamp + " " + message.message);
            addMessage(message);
        }
    }

    static void updateMessage(Pair<Message, Integer> messageIntegerPair) {
        stackMessages.set(messageIntegerPair.second, messageIntegerPair.first);
    }

    static void addMessage(Message message) {
        validateStackCount();
        stackMessages.add(message);
    }

    static void validateStackCount() {
        if (stackMessages.size() > 1000) {
            stackMessages.removeElementAt(0);
        }
    }

    static Pair<Message, Integer> getLastUpdatedMessageWithIndex(String message) {
        for (int i = stackMessages.size() - 1; i >= 0; i--) {
            if (stackMessages.get(i).message.equals(message)) {
                return new Pair<>(stackMessages.get(i), i);
            }
        }
        return null;
    }

    static boolean isMessageAvailable(String message) {
        for (Message stackMessage : stackMessages) {
            if (stackMessage.message.equals(message)) {
                return true;
            }
        }
        return false;
    }

    static void printMessageStack() {
        stackMessages.forEach((key) -> {
            System.out.println(key.timestamp + " " + key.message);
        });
    }

    public static void main(String[] args) {

        onMessageReceived(new Message("Winds are coming", 5));
        onMessageReceived(new Message("I am good", 8));
        onMessageReceived(new Message("Winds are coming", 9));
        onMessageReceived(new Message("Winds are coming", 20));
        onMessageReceived(new Message("Hello", 57));

        System.out.println("----Final Answer----");
        printMessageStack();
    }
}
