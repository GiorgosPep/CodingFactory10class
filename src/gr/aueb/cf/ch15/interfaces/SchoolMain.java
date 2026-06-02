package gr.aueb.cf.ch15.interfaces;

public class SchoolMain {

    public static void main(String[] args) {
        ISchoolService studentService = new StudentServiceImpl();
        ISchoolService teacherService = new TeacherServiceImpl();

        GenericSchoolServiceProvider genericSchoolServiceProvider1 = new GenericSchoolServiceProvider(studentService);
        GenericSchoolServiceProvider genericSchoolServiceProvider2 = new GenericSchoolServiceProvider(teacherService);

        genericSchoolServiceProvider1.register();
        genericSchoolServiceProvider2.register();

        genericSchoolServiceProvider1.unregister();
        genericSchoolServiceProvider2.unregister();
    }
}
