public class CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Day: ");
        String day = sc.nextLine();

        System.out.print("Enter Time: ");
        String time = sc.nextLine();

        System.out.println("\n--- Course Registration ---");
        System.out.println("Student: " + name);
        System.out.println("Course: " + course);

        System.out.println("\n--- Time Table ---");
        System.out.println("Day: " + day);
        System.out.println("Time: " + time);
        System.out.println("Registration Successful!");

        sc.close();
    }
}