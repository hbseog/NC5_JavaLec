package chap10_abstraction;

import chap10_abstraction.school.ComputerSchool;
import chap10_abstraction.school.EnglishSchool;
import chap10_abstraction.school.Schools;

public class _01_abstraction {
    public static void main(String[] args) {
        Schools schools = new ComputerSchool();
        schools.homework();
        schools.check();
        schools.rest();
        schools.teaching();
        schools = new EnglishSchool();
        schools.homework();
        schools.check();
        schools.rest();
        schools.teaching();
    }
}
