package dataAccess.instructor_dao;

import entities.concretes.Instructor;

public class InstructorHibernate implements InstructorDao {

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Instructor added used Hibernate Database system.");
    }

}
