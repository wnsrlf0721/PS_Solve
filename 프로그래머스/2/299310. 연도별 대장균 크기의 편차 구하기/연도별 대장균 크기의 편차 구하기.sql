-- 코드를 작성해주세요
select year, maxSize - size_of_colony year_dev, id
from ecoli_data e
join (select year(differentiation_date) year, max(size_of_colony) maxSize
    from ecoli_data
    group by year) sq
on year(e.differentiation_date) = sq.year
order by year asc, year_dev asc;