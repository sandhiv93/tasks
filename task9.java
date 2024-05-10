//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class task9 {
    public static void main(String[] args) {
        int count = 0, num = 0003452;

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}