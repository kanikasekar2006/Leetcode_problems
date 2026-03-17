# Write your MySQL query statement below

select employee_id from Employees where Manager_id NOT IN( select employee_id from Employees) and salary<30000 order by employee_id;