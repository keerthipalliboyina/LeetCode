# Write your MySQL query statement below
WITH cte AS
(SELECT D.name AS Department,E.name AS Employee,E.salary AS Salary,
MAX(Salary)OVER(PARTITION BY d.name ORDER BY e.salary DESC) AS MX_salary
FROM 
Employee E
JOIN
Department D
ON
E.departmentId=D.id)
SELECT Department,Employee,Salary FROM cte
WHERE Salary=MX_salary;