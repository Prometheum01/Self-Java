package dataAccess.course_dao;

import entities.concretes.Course;

public class CourseHibernate implements CourseDao {
    @Override
    public void addCourse(Course course) {

        System.out.println("Course added used Hibernate Database system.");

    }

}
