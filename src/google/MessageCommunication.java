package google;


import java.util.HashMap;

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

    HashMap<Integer,String> hashMap = new HashMap<>();
    //5 -> Winds are coming

    public void onMessage(String message) {
        String[] words = message.split(" ");
        //5|Winds|are|coming|
    }
}
