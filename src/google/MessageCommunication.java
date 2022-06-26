package google;

import java.sql.Struct;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;

class Message {
    String message;
    int timestamp;

    Message(String message, int timestamp) {
        this.message = message;
        this.timestamp = timestamp;
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
     * 8 I am good
     * 9 Winds are coming
     * 19 Winds are coming
     *
     * -----------------------
     * 5 Winds are coming
     * 8 I am good
     * 19 Winds are coming
     *
     *
     * timestamp -> 5
     * */

    HashMap<String, Integer> hashMap = new HashMap<>();
    //5 -> Winds are coming

}
