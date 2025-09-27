-- 코드를 입력하세요
select car_id, case
    when car_id in (select car_id
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where end_date >= '2022-10-16'and
start_date <= '2022-10-16') then '대여중'
    else '대여 가능'
    end availability
from
(select car_id from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id) total
order by car_id desc;