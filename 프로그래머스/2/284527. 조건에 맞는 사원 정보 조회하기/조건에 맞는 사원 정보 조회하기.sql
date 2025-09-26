-- 코드를 작성해주세요
select score, mk.emp_no, emp_name, position, email
from hr_employees hr,
    (select sum(score) score, emp_no
    from hr_grade
    group by emp_no
    order by score desc
     limit 1
    ) mk
where hr.emp_no = mk.emp_no;