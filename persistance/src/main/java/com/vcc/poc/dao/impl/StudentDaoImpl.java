		package com.vcc.poc.dao.impl;
		
		import java.util.List;
		
		import org.apache.commons.logging.Log;
		import org.apache.commons.logging.LogFactory;
		import org.hibernate.HibernateException;
		import org.hibernate.Query;
		import org.hibernate.SessionFactory;
		import org.hibernate.internal.SessionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vcc.poc.dao.StudentDao;
		import com.vcc.poc.model.Student;
		
		public class StudentDaoImpl implements StudentDao{
		
		private static final transient Log LOG = LogFactory.getLog(StudentDaoImpl.class);
			
		    /** The session factory. */
		    private SessionFactory sessionFactory;
		
		    /** The q. */
		    private Query q = null;
		
		    /** The Constant findStudentByReference. */
		    private final static String findStudentByReference =
		       //  "select i from Student as i where i.studentRef = :ref";
		    		"select Student student from Student where student.studentRef = :ref";		
		    /** The Constant findStudent. */
		    private final static String findStudent =
		        "select Student student from Student";
		    
		    /**
		     * Sets the session factory.
		     * 
		     * @param sessionFactory the new session factory
		     */
		    public void setSessionFactory( SessionFactory sessionFactory )
		    {
		        this.sessionFactory = sessionFactory;
		    }
		
		    /*
		     * (non-Javadoc)
		     * @see org.apache.camel.example.reportincident.dao.IncidentDAO#findIncident()
		     */
		    @Transactional
		    public List<Student>  findStudent()
		        throws HibernateException
		    {
		
		        // Prepare query
		        //q = this.sessionFactory.getCurrentSession().createQuery( findStudent );
		        q=this.sessionFactory.getCurrentSession().createQuery("FROM Student ");
		        // Retrieve the Incidents from database
		        List<Student> list = q.list();
		
		        return list;
		
		    }
		
		    /*
		     * (non-Javadoc)
		     * @see org.apache.camel.example.reportincident.dao.IncidentDAO#getIncident(long)
		     */
		    @Transactional
			public Student getStudent(int id) 
		    {
		        return (Student) this.sessionFactory.getCurrentSession().get( Student.class, id );
		    }
		
		
		    /*
		     * (non-Javadoc)
		     * @see org.apache.camel.example.reportincident.dao.IncidentDAO#saveIncident(org.apache.camel.example.reportincident.model.Incident)
		     */
		    @Transactional
			public void saveStudent(Student Student)
		    {
		    	SessionImpl session = (SessionImpl) this.sessionFactory.getCurrentSession();
		        this.sessionFactory.getCurrentSession().persist(Student);
		    }
			
			
		}
