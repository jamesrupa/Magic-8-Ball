import java.util.ArrayList;
import java.util.Arrays;

public class Fortunes {

    // VARIABLES
    public String output;
    public int answer;

    public ArrayList<String> fortunes = new ArrayList<>(
            Arrays.asList("Ask Again Later",
                    "My Sources Say No",
                    "Yes",
                    "Nope",
                    "You May Rely On It",
                    "Maybe",
                    "Absolutely",
                    "Most Likely",
                    "Signs Point To Yes",
                    "It Is Certain",
                    "Reply Hazy, Try Again",
                    "Ask Again Later",
                    "Don't Bet On It",
                    "Outlook Good"));

    public Fortunes() {


    }

    // GETTER
    public String getOutput() {

        // ALGORITHM 1 --> PULLS A RANDOM NUMBER AND RELATES IT TO THE LIST
        // LATER SENDS THAT INFORMATION TO ALGORITHM 2

        answer = (int)(Math.random() * fortunes.size());
        output = fortunes.get(answer);
        return output;
    }

}
