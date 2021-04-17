package max.edu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
public static boolean hasDuplicates(int[] array){
    Arrays.sort(array);
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] == array[i + 1]) {

            return true;
        }
        }
    return false;
}
    public static void main(String[] args) {
	int [] array = {1, 78 , 67, 25, 76, 24, 78};
        System.out.println(hasDuplicates(array));
        String s1 = "Hello, world!";
        StringBuilder sb = new StringBuilder(s1);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);

        Student john = new Student("John" , LocalDate.of(1999,02,24), 48);
        Student sarah = new Student("Sarah" , LocalDate.of(1998, 05 , 12), 98);
        Student nick = new Student( "Nick", LocalDate.of(2000, 07, 5), 65);
        Student jake = new Student( "Jake", LocalDate.of(1999, 03, 8), 49);
        Student lucie = new Student( "Lucie", LocalDate.of(1997, 04, 28), 99);
        List<Student> students = new ArrayList<>();
        students.add(john);
        students.add(sarah);
        students.add(nick);
        students.add(jake);
        students.add(lucie);
        for (Student student:students){
//            if (student.getbDAy().getYear() < 1998) System.out.println(student.getName());
       }
        students.stream().filter(student -> student.getGrade() > 50)
                .forEach(System.out::println);
        System.out.println(students.stream().filter(el -> el.getGrade() > 80).count());
        System.out.println(students.stream().min(Comparator.comparing(student -> student.getbDAy())));
        System.out.println(students.stream().mapToInt(student -> student.getGrade()).max().getAsInt());
        System.out.println(students.stream().mapToInt(student -> student.getGrade()).min().getAsInt());
        System.out.println(students.stream().mapToInt(student -> student.getGrade()).sum());
        System.out.println(students.stream().mapToInt(student -> student.getGrade()).average().getAsDouble());
        System.out.println(students.stream().count());
        PartTimeEmployer ivan = new PartTimeEmployer("Ivan", 15, 20 );
        FullTimeEmployer vova = new FullTimeEmployer("Vova", 2, 20, "Coder");
        List<IAccounting> workers = new ArrayList<>();
        workers.add(ivan);
        workers.add(vova);
    }
}
