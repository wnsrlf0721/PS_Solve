-- 코드를 작성해주세요
select count(id) fish_count, max(length) max_length, fish_type
from FISH_INFO
group by fish_type
having avg(ifnull(length,10)) >= 33
order by fish_type asc;