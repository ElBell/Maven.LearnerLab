package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static String[] names = new String[]{"Arcelia", "Ajah",
    "Alex", "Ashley B.", "Ashley S.", "Aswathy", "Brian",
    "Cara", "Charles", "Cristina", "David", "Davis", "Delenda",
    "Eleonor", "Eric", "Francisco", "Jim", "Joseph", "Julian",
    "Jutta", "Kat", "Kate", "Kyle", "Laxmi", "Leah", "Mark", "Marlys",
    "Marshilla", "Michael", "Neela", "Nirmala", "Reese",
    "Robyn", "Sean Green", "Sean Grey", "Shuchi", "Sravani",
    "Sunhyun", "Swampna", "Swathi", "William", "Yang", "Zaina"};

    private static final Students INSTANCE = new Students();

    public static Students getInstance() {
        return INSTANCE;
    }

    private Students() {
        for (int i = 0; i < 43; i++) {
            Student newStudent = new Student((long)i, names[i]);
            newStudent.learn(400);
            add(newStudent);
        }
    }

    public int getTotalHoursStudied() {
        int totalHours = 0;
        for (int i = 0; i < getArray().length; i++) {
            Student student = findById(i);
            totalHours += student.getTotalStudyTime();
        }
        return totalHours;
    }

    @Override
    public Student[] getArray() {
        return getArray(new Student[getCount()]);
    }

}
