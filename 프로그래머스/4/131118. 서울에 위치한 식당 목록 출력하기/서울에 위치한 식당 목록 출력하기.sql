-- 코드를 입력하세요

SELECT info.rest_id, rest_name, food_type, favorites, address, round(avg(review_score),2) score
from rest_info info 
left JOIN rest_review review
on info.rest_id = review.rest_id
where address like '서울%'
group by info.rest_id
having score is not null
order by score desc;