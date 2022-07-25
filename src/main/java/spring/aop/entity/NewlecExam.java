package spring.aop.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//@Repository
public class NewlecExam implements Exam {
    private int kor;
    private int eng;
    private int math;
    private int com;

    public NewlecExam() {
    }

    @Autowired(required = false)
    public NewlecExam(int kor, int eng, int math, int com) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.com = com;
    }

    @Override
    public int total() {
        int result = kor + eng + math + com;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return result;
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