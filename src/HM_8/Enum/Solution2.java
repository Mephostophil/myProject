package HM_8.Enum;

public class Solution2 {
    /*
    Implement enum Week, that each element has the name of the week (String) and the number of weekday (int)
    Print these values to the console in the formant - Monday - day of the week: 1
     */
    public static void main(String[] args) {
        for (Week week : Week.values()) {
            System.out.println(week.name() + " - " + week.number);
        }

    }


    public enum Week {
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6),
        SUNDAY(7);

        private int number;

        private Week(int number) {
            this.number = number;
        }

    }
}