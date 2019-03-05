package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours) {
        hostLecture(instructors.findById(id), numberOfHours);
    }

    public int getTotalHoursStudied() {
        return  students.getTotalHoursStudied();
    }
}
