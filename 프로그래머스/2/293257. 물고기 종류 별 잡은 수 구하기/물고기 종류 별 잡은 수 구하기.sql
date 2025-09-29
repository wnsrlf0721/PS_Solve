-- 코드를 작성해주세요
select count(fi.id) fish_count, fish_name
from fish_name_info fni
join fish_info fi
on fi.fish_type = fni.fish_type
group by fish_name
order by fish_count desc; 