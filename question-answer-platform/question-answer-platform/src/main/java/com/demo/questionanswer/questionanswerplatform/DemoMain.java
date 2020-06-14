package com.demo.questionanswer.questionanswerplatform;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.questionanswer.questionanswerplatform.entity.Company;
import com.demo.questionanswer.questionanswerplatform.entity.Question;
import com.demo.questionanswer.questionanswerplatform.entity.Tag;

public class DemoMain {

	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Question.class)
				.addAnnotatedClass(Company.class).addAnnotatedClass(Tag.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// start transaction
			session.beginTransaction();

			// get the instructor from db
//			int id = 1;
//			//Question(String questionText, int subtopicId, int userId, List<Company> companies, List<Tag> tagList)
//			Question question = new Question("QuestionText",1,1,null,null);
//			session.save(question);
			
			
			
			
//			Instructor tempInstructor = session.get(Instructor.class, id);

			// create some course
//			Course course = new Course("Hindi");
//			Course course1 = new Course("Engllish");

			// add courses to instructor
//			tempInstructor.add(course);
//			tempInstructor.add(course1);

			// save the courses
//			session.save(course);
//			session.save(course1);

			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!!");
		} finally {
			// close the session
			session.close();
			factory.close();
		}

		System.out.println("Hello!!");
	}
}
