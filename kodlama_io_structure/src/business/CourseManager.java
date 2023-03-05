package business;

import core.logging.abstracts.Logger;
import dataAccess.course_dao.CourseDao;
import entities.concretes.Course;
import entities.concretes.Log;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void addCourse(Course course) throws Exception {

        if (course.getCourseName().isEmpty()) {
            throw new Exception("Course name can't be empty!");
        }

        else if (course.getCourseName() == "Before Courses Names") {
            throw new Exception("Course name have to be unique!");
        }

        else if (course.getPrice() <= 0) {
            throw new Exception("Course price can't be lower than 0!");
        }

        courseDao.addCourse(course);

        Log log = new Log(1, "Logger id 1", "03.05.2023", "13.55.42");

        for (Logger logger : loggers) {
            logger.log(log);
        }

    }

}
