ackage com.course_manager.services;

import com.course_manager.entities.Course;

import java.util.List;

public interface CourseService {

    //  C
    Course addCourse(Course course);

    //  R
    public List<Course> getCourses();

    Course getCourse(long id);

    //  U
    Course updateCourse(Course course);

    //  D
    void deleteCourse(long id);


}