package dataAccess.course_dao;

import entities.concretes.Course;

public class CourseJdbc implements CourseDao {

    @Override
    public void addCourse(Course course) {

        System.out.println("Course added used Jdbc Database system.");

    }

}
