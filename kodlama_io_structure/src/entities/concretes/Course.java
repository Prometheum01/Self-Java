package entities.concretes;

public class Course {

    private int id;

    private String courseName;
    private String courseImage;

    private String instructorName;
    private String instructorImage;

    private double price;

    public Course(int id, String courseName, String courseImage, String instructorName, String instructorImage,
            double price) {
        this.id = id;
        this.courseName = courseName;
        this.courseImage = courseImage;
        this.instructorName = instructorName;
        this.instructorImage = instructorImage;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorImage() {
        return instructorImage;
    }

    public void setInstructorImage(String instructorImage) {
        this.instructorImage = instructorImage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
