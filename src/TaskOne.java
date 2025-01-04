import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskOne {

    public int solution(String S) {

        if (S == null || S.isEmpty()) {
            System.out.println("Please provide some digits");
            return 0;
        }

        if (!S.chars().allMatch(Character::isDigit)) {
            System.out.println("Error 404: Input contains non-digit characters. Please enter only digits.");
            return 404;
        }

        List<Character> oddDigits = new ArrayList<>();
        List<Character> evenDigits = new ArrayList<>();

        for (char c : S.toCharArray()) {
            if ((c - '0') % 2 != 0) {
                oddDigits.add(c);
            } else {
                evenDigits.add(c);
            }
        }

        List<String> combo = new ArrayList<>();

        if (evenDigits.size() >= oddDigits.size()) {
            for (int i = 0; i < oddDigits.size(); i++) {
                combo.add("" + evenDigits.get(i) + oddDigits.get(i));
            }
        } else {
            for (int i = 0; i < evenDigits.size(); i++) {
                combo.add("" + evenDigits.get(i) + oddDigits.get(i));
            }
            Collections.reverse(oddDigits);
            for (int i = evenDigits.size() - 1; i >= 0; i--) {
                oddDigits.remove(i);
            }
            if (oddDigits.size() > 1) {
                for (int i = 0; i < oddDigits.size()-1; i += 2) {
                    combo.add(oddDigits.get(i) + oddDigits.get(i + 1).toString());
                }
            }
        }

        return combo.size();
    }
}
