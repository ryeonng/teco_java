package basic.ch19;

import java.util.Iterator;

public class Classroom {

	private String className;
	private Student[] students;
	// Student 를 담을 수 있는 메모리 공간 의미
	private int studentCount;
	private final int MAX_STUDENT = 30; // 한 학급에 담을 수 있는 인원

	public Classroom(String className) {
		this.className = className;
		students = new Student[MAX_STUDENT]; // 배열
		this.studentCount = 0; // 0으로 초기화
	}

	// 학생을 추가하는 기능(메서드) 만들기
	public void addStudent(Student student) {
		// 방어적 코드 (정원 초과 방지)
		if (studentCount < MAX_STUDENT) {
			students[studentCount] = student;
			studentCount++; // 후의연산자
		} else {
			System.out.println("정원 초과");
		}

	}

	// 학급에 속한 모든 학생의 정보를 출력하는 기능을 만드시오.
	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			// 방어적코드
			if (students[i] != null) {
				// students[i] --> [객체주소] --> heap 영역 객체를 참조
				System.out.println("name : " + students[i].getName() + "age :" + students[i].getAge());
			}

		}
	}

}
