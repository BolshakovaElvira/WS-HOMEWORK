import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void totalScholarshipMax() {
        Student student = new Student("Экономичсекий факультет","Дуброва И.И");
        student.setScholarship(3500);
        double actual = student.TotalScholarship();

        int expected = 4900;
        assertEquals(expected,actual);
    }
    @Test
    void totalScholarshipMin() {
        Student student = new Student("Экономичсекий факультет","Дуброва И.И");
        student.setScholarship(450);
        double actual = student.TotalScholarship();
        int expected = 450;
        assertEquals(expected,actual);
    }
}