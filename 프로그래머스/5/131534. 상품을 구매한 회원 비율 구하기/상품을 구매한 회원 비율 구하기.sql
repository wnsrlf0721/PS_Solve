-- 코드를 입력하세요
SELECT year(sales_date) YEAR, month(sales_date) MONTH, count(distinct users.user_id) PURCHASED_USERS, 
    ROUND(count(distinct users.user_id) / (select count(*) from user_info where year(joined) = 2021),1) PURCHASED_RATIO
from user_info users join online_sale sales
on users.user_id = sales.user_id
where year(users.joined) = 2021
group by year(sales_date), month(sales_date)
order by YEAR ASC, MONTH ASC