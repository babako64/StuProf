package ir.maktab.hw6.DAO;

import java.util.ArrayList;

import ir.maktab.hw6.model.Teacher;

public interface TeacherDAO {

	public ArrayList<Teacher> getAll();

	public void add(Teacher st);

	public ArrayList<Teacher> getTeacher(int id);

	public void remove(int id);

	public void Update(int id, String TechName, String add);
}
