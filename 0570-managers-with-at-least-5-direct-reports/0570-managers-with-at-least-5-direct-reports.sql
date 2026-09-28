# Write your MySQL query statement below
select e1.name
from employee e1
join employee m1
on e1.id=m1.managerId
group by m1.managerId
having count(m1.managerId)>=5;
