# Write your MySQL query statement below
select date_format(t.trans_date,'%Y-%m') as month,
t.country, 
count(t.trans_date) as trans_count,
count(case when t.state ="approved" then 1 else null end)  as approved_count,
sum(t.amount) as trans_total_amount,
sum(case when t.state ="approved" then amount else 0 end)  as approved_total_amount

from Transactions t
group by month, t.country
