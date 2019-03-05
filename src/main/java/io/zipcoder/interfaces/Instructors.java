package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    private static String[] names = new String[]{"Kris", "Leon",
            "Dolio", "Froilan", "Nhu", "Melanie", "Wilhem"};

    private static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    private Instructors() {
        for (int i = 0; i < 7; i++) {
            Instructor newInstructor = new Instructor(i);
            newInstructor.setName(names[i]);
            add(newInstructor);
        }
    }

    @Override
    public Instructor[] getArray() {
        return getArray(new Instructor[getCount()]);
    }
}
