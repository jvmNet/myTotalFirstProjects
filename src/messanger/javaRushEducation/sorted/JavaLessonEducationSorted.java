package messanger.javaRushEducation.sorted;


public class JavaLessonEducationSorted {
    public static void main(String[] args) {

        closeToTen(8, 11);
        closeToTen(14, 7);

    }

    public static void closeToTen(int a, int b) {

        System.out.println(10 - a < 10 - b ? a : b);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
