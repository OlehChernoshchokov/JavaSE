/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortstudents;

import java.util.Arrays;

/**
 *
 * @author new
 */
public class SortStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
            /* Создание массива объектов Student */

            Student[] students = new Student[3];
            students[0] = new Student(52645, "Smith", "Bob");
            students[1] = new Student(98765, "Jones", "Will");
            students[2] = new Student(1354, "Johnson", "Matt");

            /* Сортировка массива */
            Arrays.sort(students);

            /* Печать отсортированных значений */
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].student_id
                        + students[i].last_name + students[i].first_name);
            }

        }

    }
}
