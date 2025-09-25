-- 코드를 작성해주세요
select case 
    when MONTH(DIFFERENTIATION_DATE) between 1 and 3 then '1Q'
    when MONTH(DIFFERENTIATION_DATE) betweEn 4 and 6 then '2Q'
    when MONTH(DIFFERENTIATION_DATE) betweEn 7 and 9 then '3Q'
    when MONTH(DIFFERENTIATION_DATE) betweEn 10 and 12 then '4Q'
    END QUARTER,
    COUNT(*) ECOLI_COUNT
from ecoli_data
GROUP BY QUARTER;
