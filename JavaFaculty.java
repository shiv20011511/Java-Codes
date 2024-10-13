class Faculty {
    String designation = "professor Shivkant Pandey";
    String collegeName = "AIIT";
    void does() {
        System.out.println("Teaching");
    }
}
public class JavaFaculty extends Faculty {
    String mainSubject = "JAVA";
    void hacking() {
        System.out.println("Programming is my hobby");
    }
    public static void main(String args[]) {
        JavaFaculty obj = new JavaFaculty();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
        obj.hacking();
    }
}
