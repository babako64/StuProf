package ir.maktab.hw6.api;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ir.maktab.hw6.DAO.StudentDAOImp;
import ir.maktab.hw6.model.Student;


@Path("/students")
public class Students {

StudentDAOImp stDAO = new StudentDAOImp();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addStudent(Student st) {
		
		stDAO.add(st);
	}
	
	@DELETE
	@Path("/{stid}")
	public void delete(@PathParam("stid") String stid) {
		
		stDAO.remove(Integer.parseInt(stid));
		
	}
	
	@DELETE
	public void delete() {
		
		stDAO.removeAll();
		
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(Student st,@PathParam("id") String id) {
		
		stDAO.Update(st.getId(), st.getName(), st.getDept(), st.getSuperVisorId());
		
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public  ArrayList<Student> get(@PathParam("id") String id) {
		
		ArrayList<Student> stList = new ArrayList<>();
		Student st;
		stList = stDAO.getStudent(Integer.parseInt(id));
		st = stList.get(0);
		System.out.println(st.getId() + st.getName() + st.getDept() + st.getSuperVisorId());
		return stList;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Student> get() {
		ArrayList<Student> stList = new ArrayList<>();
		//Student st;
		stList =stDAO.getAll();
		return stList;
	}
}
