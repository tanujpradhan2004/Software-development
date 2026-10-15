select * from employees;

select dept from employees group by dept having count(*) = (
      select max(emp_count) from (
            select count(*) as emp_count from employees group by dept
	  )
);

select fname ,salary from employees where salary = (
      select max(salary) from employees 
) or salary < (
      select max(salary) from employees
) order by salary desc limit 3 ;


select fname , lname , dept ,salary from employees e1 where salary in (
      select salary from employees e2 where e2.salary = e1.salary and e2.fname != e1.fname
);

select * from employees where salary > (
      select avg(salary) from employees where lname like '%l' or lname like '%a' or lname like '%0' or lname like '%i' 
);

select dept from employees group by dept having count(*) = (
      select min(emp_c) from(
            select count(*) as emp_c from employees group by dept 
	  )
);

select fname from employees where dept = (
     select dept from employees group by dept having avg(salary) = (
      select max(avg_sal) from (
            select avg(salary) as avg_sal from employees group by dept 
	  )
	 )
);

select dept from employees group by dept having avg(salary) = (
     select min(avg_sal) from (
          select avg(salary) as avg_sal from employees group by dept 
	  
	 )
);

select * from employees where salary = (
      select max(salary) from employees
);

select * from employees where salary < (
      select max(salary) from employees 
)order by salary desc limit 1;

select * from employees where salary = (
      select max(salary) from employees where salary < (
            select max(salary) from employees
	  )
);

select * from employees where salary > (
      select avg(salary) from employees 
);


select * from employees where salary < (
      select avg(salary) from employees 
);

select dept from employees group by dept having max(salary) = (
      select max(max_sal) from (
           select max(salary) as max_sal from employees group by dept
	  )
);

select dept from employees group by dept having min(salary) = (
      select min(min_sal) from (
           select min(salary) as min_sal from  employees group by dept     
	  )
);

select * from employees where dept = (
      select dept from employees group by dept having avg(salary) = (
            select max(avg_sal) from(
                  select avg(salary) as avg_sal from employees group by dept
			)
	  )
);

select dept from employees group by dept having avg(salary) = (

       
      select max(avg_sal) from (
	         
            select avg(salary) as avg_sal from employees group by dept 
	  )  as avg_table where avg_sal < (
           select max(avg_sal) from (
                 select avg(salary) as avg_sal from employees group by dept 
		   ) as avg_table 2 
	  )
) ;






