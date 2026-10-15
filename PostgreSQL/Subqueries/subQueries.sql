-- single row subquery
select * from employees   where  salary >  (
      select avg(salary) from employees where dept = 'IT'
);

-- multi row subquery
select fname ,lname from employees where id in (
      select id from employees where dept in('IT','HR')
);

-- coreltaed sub query
select fname , dept from employees e1 where salary > (
      select avg(salary) from employees e2 
	        where 
			     e2.dept = e1.dept 
) ;

-- nested subquery
select email from employees where id in (
      select id from employees where dept = (
            select 'IT'
	  )
);

-- not in operator 
select fname, dept from employees where dept not in(
      select dept from employees where dept in ('HR', 'IT')
);

-- exist operator
select * from employees e1 where  exists (
      select dept from employees e2 where e2.dept = e1.dept
);

select dept from employees e1 where not exists (
      select dept from employees e2 where e2.dept = e1.dept
);

-- any operator
select fname , salary, dept from employees where salary > any(
      select salary from employees where dept = 'Finance'
);

select fname , salary, dept from employees where salary < any(
      select salary from employees where dept = 'Finance'
);

-- all operator 
select fname , salary, dept from employees where salary < all (
      select salary from employees where dept = 'Finance'
);

select fname from employees where salary > all (
      select salary from employees where dept = 'Finance'
);

