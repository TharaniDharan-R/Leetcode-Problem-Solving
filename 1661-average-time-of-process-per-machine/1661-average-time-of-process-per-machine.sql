# Write your MySQL query statement below
SELECT a.machine_id,
       ROUND(
           SUM(a.timestamp - a2.timestamp) / COUNT(a.process_id),
           3
       ) AS processing_time
from Activity a
join activity a2
on a.machine_id = a2.machine_id and a.process_id = a2.process_id 
where a2.activity_type ='start' and a.activity_type ='end'

group by machine_id


