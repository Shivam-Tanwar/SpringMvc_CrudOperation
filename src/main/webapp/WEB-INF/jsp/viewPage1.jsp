<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>This is the sign up page of form</h1>

<h2>Employee Registration or Sign up Page</h2><br>    
       
    <form:form method="post" action="Register">    
        <label><b>Employee Name    
        </b>    
        </label>    
        <input  path="name"/>    
        <br><br>    
        <label><b>Employee id    
        </b>    
        </label>    
        <input path="id"/>    
        <br><br>    
        <input type="submit" value="Save"/>       
            
     </form:form>
    
   
    
