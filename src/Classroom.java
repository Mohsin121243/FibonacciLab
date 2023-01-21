public class Classroom
{
    private Student[] classRoster;
    private String[] spaces;

    public Classroom(int numStudents)
    {
        classRoster = new Student[numStudents];
    }

    // getter method: returns a reference to classRoster array
    public Student[] getClassRoster()
    {
        return classRoster;
    }

    /** Adds student to the next available index in classRoster array
     (when iterating left to right) and return true to indicate
     student was successfully added.
     If the array is already maxed out (i.e. the class roster is full),
     do not add the Student and return false.
     */
    public boolean addStudent(Student student)
    {
        for(int x = 0; x < classRoster.length;x++){
           if(classRoster[x] == null){
               classRoster[x] = student;
               return true;
           }
        }
        return false;
    }

    /** Returns the class exam average determined by adding
     adding up all exams taken by all students and dividing
     by total number of exam scores
     */
    public double classExamAverage()
    {
        int y = 0;
        int a = 0;
        for(Student x : classRoster) {
            if (x != null) {
                for (int z = 0; z < x.getExamScores().length; z++)
                    y = y + (x.getExamScores())[z];
                    a = a + x.getExamScores().length;
            }

        }
        return y/a;

        }


    /** Prints class roster by printing all non-null students
     in the order they appear in classRoster, one per line,
     in the format; last name, first name;
     any null values in classRoster are not printed
     */
    public void printRoster()
    {
        for(int x = 0; x<classRoster.length;x++){
            if(classRoster[x]!= null){
            Student temp = classRoster[x];
            System.out.println(temp.getLast() +", " + temp.getFirst());
        }
    }

}


}