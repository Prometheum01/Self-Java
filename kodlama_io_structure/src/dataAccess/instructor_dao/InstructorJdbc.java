package dataAccess.instructor_dao;

import entities.concretes.Instructor;

public class InstructorJdbc implements InstructorDao {

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Instructor added used Jdbc Database system.");
    }

}
