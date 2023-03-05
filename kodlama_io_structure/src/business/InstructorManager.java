package business;

import dataAccess.instructor_dao.InstructorDao;
import entities.concretes.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    public void addInstructor(Instructor instructor) throws Exception {
        if (instructor.getName().isEmpty()) {
            throw new Exception("Instructor name have to be!");
        }

        instructorDao.addInstructor(instructor);
    }

}