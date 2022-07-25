package spring.di.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//@Repository
public class NewlecExam implements Exam {
    @Value("20")
    private int kor;
    @Value("30")
    private int eng;
    private int math;
    private int com;

    @Override
    public int total() {
        return kor + eng + math + com;
    }

    public NewlecExam(){}
    @Autowired(required = false)
    public NewlecExam(int kor, int eng, int math, int com) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.com = com;
    }

    @Override
    public float avg() {
        return total() / 4.0f;
    }


    @Override
    public String toString() {
        return "NewlecExam{" +
                "kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", com=" + com +
                '}';
    }
}
