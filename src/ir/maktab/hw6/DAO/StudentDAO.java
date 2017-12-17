package ir.maktab.hw6.DAO;

import java.util.ArrayList;

import ir.maktab.hw6.model.Student;

public interface StudentDAO {

	public ArrayList<Student> getAll();

	public void add(Student st);

	public ArrayList<Student> getStudent(int id);

	public void remove(int id);

	public void Update(int id, String stName, String dept, int profID);
}
