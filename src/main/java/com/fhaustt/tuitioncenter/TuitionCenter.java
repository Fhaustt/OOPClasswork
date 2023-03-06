package com.fhaustt.tuitioncenter;

import java.util.ArrayList;
import java.util.List;
public class TuitionCenter {
    private String centerAddress;
    private HeadMaster headMaster;
    private List<Tutor> tutors;
    private List<Student> students;

    public TuitionCenter(String centerAddress, HeadMaster headMaster, List<Tutor> tutors, List<Student> students) {
        this.centerAddress = centerAddress;
        this.headMaster = headMaster;
        this.tutors = tutors;
        this.students = students;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public int getNumberOfTutors() {
        return tutors.size();
    }

    public double getAvgMarks() {
        double sum = 0.0;
        for (Student student : students) {
            List<Double> scores = student.getScores();
            for (Double score : scores) {
                sum += score;
            }
        }
        return sum / (students.size() * students.get(0).getScores().size());
    }

    public double getMinMarks() {
        double min = Double.MAX_VALUE;
        for (Student student : students) {
            List<Double> scores = student.getScores();
            for (Double score : scores) {
                if (score < min) {
                    min = score;
                }
            }
        }
        return min;
    }

    public double getMaxMarks() {
        double max = Double.MIN_VALUE;
        for (Student student : students) {
            List<Double> scores = student.getScores();
            for (Double score : scores) {
                if (score > max) {
                    max = score;
                }
            }
        }
        return max;
    }

    public List<String> getTutorsBackground() {
        List<String> backgrounds = new ArrayList<>();
        for (Tutor tutor : tutors) {
            backgrounds.add(tutor.getQualification());
        }
        return backgrounds;
    }
}

