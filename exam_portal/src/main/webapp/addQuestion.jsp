<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Question</title>
</head>

<body>
<form action="controller/addQuestionController"  method="post">

Enter Qid:
<input type="number" name="qid"><br>
Enter Question:
<input type="text" name="question"><br>
Enter Subject Name;
<select id ="subject">
               <option value = "level_one"></option>
               <option value = "level_two">Level 2</option>
               <option value = "level_three">Level 3</option>
                <option value = "level_three">Level 3</option>
                 <option value = "level_three">Level 3</option>
                  <option value = "level_three">Level 3</option>
              </select>

Enter Level Name:
 <select id ="levels">
               <option value = "level_one">Level 1</option>
               <option value = "level_two">Level 2</option>
               <option value = "level_three">Level 3</option>
              </select>

Enter Oid:
<input type="number" name="Oid"><br>

Enter Option:
<input type="text" name="options[0]"><br>
<input type="text" name="options"><br>
<input type="text" name="options"><br>
<input type="text" name="options"><br>



</form>

</body>
</html>